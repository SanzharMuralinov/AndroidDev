package com.example.fittogether.fields;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.fittogether.R;
import com.example.fittogether.gym;
import com.example.fittogether.home;

public class MainFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);

        Button act = (Button) view.findViewById(R.id.act);
        Button act2 = (Button) view.findViewById(R.id.act2);
        act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), gym.class);
                startActivity(intent);
            }
        });

        act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), home.class);
                startActivity(intent);
            }
        });



        return view;

    }

}

