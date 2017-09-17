package com.kalapuneet.glowroad;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CommentAdapter extends RecyclerView.Adapter<CommentViewHolder> {

    private ArrayList<Comment> comments;

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public CommentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_comment,parent,false);
        return new CommentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CommentViewHolder holder, int position) {
        if (position > -1 && position < comments.size()) {
            holder.setComment(comments.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return comments.size();
    }
}
