package com.example.registerdriver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("메인 액티비티");

        Button driverBtn = (Button) findViewById(R.id.btnDriver);
        Button userBtn = (Button) findViewById(R.id.btnUser);
        driverBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        registerDriverActivity.class);
                startActivity(intent);
            }
        });
        //손님 등록창 띄우는 코드 추가
    }
}