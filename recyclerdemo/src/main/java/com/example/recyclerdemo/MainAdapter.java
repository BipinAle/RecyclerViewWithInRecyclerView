package com.example.recyclerdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by bipin on 2/21/18.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {
    @Override
    public MainAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 1) {
            return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item_vertical, parent, false));
        } else {
            return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item_horizontal, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(MainAdapter.MyViewHolder holder, int position) {
        if (holder.getAdapterPosition()%2 == 0)
            holder.textView.setText("This is vertical " + position);
        else
            holder.textView.setText("This is horizontal " + position);

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
        TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text);
        }
    }

}
