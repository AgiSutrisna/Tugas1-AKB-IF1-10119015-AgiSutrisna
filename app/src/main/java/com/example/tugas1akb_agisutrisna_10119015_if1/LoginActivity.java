/* Tanggal  : 22-23 April 2022
   Nim      : 10119015
   Nama     : Agi Sutrisna
   Kelas    : IF-1
 */

package com.example.tugas1akb_agisutrisna_10119015_if1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin, btnRegister;
    private EditText etUsername, etPassword;
    private String username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        setData();
    }

    public void initView(){
        btnLogin = findViewById(R.id.btn_Login);
        btnRegister = findViewById(R.id.btn_register);
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);

    }

    public void setData(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username = etUsername.getText().toString();
                password = etPassword.getText().toString();
                //action
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("username", username);
                intent.putExtra("password", password);
                startActivity(intent);
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //action
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}