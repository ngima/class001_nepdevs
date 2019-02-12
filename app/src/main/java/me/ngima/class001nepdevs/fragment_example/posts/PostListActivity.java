package me.ngima.class001nepdevs.fragment_example.posts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import me.ngima.class001nepdevs.R;
import me.ngima.class001nepdevs.fragment_example.model.PostListResponse;
import me.ngima.class001nepdevs.fragment_example.utils.Utils;

public class PostListActivity extends AppCompatActivity {

    PostListAdapter postListAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_list);

        recyclerView = findViewById(R.id.recycler_view);
        postListAdapter = new PostListAdapter();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(postListAdapter);

        fetchData();
    }


    private void fetchData() {
        PostListResponse postListResponse = PostListResponse.parseFromJson(Utils.loadJSONFromAsset(this));

        if (postListResponse != null && postListResponse.mSuccess) {
            postListAdapter.setItems(postListResponse.mData);
        }else {
            Toast.makeText(this, "Something went wrong", Toast.LENGTH_SHORT).show();
        }
    }
}
