package com.example.d1041161010_uts_pbb;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //deklarasi button
    private Button mBtn_Act, mBtn_Bro, mBtn_Con, mBtn_Int, mBtn_Ser;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisial tombol
        mBtn_Act = (Button) findViewById(R.id.button_acti);
        mBtn_Bro = (Button)findViewById(R.id.button_brod);
        mBtn_Con = (Button)findViewById(R.id.button_cont);
        mBtn_Int = (Button)findViewById(R.id.button_inte);
        mBtn_Ser = (Button)findViewById(R.id.button_serv);

        // function tombol
        mBtn_Act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBtn_act = new Intent(getApplicationContext(),Activity.class);
                startActivity(iBtn_act);
            }
        });

        mBtn_Bro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBtn_bro = new Intent(getApplicationContext(),Broadcast.class);
                startActivity(iBtn_bro);
            }
        });

        mBtn_Con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBtn_con = new Intent(getApplicationContext(),Content.class);
                startActivity(iBtn_con);
            }
        });

        mBtn_Int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBtn_int = new Intent(getApplicationContext(),Intent1.class);
                startActivity(iBtn_int);
            }
        });

        mBtn_Ser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBtn_ser = new Intent(getApplicationContext(),Service.class);
                startActivity(iBtn_ser);
            }
        });
    }
}
