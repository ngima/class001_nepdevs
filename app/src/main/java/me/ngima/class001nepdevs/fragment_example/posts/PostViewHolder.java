package me.ngima.class001nepdevs.fragment_example.posts;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import me.ngima.class001nepdevs.R;

public class PostViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView titleTextView;
        TextView descriptonTextView;

    public PostViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image);
        titleTextView = itemView.findViewById(R.id.text_title);
        descriptonTextView = itemView.findViewById(R.id.text_description);
    }
}