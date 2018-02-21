package com.example.bipin.heterogenousrecyclerview.adapters;

 import android.support.v7.widget.RecyclerView;
 import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


 import com.example.bipin.heterogenousrecyclerview.R;
 import com.example.bipin.heterogenousrecyclerview.pojos.SingleHorizontal;

 import java.util.ArrayList;

/**
 * Created by dellxps on 2/22/2017.
 */

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.MyViewHolder> {

    ArrayList<SingleHorizontal> data = new ArrayList<>();

    public HorizontalAdapter(ArrayList<SingleHorizontal> data) {
        this.data = data;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_single_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.description.setText(data.get(position).getDesc());
        holder.title.setText(data.get(position).getTitle());
        holder.pubDate.setText(data.get(position).getPubDate());
        holder.image.setImageResource(data.get(position).getImages());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, description, pubDate;
        ImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
            pubDate = itemView.findViewById(R.id.published_date);
            image = itemView.findViewById(R.id.image_view);
        }
    }
}
