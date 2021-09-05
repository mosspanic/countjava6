package com.example.countjava6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static int count=0;
    TextView textView;
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //String toString();
        textView=(TextView) findViewById(R.id.tv);
        b1=(Button) findViewById(R.id.b1);        b2=(Button) findViewById(R.id.b2);        b3=(Button) findViewById(R.id.b3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                textView.setText(Integer.toString(count));
            }
        });
        b2.setOnClickListener(this);
    }

    public void dfs(View v){
        //count=co;
        count--;
        textView.setText(Integer.toString(count));
        //static  int co;
        //co = count;
    }

    @Override
    public void onClick(View v) {
        count++;    int count2=235;
        textView.setText(Integer.toString(count));
    }
}