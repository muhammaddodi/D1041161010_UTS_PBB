package com.example.d1041161010_uts_pbb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity extends AppCompatActivity {

    private Button mBtn_Back, mbtn_Contoh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);

        //inisial tombol
        mBtn_Back = (Button)findViewById(R.id.btn_backAct);
        mbtn_Contoh = (Button)findViewById(R.id.btn_contoh);

        // function tombol
        mbtn_Contoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iBtn_act = new Intent(getApplicationContext(), contoh_activity.class);
                startActivity(iBtn_act);
            }
        });

        mBtn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iBtn_Back = new Intent(Activity.this,MainActivity.class);
                startActivity(iBtn_Back);
            }
        });


    }
    public void  Link_materi (View view) {
        String url = "http://android-beginner-lessons.blogspot.com/2015/10/android-mengenal-komponen-aplikasi.html" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }
}
