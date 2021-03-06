package com.example.administrator.activitytest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("SecondActivity","Task id is "+getTaskId());
        setContentView(R.layout.second_layout);
//        Intent intent=getIntent();
//        String data=intent.getStringExtra("extra_data");
//        Toast.makeText(SecondActivity.this,data, Toast.LENGTH_SHORT).show();
        Button button2=(Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SecondActivity.this,ThridActivity.class);
                startActivity(intent);

//                intent.putExtra("data_return","hello");
//                setResult(RESULT_OK,intent);
//                finish();
            }
        });
    }

    public static void actionStart(Context context,String data1,String data2){
        Intent intent = new Intent(context,SecondActivity.class);
        intent.putExtra("param1",data1);
        intent.putExtra("param2",data2);
        context.startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity","onDestory");
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return","hello");
        setResult(RESULT_OK,intent);
        finish();
    }
}
