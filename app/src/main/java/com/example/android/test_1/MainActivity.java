package com.example.android.test_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v)
    {
        TextView v1 = (TextView)findViewById(R.id.history);
        float f  = 0;

        switch (v.getId())
        {
            case R.id.button1 :
                f = 1;
                break;
            case R.id.button2 :
                break;
            case R.id.button3 :
                break;
            case R.id.button4 :
                break;
            case R.id.button5 :
                break;
            case R.id.button6 :
                break;
            case R.id.button7 :
                break;
            case R.id.button8 :
                break;
            case R.id.button9 :
                break;
            case R.id.buttonz :
                break;
        }

        v1.setText(Float.toString(f));


    }
}
