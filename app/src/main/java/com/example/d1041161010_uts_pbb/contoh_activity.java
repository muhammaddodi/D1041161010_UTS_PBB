package com.example.d1041161010_uts_pbb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contoh_activity extends AppCompatActivity {

    private Button mBtn_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_activity);


        mBtn_Back = (Button)findViewById(R.id.btn_contoh);


        mBtn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBtn_Back = new Intent(contoh_activity.this,MainActivity.class);
                startActivity(iBtn_Back);
            }
        });
    }
}
