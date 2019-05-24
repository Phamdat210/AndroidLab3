package com.example.hp.androidlab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MenuActivity extends AppCompatActivity {
    private Button btnPT;
    private Button btnLv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnPT = (Button) findViewById(R.id.btnPT);
        btnLv = (Button) findViewById(R.id.btnLv);

        btnPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,PhuongTrinhActivity.class);
                startActivity(intent);
            }
        });

        btnLv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
