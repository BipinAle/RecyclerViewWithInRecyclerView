package com.example.heterorecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by bipin on 2/21/18.
 */

public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.MyInnerViewHolder> {
    @Override
    public VerticalAdapter.MyInnerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyInnerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item, parent, false));
    }

    @Override
    public void onBindViewHolder(VerticalAdapter.MyInnerViewHolder holder, int position) {

        holder.textView.setText("Vertical item " + position);

    }

    @Override
    public int getItemCount() {
        return 20;
    }


    class MyInnerViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public MyInnerViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text);
        }
    }
}
