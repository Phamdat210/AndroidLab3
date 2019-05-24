package com.example.hp.androidlab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edUser;
    private EditText edPass;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edUser = (EditText) findViewById(R.id.edUser);
        edPass = (EditText) findViewById(R.id.edPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = edUser.getText().toString();
                String pass = edPass.getText().toString();
                if (user.equals("admin") && pass.equals("admin")){
                    Toast.makeText(MainActivity.this,"Đăng nhập thành công",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this,MenuActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this,"Đăng nhập thất bại",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
