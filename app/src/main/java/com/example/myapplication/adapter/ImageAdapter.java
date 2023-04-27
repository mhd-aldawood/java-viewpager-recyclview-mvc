package com.example.myapplication.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.model.Banner;

import java.util.List;
import java.util.Objects;

public class ImageAdapter extends PagerAdapter {
    Context mContext;
    public String bannerBaseUrl;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    List<Banner> list;
    public ImageAdapter(Context context, List<Banner> banners, String banner_base_url) {
        this.mContext = context;
        this.list=banners;
        this.bannerBaseUrl=banner_base_url;
    }

//    @Override
//    public boolean isViewFromObject(View view, Object object) {
//        return view == ((ImageView) object);
//    }

    private int[] sliderImageId = new int[]{
            //R.drawable.image1, R.drawable.image2, R.drawable.image3,R.drawable.image4, R.drawable.image5,
    };
    LayoutInflater mLayoutInflater;
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
//        View itemView = mLayoutInflater.inflate(R.layout.slider_item, container, false);
        mLayoutInflater= LayoutInflater.from(mContext);
        View imageLayout = mLayoutInflater.inflate(R.layout.slider_item, container, false);
        final ImageView imageView = (ImageView) imageLayout
                .findViewById(R.id.imageViewMain);
        Glide.with(mContext)
                .load(bannerBaseUrl+list.get(position).getUrl())
                .into(imageView);
        container.addView(imageLayout);
        return imageLayout;
    }




    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        ((ViewPager) container).removeView((ImageView) object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public int getCount() {
        return list.size();
    }
}