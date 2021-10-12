package com.example.myapplication01;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView txtViewUser;
    EditText editTextUser;
    TextView textViewPassword;
    EditText editTextPassword;
    EditText editTextToString;
    Login login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtViewUser = findViewById(R.id.labelLogin);
        editTextUser = findViewById(R.id.inputLogin);
        textViewPassword = findViewById(R.id.inputPassword);
        editTextPassword = findViewById(R.id.inputPassword);
        editTextToString = findViewById(R.id.editTextToString);
    }

    public void login(View view) {
        Bundle bundle = new Bundle();
        login = new Login(editTextUser.getText().toString(), editTextPassword.getText().toString());
        login.addNumber();

        bundle.putString("user",editTextUser.getText().toString());
        bundle.putString("password",editTextPassword.getText().toString());

        Intent intent = new Intent(this, VerifyActive.class);


        intent.putExtras(bundle);
        startActivity(intent);

        editTextToString.setText(login.toString());
        editTextUser.setText("");
        editTextPassword.setText("");
    }
}