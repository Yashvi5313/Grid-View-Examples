package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;

import java.util.ArrayList;

public class Shopping_gridView extends AppCompatActivity {

    GridView itemGV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_grid_view);

        itemGV = findViewById(R.id.idGVitem);

        ArrayList<ShoppingModel> shoppingModelArrayList = new ArrayList<ShoppingModel>();
        shoppingModelArrayList.add(new ShoppingModel("Fashion Jacket", R.drawable.jacket, "Rs. 2200.00", 3, false));
        shoppingModelArrayList.add(new ShoppingModel("Women Fashion Blouse", R.drawable.blouse, "Rs. 1200.00", 3, false));
        shoppingModelArrayList.add(new ShoppingModel("Fashion Sweater", R.drawable.sweater, "Rs. 2200.00", 3, false));
        shoppingModelArrayList.add(new ShoppingModel("Sony Smartphone", R.drawable.phone, "Rs. 11100.00", 4, false));
        shoppingModelArrayList.add(new ShoppingModel("Fashion Jacket", R.drawable.jacket_1, "Rs. 2200.00", 3, false));
        shoppingModelArrayList.add(new ShoppingModel("Women Jeans", R.drawable.jeans, "Rs. 2000.00", 3,false));
        shoppingModelArrayList.add(new ShoppingModel("Mi Smartphone", R.drawable.phone, "Rs. 12200.00", 3,false));
        shoppingModelArrayList.add(new ShoppingModel("Fashion T-shirt", R.drawable.tshirt, "Rs. 1200.00", 3, false));


        shoppingModelArrayList.add(new ShoppingModel("Fashion Jacket1", R.drawable.jacket_1, "Rs. 2200.00", 3, false));
        shoppingModelArrayList.add(new ShoppingModel("Women Jeans1", R.drawable.jeans, "Rs. 2000.00", 3,false));
        shoppingModelArrayList.add(new ShoppingModel("Mi Smartphone1", R.drawable.phone, "Rs. 12200.00", 3,false));
        shoppingModelArrayList.add(new ShoppingModel("Fashion T-shirt1", R.drawable.tshirt, "Rs. 1200.00", 3, false));

        ShoppingGVAdapeter adapeter = new ShoppingGVAdapeter (this, shoppingModelArrayList);
        itemGV.setAdapter(adapeter);

    }
}