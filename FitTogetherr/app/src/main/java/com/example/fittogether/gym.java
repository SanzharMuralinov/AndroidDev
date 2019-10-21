package com.example.fittogether;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import com.example.fittogether.bicgym;
import com.example.fittogether.nogigym;
import com.example.fittogether.spinagym;
import com.example.fittogether.tricgym;
import com.example.fittogether.grudgym;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class gym extends AppCompatActivity implements View.OnClickListener {

    private Button grudgym;
    private Button spinagym;
    private Button bicgym;
    private Button tricgym;
    private Button nogigym;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym);
        grudgym = (Button) findViewById(R.id.grudgym);
        grudgym.setOnClickListener(this);
        spinagym = (Button) findViewById(R.id.spinagym);
        spinagym.setOnClickListener(this);
        nogigym = (Button) findViewById(R.id.nogigym);
        nogigym.setOnClickListener(this);
        bicgym = (Button) findViewById(R.id.bicgym);
        bicgym.setOnClickListener(this);
        tricgym = (Button) findViewById(R.id.tricgym);
        tricgym.setOnClickListener(this);


    }

    @Override
    public void onClick(View d) {
        switch (d.getId()) {
            case R.id.grudgym:
                Intent intent = new Intent(this, com.example.fittogether.grudgym.class);
                startActivity(intent);
                break;

            case R.id.spinagym:
                Intent intent1 = new Intent(this, com.example.fittogether.spinagym.class);
                startActivity(intent1);
                break;
            case R.id.nogigym:
                Intent intent2 = new Intent(this, com.example.fittogether.nogigym.class);
                startActivity(intent2);
                break;
            case R.id.bicgym:
                Intent intent3 = new Intent(this, com.example.fittogether.bicgym.class);
                startActivity(intent3);
                break;
            case R.id.tricgym:
                Intent intent4 = new Intent(this, com.example.fittogether.tricgym.class);
                startActivity(intent4);
                break;
            default:
                break;

        }
    }
}
