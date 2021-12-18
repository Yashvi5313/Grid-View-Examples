package com.example.gridview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class ShoppingGVAdapeter extends ArrayAdapter<ShoppingModel> {

    List<ShoppingModel> list;

    public ShoppingGVAdapeter(@NonNull Context context, ArrayList<ShoppingModel> shoppingModelArrayList) {
        super(context, 0, shoppingModelArrayList);

        this.list = shoppingModelArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        View listitemView = convertView;
        RecordHolder holder = null;

        if (listitemView == null) {
            Log.i("getView", "listitemView == null");

            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.shopping_item, parent, false);

            holder = new RecordHolder();
            holder.TVname = (TextView) listitemView.findViewById(R.id.idTVname);
            holder.IVitem = (ImageView) listitemView.findViewById(R.id.idIVitem);
            holder.TVprice = (TextView) listitemView.findViewById(R.id.idTVprice);
            holder.RBitem = (RatingBar) listitemView.findViewById(R.id.idRBitem);
            holder.IVlike = (ImageView) listitemView.findViewById(R.id.idIVlike);

            listitemView.setTag(holder);
        } else {
            Log.i("getView", "listitemView == null");
            holder = (RecordHolder) listitemView.getTag();
        }

        ShoppingModel shoppingModel = getItem(position);

        holder.TVname.setText(shoppingModel.getItem_name());
        holder.IVitem.setImageResource(shoppingModel.getItem_img());
        holder.TVprice.setText(shoppingModel.getItem_price());
        holder.RBitem.setMax(shoppingModel.getItem_rating());

        Log.i(" getView position", "" + position);
//        Log.i("getItem_name", "" + shoppingModel.getItem_name());
//        Log.i("getItem_img", "" + shoppingModel.getItem_img());
//        Log.i("getItem_price", "" + shoppingModel.getItem_price());
//        Log.i("getItem_rating", "" + shoppingModel.getItem_rating());
//        Log.i("getLike_img", "" + shoppingModel.getLike_img());

//        Log.i("getView if condition", "" + shoppingModel.getLike_img());
        if (shoppingModel.getLike_img()) {
            holder.IVlike.setImageResource(R.drawable.img_heart_red);
        } else {
            holder.IVlike.setImageResource(R.drawable.img_heart_white);
        }



        holder.IVlike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!shoppingModel.getLike_img()) {
                    shoppingModel.setLike_img(true);
                } else {
                    shoppingModel.setLike_img(false);
                }
//              list.set(position, shoppingModel);
                notifyDataSetChanged();
            }
        });

        return listitemView;
    }

    public class RecordHolder {
        TextView TVname;
        ImageView IVitem;
        TextView TVprice;
        RatingBar RBitem;
        ImageView IVlike;
    }
}
