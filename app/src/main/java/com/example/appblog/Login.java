package com.example.appblog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private EditText edtEmail, edtPassword;
    private TextView tv_forgetPassword, tv_register;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

    }

    private void initView(){
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        tv_forgetPassword = (TextView) findViewById(R.id.tv_forgetPassword);
        tv_register = (TextView) findViewById(R.id.tv_register);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
        tv_register.setOnClickListener(this);
    }

    private void Login(){

        // get data
        String Email = edtEmail.getText().toString().trim();
        String Password = edtPassword.getText().toString().trim();

    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnLogin){
            Login();
        }else if(v.getId() == R.id.tv_register){
            Intent intent = new Intent(Login.this, Register.class);
            startActivity(intent);
        }
    }
}
