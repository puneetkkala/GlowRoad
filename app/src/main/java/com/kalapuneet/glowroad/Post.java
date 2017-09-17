package com.kalapuneet.glowroad;

import java.util.ArrayList;

public class Post {
    private int postId;
    private String userPicture;
    private String userName;
    private String userLocation;
    private String userSubtitle;
    private String postContent;
    private ArrayList<String> postImages;
    private ArrayList<String> moreProducts;
    private int likes;
    private ArrayList<Comment> comments;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getUserSubtitle() {
        return userSubtitle;
    }

    public void setUserSubtitle(String userSubtitle) {
        this.userSubtitle = userSubtitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public ArrayList<String> getPostImages() {
        return postImages;
    }

    public void setPostImages(ArrayList<String> postImages) {
        this.postImages = postImages;
    }

    public ArrayList<String> getMoreProducts() {
        return moreProducts;
    }

    public void setMoreProducts(ArrayList<String> moreProducts) {
        this.moreProducts = moreProducts;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }
}
