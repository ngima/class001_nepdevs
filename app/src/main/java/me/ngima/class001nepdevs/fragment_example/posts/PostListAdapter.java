package me.ngima.class001nepdevs.fragment_example.posts;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import me.ngima.class001nepdevs.R;
import me.ngima.class001nepdevs.fragment_example.model.PostModel;

public class PostListAdapter extends RecyclerView.Adapter<PostViewHolder> {

    List<PostModel> postModels = new ArrayList<>();

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.item_post, viewGroup, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final PostViewHolder postViewHolder, int position) {
        PostModel postModel = postModels.get(position);

        postViewHolder.titleTextView.setText(postModel.mTitle);
        postViewHolder.descriptonTextView.setText(postModel.mDescription);

        Picasso.get().load(postModel.mImage).into(postViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return postModels.size();
    }

    //updates all the post list items in adapter
    public void setItems(List<PostModel> postModels){
        this.postModels = postModels;
        notifyDataSetChanged();
    }
    //adds post model at fist position
    public void addItemAtFirst(PostModel postModel){
        this.postModels.add(0, postModel);
        notifyItemChanged(0);
    }
    public void addItemAtIndex(int index, PostModel postModel){
        this.postModels.add(index, postModel);
        notifyItemChanged(index);
    }
}
