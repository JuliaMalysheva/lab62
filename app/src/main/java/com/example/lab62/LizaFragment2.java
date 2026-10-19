package com.example.lab62;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LizaFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_liza2, container, false);

        Button btnNext = view.findViewById(R.id.btn_next2);
        btnNext.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_lizaFragment2_to_lizaFragment3);
        });

        return view;
    }
}