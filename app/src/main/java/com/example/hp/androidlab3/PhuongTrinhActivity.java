package com.example.hp.androidlab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PhuongTrinhActivity extends AppCompatActivity {
    private EditText edNumberOne;
    private EditText edNumberTwo;
    private EditText edNumberThree;
    private Button btnResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phuong_trinh);

        edNumberOne = (EditText) findViewById(R.id.edNumberOne);
        edNumberTwo = (EditText) findViewById(R.id.edNumberTwo);
        edNumberThree = (EditText) findViewById(R.id.edNumberThree);
        btnResult = (Button) findViewById(R.id.btnResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = edNumberOne.getText().toString();
                String two = edNumberTwo.getText().toString();
                String three = edNumberThree.getText().toString();

                if (one.equals("") || two.equals("") ||three.equals("")) {
                    Toast.makeText(PhuongTrinhActivity.this,"Không được để trống",Toast.LENGTH_LONG).show();
                }
                else {
                    Double a = Double.parseDouble(one);
                    Double b = Double.parseDouble(two);
                    Double c = Double.parseDouble(three);
                    Double delta = b*b - 4*a*c;
                    if (delta < 0) {
                        String kq = "Phương trình vô nghiệm";
                        Intent intent = new Intent(PhuongTrinhActivity.this, KetQuaActivity.class);
                        intent.putExtra("kq", kq);
                        startActivity(intent);
                        finish();
                    } else if (delta == 0) {
                        String kq = "Phương trình có 1 nghiệm: x= " + Math.round((-b / (2 * a)));
                        Intent intent = new Intent(PhuongTrinhActivity.this, KetQuaActivity.class);
                        intent.putExtra("kq", kq);
                        startActivity(intent);
                        finish();
                    } else if (delta > 0) {
                        String kq = "x1= " + Math.round((-b + Math.sqrt(delta)) / (2 * a)) + "\n" + "x2= " + Math.round((-b - Math.sqrt(delta)) / (2 * a));
                        Intent intent = new Intent(PhuongTrinhActivity.this, KetQuaActivity.class);
                        intent.putExtra("kq", kq);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });
    }

    public void btnBackPT(View view) {
        Intent intent = new Intent(PhuongTrinhActivity.this,MenuActivity.class);
        startActivity(intent);
        finish();
    }
}
