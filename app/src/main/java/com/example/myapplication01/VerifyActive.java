package com.example.myapplication01;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class VerifyActive extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_active);
        textView = findViewById(R.id.textView);

        Login loginVerify = new Login("henrique","12345");
        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        String user = bundle.getString("user");
        String password = bundle.getString("password");
        Login login = new Login(user,password);

        if (login.getUser().equals(loginVerify.getUser()) && login.getPassword().equals(loginVerify.getPassword())){
            textView.setText("User Logged");
        }else{
            textView.setText("User Deny");
        };
    }
}