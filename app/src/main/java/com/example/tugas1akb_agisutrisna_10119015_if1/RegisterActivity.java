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

public class RegisterActivity extends AppCompatActivity {

    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();
        setData();

    }

    public void initView(){
        btnRegister = findViewById(R.id.btn_register);


    }

    public void setData(){
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //action
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}