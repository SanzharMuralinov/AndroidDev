package com.example.fittogether.fields;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fittogether.gym;
import com.example.fittogether.R;
import com.example.fittogether.home;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button act2;
    private Button act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        act2 = (Button)findViewById(R.id.act2);
        act2.setOnClickListener(this);
        act = (Button)findViewById(R.id.act);
        act.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.act2:
                Intent intent = new Intent(this, gym.class);
                startActivity(intent);
                break;

            case R.id.act:
                Intent intent1 = new Intent(this, home.class);
                startActivity(intent1);
                break;
            default:
                break;

        }


    }
}
