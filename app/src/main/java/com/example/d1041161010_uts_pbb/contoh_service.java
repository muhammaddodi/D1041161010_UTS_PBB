package com.example.d1041161010_uts_pbb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contoh_service extends AppCompatActivity {

    private Button mBtn_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_service);

        mBtn_Back = (Button)findViewById(R.id.btn_contoh);


        mBtn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBtn_Back = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(iBtn_Back);
            }
        });
    }
}
