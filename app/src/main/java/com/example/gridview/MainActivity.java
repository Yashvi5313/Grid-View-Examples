package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView coursesGV;
    EditText editText;
    Button button;
    List<CourseModel> Courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coursesGV = findViewById(R.id.idGVcourses);

        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("JAVA", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("C++", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("Javascript", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("C", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("JAVA", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("C++", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("Javascript", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("C", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("JAVA", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("C++", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("Javascript", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("C", R.drawable.ic_gfglogo));

        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);

//        Courses = courseModelArrayList;

        editText = findViewById(R.id.edtNO);
        button = findViewById(R.id.btnSubmit);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String text = editText.getText().toString();
                int i =Integer.parseInt(text);

//                Courses.remove(i);

                courseModelArrayList.remove(i);
                adapter.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(),"Item Deleted", Toast.LENGTH_LONG).show();
            }
        });

    }

}


