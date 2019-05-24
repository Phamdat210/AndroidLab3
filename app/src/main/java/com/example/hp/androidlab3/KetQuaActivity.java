package com.example.hp.androidlab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KetQuaActivity extends AppCompatActivity {
    private TextView tvKq;
    private Button btnBack;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_qua);

        tvKq = (TextView) findViewById(R.id.tvKq);
        btnBack = (Button) findViewById(R.id.btnBack);

        Bundle bd = getIntent().getExtras();
        if(bd != null){
            String kq =bd.getString("kq");
            tvKq.setText(kq);
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KetQuaActivity.this,PhuongTrinhActivity.class);
                startActivity(intent);
            }
        });
    }
}
