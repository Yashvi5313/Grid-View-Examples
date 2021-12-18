package com.example.gridview;

import android.widget.CompoundButton;

public class ShoppingModel {

    private String item_name="";
    private int item_img;
    private String item_price="";
    private int item_rating;
    private boolean like_img;

    public ShoppingModel(String item_name, int item_img, String item_price, int item_rating, boolean like_img) {
        this.item_name = item_name;
        this.item_img = item_img;
        this.item_price = item_price;
        this.item_rating = item_rating;
        this.like_img = like_img;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getItem_img() {
        return item_img;
    }

    public void setItem_img(int item_img) {
        this.item_img = item_img;
    }

    public String getItem_price() { return item_price; }

    public void setItem_price(String item_price) { this.item_price = item_price; }

    public int getItem_rating() { return  item_rating; }

    public void  setItem_rating(int item_rating) { this.item_rating = item_rating; }

   public boolean getLike_img() { return like_img; }

   public void setLike_img(boolean like_img) { this.like_img = like_img; }
}
