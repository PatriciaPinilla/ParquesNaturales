package com.example.winchester.parquesnaturales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void NEXT(View Next) {
        Intent intent = new Intent(this, Lista.class);
        startActivity(intent);
    }
}
