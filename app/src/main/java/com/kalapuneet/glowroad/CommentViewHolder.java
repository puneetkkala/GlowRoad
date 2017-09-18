package com.kalapuneet.glowroad;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.telephony.PhoneNumberUtils;
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
    private Context context;

    public void setComment(Comment comment, Context context) {
        this.comment = comment;
        this.context = context;
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
        whatsapp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.whatsapp: {
                Intent sendIntent = new Intent("android.intent.action.MAIN");
                sendIntent.putExtra("jid", "919740244566" + "@s.whatsapp.net");
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is a test message");
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setPackage("com.whatsapp");
                sendIntent.setType("text/plain");
                context.startActivity(sendIntent);
                break;
            }
        }
    }
}
