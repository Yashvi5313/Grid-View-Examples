//package com.example.gridview;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.GridView;
//import android.widget.Toast;
//
//public class example extends Activity {
//    GridView gridview;
//    String[] item = new String[]{"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX"};
//    Button button;
//    List<String> ITEM_LIST;
//    ArrayAdapter<String> arrayadapter;
//    String DeletedItem;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_example);
//
//        gridview = (GridView) findViewById(R.id.gridView1);
//        button = (Button) findViewById(R.id.button1);
//
//        ITEM_LIST = new ArrayList<String>(Arrays.asList(item));
//        arrayadapter = new ArrayAdapter<String>(example.this, android.R.layout.simple_list_item_1, ITEM_LIST);
//        gridview.setAdapter(arrayadapter);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//                DeletedItem = ITEM_LIST.get(2);
//                ITEM_LIST.remove(2);
//                arrayadapter.notifyDataSetChanged();
//                Toast.makeText(example.this, "Item Deleted", Toast.LENGTH_LONG).show();
//            }
//        });
//    }
//}

package com.example.gridview;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;import android.view.View;import android.widget.ArrayAdapter;import android.widget.Button;import android.widget.GridView;import android.widget.Toast;

public class example extends Activity {
    GridView gridview;
    Button Remove;
    String[] GridViewItem = new String[]{"ANDROID", "PHP", "BLOGGER", "WORDPRESS", "SEO", "JAVASCRIPT", "ASP.NET",};
    List<String> StringLIST;
    ArrayAdapter<String> arrayadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridview = (GridView) findViewById(R.id.gridView1);
        Remove = (Button) findViewById(R.id.button1);
        StringLIST = new ArrayList<String>(Arrays.asList(GridViewItem));
        arrayadapter = new ArrayAdapter<String>(example.this, android.R.layout.simple_list_item_1, StringLIST);
        gridview.setAdapter(arrayadapter);
        Remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringLIST.remove(3);
                arrayadapter.notifyDataSetChanged();
                Toast.makeText(example.this, "Delete Successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

