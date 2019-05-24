package com.example.hp.androidlab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {
    private ListView lvListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lvListView = (ListView) findViewById(R.id.lvListView);

        final String[] arr = new String[]{"Android Cơ Bản", "Android Nâng Cao", "Thiết kế giao diện Android", "Test và triển khai ứng dụng Android", "NodeJS", "Game 2D"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        lvListView.setAdapter(adapter);

        lvListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, arr[position],Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void btnBack(View view) {
        Intent intent = new Intent(ListViewActivity.this,MenuActivity.class);
        startActivity(intent);
        finish();
    }
}
