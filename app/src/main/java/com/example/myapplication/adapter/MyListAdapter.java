package com.example.myapplication.adapter;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.model.Product;

import java.util.List;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>{
    private List<Product> listdata;
    private String product_base_url;
    // RecyclerView recyclerView;
    public MyListAdapter(String product_base_url, List<Product> listdata) {
        this.listdata = listdata;
        this.product_base_url=product_base_url;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Product myListData = listdata.get(position);
        holder.textView.setText(listdata.get(position).getName());
        holder.imageView.setImageURI(Uri.parse(product_base_url+listdata.get(position).getImage()));
        Glide.with(holder.imageView.getContext())
                .load(product_base_url+listdata.get(position).getImage())
                .into(holder.imageView);

    }


    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public LinearLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.ImageView);
            this.textView = (TextView) itemView.findViewById(R.id.TextView);
            relativeLayout = (LinearLayout)itemView.findViewById(R.id.relativeLayout);
        }
    }
}