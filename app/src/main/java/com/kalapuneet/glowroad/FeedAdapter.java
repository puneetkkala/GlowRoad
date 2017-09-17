package com.kalapuneet.glowroad;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FeedAdapter extends RecyclerView.Adapter {

    private ArrayList<Post> posts;
    private Context context;

    public void setPosts(ArrayList<Post> posts, Context context) {
        this.posts = posts;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case 0:return 0;
            case 1:return 1;
            default: return 2;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case 0: {
                View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_post,parent,false);
                return new PostViewHolder(itemView);
            }
            case 1: {
                View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_options, parent, false);
                return new OptionsViewHolder(itemView);
            }
            default: {
                View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_feed_post, parent, false);
                return new FeedPostViewHolder(itemView, context);
            }
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        switch (getItemViewType(position)) {
            case 0: {
                PostViewHolder holder = (PostViewHolder) viewHolder;
                break;
            }
            case 1: {
                OptionsViewHolder holder = (OptionsViewHolder) viewHolder;
                break;
            }
            default: {
                if (position > -1 && position < posts.size()) {
                    FeedPostViewHolder holder = (FeedPostViewHolder) viewHolder;
                    holder.setData(posts.get(position));
                }
                break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}
