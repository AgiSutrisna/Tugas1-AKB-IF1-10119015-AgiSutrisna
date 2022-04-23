/* Tanggal  : 22-23 April 2022
   Nim      : 10119015
   Nama     : Agi Sutrisna
   Kelas    : IF-1
 */


package com.example.tugas1akb_agisutrisna_10119015_if1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        },5000);


    }
}