package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.example.myapplication.adapter.ImageAdapter;
import com.example.myapplication.adapter.MyListAdapter;
import com.example.myapplication.model.Example;
import com.example.myapplication.network.APIClient;
import com.example.myapplication.network.APIInterface;
import static android.Manifest.permission.INTERNET;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    APIInterface apiInterface;
    String product_base_url;
    String banner_base_url;
    private static final String TAG = "MainActivity";
    Example example;
    private static final int PERMISSION_REQUEST_CODE = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityCompat.requestPermissions(this, new String[]{INTERNET}, PERMISSION_REQUEST_CODE);


        apiInterface = APIClient.getClient().create(APIInterface.class);
        Call<Example> configCall = apiInterface.getConfig(1);
        configCall.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                example =
                        response.body();
                banner_base_url = example.getConfig().getBannerBaseUrl();
                product_base_url = example.getConfig().getPrductBaseUrl();
                setupViewPager();
                setupRecycleView();
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
            }
        });



    }

    private void setupRecycleView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        MyListAdapter adapter = new MyListAdapter(product_base_url,example.getProducts());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    public void  setupViewPager(){
        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPage);
        ImageAdapter adapterView = new ImageAdapter(this,example.getBanners(),banner_base_url);
        mViewPager.setAdapter(adapterView);
    }
}