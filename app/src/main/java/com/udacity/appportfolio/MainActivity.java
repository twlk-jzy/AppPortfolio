package com.udacity.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_0).setOnClickListener(this);
        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_4).setOnClickListener(this);
        findViewById(R.id.btn_5).setOnClickListener(this);
    }

    private void Toast(String toast) {
        Toast.makeText(MainActivity.this, toast, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_0:
                Toast("This is UDACITY 0");
                break;
            case R.id.btn_1:
                Toast("This is UDACITY 1");
                break;
            case R.id.btn_2:
                Toast("This is UDACITY 2");
                break;
            case R.id.btn_3:
                Toast("This is UDACITY 3");
                break;
            case R.id.btn_4:
                Toast("This is UDACITY 4");
                break;
            case R.id.btn_5:
                Toast("This is UDACITY 5");
                break;
        }
    }
}
