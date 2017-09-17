package com.kalapuneet.glowroad;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.Toolbar;

public class FeedActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private Toolbar toolbar;
    private AppCompatImageView hamburger;
    private AppCompatImageView search;
    private AppCompatTextView seller;
    private TabLayout tabLayout;
    private ViewPager pager;

    public static void start(Context context) {
        Intent starter = new Intent(context, FeedActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        hamburger = (AppCompatImageView) findViewById(R.id.hamburger);
        search = (AppCompatImageView) findViewById(R.id.search);
        seller = (AppCompatTextView) findViewById(R.id.seller);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_newspaper));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_shop));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_add));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_chat));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_planet_earth));
        pager = (ViewPager) findViewById(R.id.pager);
        tabLayout.setupWithViewPager(pager);
        tabLayout.setOnTabSelectedListener(this);
        pager.setAdapter(new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount()));
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        //
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        //
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
        //
    }
}
