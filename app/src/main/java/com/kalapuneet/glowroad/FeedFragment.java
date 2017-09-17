package com.kalapuneet.glowroad;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FeedFragment extends Fragment {

    private View rootView;
    private RecyclerView feedRv;
    private ArrayList<Post> posts;

    private void generateData() {
        posts = new ArrayList<>();
        posts.add(new Post());
        posts.add(new Post());
        for (int i=1;i<10;i++) {
            Post post = new Post();
            post.setPostId(10000 + i);
            post.setUserPicture("");
            post.setUserName("Shop " + i);
            post.setUserLocation("Location " + i);
            post.setUserLocation("All clothes available " + i);
            post.setPostContent(getString(R.string.lorem_ipsum));
            ArrayList<String> postImages = new ArrayList<>();
            for (int j=0;j< (int) (Math.random() * 100) + 2;j++) {
                postImages.add(i + " " + j);
            }
            post.setPostImages(postImages);
            ArrayList<String> moreProducts = new ArrayList<>();
            for (int j=0;j< (int) (Math.random() * 100) + 2;j++) {
                moreProducts.add(i + " " + j);
            }
            post.setMoreProducts(moreProducts);
            post.setLikes(32 + (int) (Math.random() * 10));
            ArrayList<Comment> comments = new ArrayList<>();
            for (int j=1;j<4;j++) {
                Comment comment = new Comment();
                comment.setUserName("CommUser " + i);
                comment.setUserLocation("CommLoc " + i);
                comment.setCommentId(10000 + i);
                comment.setPostId(post.getPostId());
                comment.setCommentText("Random comment text with number 9740244566 and text " + i + j);
                comments.add(comment);
            }
            post.setComments(comments);
            posts.add(post);
        }
    }

    public FeedFragment() {

    }

    public static FeedFragment newInstance() {
        return new FeedFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_feed, container, false);
        feedRv = (RecyclerView) rootView.findViewById(R.id.feed_rv);
        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        generateData();
        FeedAdapter adapter = new FeedAdapter();
        adapter.setPosts(posts,getActivity());
        feedRv.setAdapter(adapter);
        feedRv.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}
