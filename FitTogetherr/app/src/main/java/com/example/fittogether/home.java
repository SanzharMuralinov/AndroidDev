package com.example.fittogether;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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

public class home extends AppCompatActivity implements View.OnClickListener {
    private Button grudhome;
    private Button spinahome;
    private Button bichome;
    private Button trichome;
    private Button nogihome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        grudhome = (Button) findViewById(R.id.grudhome);
        grudhome.setOnClickListener(this);
        spinahome = (Button) findViewById(R.id.spinahome);
        spinahome.setOnClickListener(this);
        nogihome = (Button) findViewById(R.id.nogihome);
        nogihome.setOnClickListener(this);
        bichome = (Button) findViewById(R.id.bichome);
        bichome.setOnClickListener(this);
        trichome = (Button) findViewById(R.id.trichome);
        trichome.setOnClickListener(this);
    }

    @Override
    public void onClick(View h) {
        switch (h.getId()) {
            case R.id.grudhome:
                Intent intent = new Intent(this, com.example.fittogether.grudhome.class);
                startActivity(intent);
                break;

            case R.id.spinahome:
                Intent intent1 = new Intent(this, com.example.fittogether.spinahome.class);
                startActivity(intent1);
                break;
            case R.id.nogihome:
                Intent intent2 = new Intent(this, com.example.fittogether.nogihome.class);
                startActivity(intent2);
                break;
            case R.id.bichome:
                Intent intent3 = new Intent(this, com.example.fittogether.bichome.class);
                startActivity(intent3);
                break;
            case R.id.trichome:
                Intent intent4 = new Intent(this, com.example.fittogether.trichome.class);
                startActivity(intent4);
                break;
            default:
                break;

        }
    }
}
