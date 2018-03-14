package com.example.administrator.uilayouttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=(Button)findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.button1:
                intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.button2:
                intent = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
                break;
            case R.id.button3:
                intent = new Intent(MainActivity.this,Main4Activity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}

