package com.kalapuneet.glowroad;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;

public class CommentViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private AppCompatImageView userImage;
    private AppCompatTextView nameLocationContent;
    private AppCompatTextView whatsapp;
    private AppCompatTextView connect;
    private Comment comment;

    public void setComment(Comment comment) {
        this.comment = comment;
        String text = comment.getUserName() + ", " + comment.getUserLocation() + " " + comment.getCommentText();
        SpannableString styledString = new SpannableString(text);

        styledString.setSpan(new StyleSpan(Typeface.BOLD),
                styledString.toString().indexOf(comment.getUserName()),
                styledString.toString().indexOf(comment.getUserName()) + comment.getUserName().length(),
                0);
        styledString.setSpan(new ForegroundColorSpan(Color.BLUE),
                styledString.toString().indexOf(comment.getUserName()),
                styledString.toString().indexOf(comment.getUserName()) + comment.getUserName().length(),
                0);

        styledString.setSpan(new StyleSpan(Typeface.BOLD),
                styledString.toString().indexOf(comment.getUserLocation()),
                styledString.toString().indexOf(comment.getUserLocation()) + comment.getUserLocation().length(),
                0);
        styledString.setSpan(new ForegroundColorSpan(Color.GRAY),
                styledString.toString().indexOf(comment.getUserLocation()),
                styledString.toString().indexOf(comment.getUserLocation()) + comment.getUserLocation().length(),
                0);
        nameLocationContent.setText(styledString);
    }

    public CommentViewHolder(View itemView) {
        super(itemView);
        userImage = (AppCompatImageView) itemView.findViewById(R.id.user_image);
        nameLocationContent = (AppCompatTextView) itemView.findViewById(R.id.name_location_content);
        whatsapp = (AppCompatTextView) itemView.findViewById(R.id.whatsapp);
        connect = (AppCompatTextView) itemView.findViewById(R.id.connect);
    }

    @Override
    public void onClick(View v) {

    }
}