package com.example.heterorecycler;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by bipin on 2/21/18.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {
    private Context context;

    public MainAdapter(Context context) {
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 1) {
            return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.inner_vertical_parent, parent, false));
        } else {
            return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.inner_horizontal_parent, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(MainAdapter.MyViewHolder holder, int position) {
        if (holder.getAdapterPosition()%2 == 0) {
            VerticalAdapter verticalAdapter = new VerticalAdapter();
            holder.innerRv.setAdapter(verticalAdapter);
            holder.innerRv.setLayoutManager(new LinearLayoutManager(context));
        } else {
            HorizontalAdapter horizontalAdapter = new HorizontalAdapter();
            holder.innerRv.setAdapter(horizontalAdapter);
            holder.innerRv.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        }

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 2 == 0)
            return 1;
        else
            return 2;

    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        RecyclerView innerRv;

        public MyViewHolder(View itemView) {
            super(itemView);
            innerRv = itemView.findViewById(R.id.inner_rv);
        }
    }

}
