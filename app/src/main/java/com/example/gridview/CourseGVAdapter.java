package com.example.gridview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseGVAdapter extends ArrayAdapter<CourseModel> {

    Button buttonShow;
    Button buttonDelete;
//  CourseModel DeleteItem;
    List<CourseModel> list;

    public CourseGVAdapter(@NonNull Context context, ArrayList<CourseModel> courseModelArrayList) {
        super(context, 0, courseModelArrayList);

        this.list = courseModelArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView = convertView;
        if (listitemView == null) {

            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.card_item, parent, false);
        }
        CourseModel courseModel = getItem(position);
        TextView courseTV = listitemView.findViewById(R.id.idTVCourse);
        ImageView courseIV = listitemView.findViewById(R.id.idIVcourse);
         buttonShow = listitemView.findViewById(R.id.BtnShow);
         buttonDelete = listitemView.findViewById(R.id.BtnDelete);


        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                courseTV.setText(courseModel.getCourse_name());
                courseIV.setImageResource(courseModel.getImgid());
                Toast.makeText(getContext(), courseModel.getCourse_name(), Toast.LENGTH_LONG).show();
            }
        });
        courseTV.setText(courseModel.getCourse_name());

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //DeleteItem = list.get(position);
                list.remove(position);
                notifyDataSetChanged();
                Toast.makeText(getContext(),"Item Deleted", Toast.LENGTH_LONG).show();
//                courseTV.setText("");
//                courseIV.setImageResource(0);
            }
        });
        courseIV.setImageResource(courseModel.getImgid());
        return listitemView;
    }

    public void update() {
        this.list = list;
    }


}
