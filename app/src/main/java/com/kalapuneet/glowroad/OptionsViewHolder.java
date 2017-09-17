package com.kalapuneet.glowroad;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class OptionsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private AppCompatTextView productsToSell;
    private AppCompatTextView myProducts;
    private AppCompatTextView browseShops;
    private AppCompatTextView findBuyers;

    public OptionsViewHolder(View itemView) {
        super(itemView);
        productsToSell = (AppCompatTextView) itemView.findViewById(R.id.products_to_sell);
        productsToSell.setOnClickListener(this);
        myProducts = (AppCompatTextView) itemView.findViewById(R.id.my_products);
        myProducts.setOnClickListener(this);
        browseShops = (AppCompatTextView) itemView.findViewById(R.id.browse_shops);
        browseShops.setOnClickListener(this);
        findBuyers = (AppCompatTextView) itemView.findViewById(R.id.find_buyers);
        findBuyers.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
