package com.simant.fragmentproject.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.simant.fragmentproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SumFragment extends Fragment {


    EditText editTextFirst, editTextSecond;
    Button buttonSum;

    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sum, container, false);
        editTextFirst = view.findViewById(R.id.etFirst);
        editTextSecond = view.findViewById(R.id.etSecond);
        buttonSum = view.findViewById(R.id.btnSum);

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firs = Integer.parseInt(editTextFirst.getText().toString());
                int secont = Integer.parseInt(editTextSecond.getText().toString());
                int result = firs + secont;
                Toast.makeText(getActivity(), "The sum is " + result, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
