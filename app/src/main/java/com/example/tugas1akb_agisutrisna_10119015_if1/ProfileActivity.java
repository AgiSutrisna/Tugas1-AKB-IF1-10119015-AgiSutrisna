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

public class ProfileActivity extends AppCompatActivity {

    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        initView();
        setData();
    }

    public void initView() {

        btnBack = findViewById(R.id.btn_back);
    }

    public void setData() {


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //action
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}