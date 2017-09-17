package com.kalapuneet.glowroad;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class FeedPostViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private AppCompatTextView allPremiumPosts;
    private AppCompatImageView shopImage;
    private AppCompatTextView shopName;
    private AppCompatTextView shopLocation;
    private AppCompatTextView shopTagLine;
    private AppCompatTextView follow;
    private AppCompatTextView postContent;
    private AppCompatImageView productImage1;
    private AppCompatImageView productImage2;
    private AppCompatImageView productImage3;
    private AppCompatTextView remainingImageCount;
    private AppCompatTextView moreProductsBy;
    private AppCompatImageView otherProduct1;
    private AppCompatImageView otherProduct2;
    private AppCompatImageView otherProduct3;
    private AppCompatImageView otherProduct4;
    private AppCompatImageView otherProduct5;
    private AppCompatImageView otherProduct6;
    private AppCompatTextView like;
    private AppCompatImageView comment;
    private AppCompatImageView forward;
    private AppCompatImageView more;
    private RecyclerView commentRv;
    private AppCompatImageView profilePicture;
    private AppCompatEditText commentEt;
    private AppCompatTextView commentBtn;
    private Post post;
    private Context context;

    public void setData(Post post) {
        this.post = post;
        shopName.setText(post.getUserName());
        shopLocation.setText(post.getUserLocation());
        shopTagLine.setText(post.getUserSubtitle());
        follow.setOnClickListener(this);
        postContent.setText(post.getPostContent());
        remainingImageCount.setText(post.getPostImages().size() - 1);
        moreProductsBy.setText("MORE PRODUCTS BY " + post.getUserName());
        like.setText(post.getLikes());
        comment.setOnClickListener(this);
        forward.setOnClickListener(this);
        more.setOnClickListener(this);
        commentRv.setLayoutManager(new LinearLayoutManager(context));
        commentBtn.setOnClickListener(this);
    }

    public FeedPostViewHolder(View itemView, Context context) {
        super(itemView);
        this.context = context;
        allPremiumPosts = (AppCompatTextView) itemView.findViewById(R.id.all_premium_posts);
        shopImage = (AppCompatImageView) itemView.findViewById(R.id.shop_image);
        shopName = (AppCompatTextView) itemView.findViewById(R.id.shop_name);
        shopLocation = (AppCompatTextView) itemView.findViewById(R.id.shop_location);
        shopTagLine = (AppCompatTextView) itemView.findViewById(R.id.shop_tag_line);
        follow = (AppCompatTextView) itemView.findViewById(R.id.follow);
        postContent = (AppCompatTextView) itemView.findViewById(R.id.post_content);
        productImage1 = (AppCompatImageView) itemView.findViewById(R.id.product_image_1);
        productImage2 = (AppCompatImageView) itemView.findViewById(R.id.product_image_2);
        productImage3 = (AppCompatImageView) itemView.findViewById(R.id.product_image_3);
        remainingImageCount = (AppCompatTextView) itemView.findViewById(R.id.remaining_image_count);
        moreProductsBy = (AppCompatTextView) itemView.findViewById(R.id.more_products_by);
        otherProduct1 = (AppCompatImageView) itemView.findViewById(R.id.other_product_1);
        otherProduct2 = (AppCompatImageView) itemView.findViewById(R.id.other_product_2);
        otherProduct3 = (AppCompatImageView) itemView.findViewById(R.id.other_product_3);
        otherProduct4 = (AppCompatImageView) itemView.findViewById(R.id.other_product_4);
        otherProduct5 = (AppCompatImageView) itemView.findViewById(R.id.other_product_5);
        otherProduct6 = (AppCompatImageView) itemView.findViewById(R.id.other_product_6);
        like = (AppCompatTextView) itemView.findViewById(R.id.like);
        comment = (AppCompatImageView) itemView.findViewById(R.id.comment);
        forward = (AppCompatImageView) itemView.findViewById(R.id.forward);
        more = (AppCompatImageView) itemView.findViewById(R.id.more);
        commentRv = (RecyclerView) itemView.findViewById(R.id.comment_rv);
        profilePicture = (AppCompatImageView) itemView.findViewById(R.id.profile_picture);
        commentEt = (AppCompatEditText) itemView.findViewById(R.id.comment_et);
        commentBtn = (AppCompatTextView) itemView.findViewById(R.id.comment_btn);
    }

    @Override
    public void onClick(View v) {

    }
}
