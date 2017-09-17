package com.kalapuneet.glowroad;

import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class PostViewHolder extends RecyclerView.ViewHolder {

    private AppCompatImageView profilePicture;
    private AppCompatEditText postEt;

    public PostViewHolder(View itemView) {
        super(itemView);
        profilePicture = (AppCompatImageView) itemView.findViewById(R.id.profile_picture);
        postEt = (AppCompatEditText) itemView.findViewById(R.id.post_et);
    }
}
