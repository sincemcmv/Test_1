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
        TextView v1 = findViewById(R.id.history);
        float f  = 0;
        int i = 0;

        switch (v.getId())
        {
            case R.id.button1 :
                f = 1;
                break;
            case R.id.button2 :
                f = 2;
                break;
            case R.id.button3 :
                f = 3;
                break;
            case R.id.button4 :
                f = 4;
                break;
            case R.id.button5 :
                f = 5;
                break;
            case R.id.button6 :
                f = 6;
                break;
            case R.id.button7 :
                f = 7;
                break;
            case R.id.button8 :
                f = 8;
                break;
            case R.id.button9 :
                f = 9;
                break;
            case R.id.buttonz :
                f = 0;
                break;
        }
        if(hasDecimals(f) != true)
        {
            v1.setText(Float.toString(f));
        }
        else
        {
            i = (int)f;
            v1.setText(Integer.toString(i));
        }



    }

    public boolean hasDecimals(Float f)
    {
        return f % 1 == 0.0;
    }

}
