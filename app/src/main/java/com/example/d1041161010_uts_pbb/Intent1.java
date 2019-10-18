package com.example.d1041161010_uts_pbb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Intent1 extends AppCompatActivity {

    private Button mBtn_Back, mbtn_Contoh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1);

        //inisial tombol

        mBtn_Back = (Button)findViewById(R.id.btn_backInt);
        mbtn_Contoh = (Button)findViewById(R.id.btn_contoh);

        // function tombol
        mbtn_Contoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBtn_contoh = new Intent(getApplicationContext(),contoh_intent.class);
                startActivity(iBtn_contoh);
            }
        });

        mBtn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBtn_Back = new Intent(Intent1.this,MainActivity.class);
                startActivity(iBtn_Back);
            }
        });
    }
    public void  Link_materi_int (View view) {
        String url = "https://developer.android.com/reference/android/content/Intent.html?hl=id" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }
}
