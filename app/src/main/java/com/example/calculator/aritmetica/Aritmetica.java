package com.example.calculator.aritmetica;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.widget.EditText;
//import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.calculator.R;


public class Aritmetica extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Aritmetica() {
        // Required empty public constructor
    }
//    private EditText et1;
//    private EditText et2;
//    private TextView tv1;


    // TODO: Rename and change types and number of parameters
    public static Aritmetica newInstance(String param1, String param2) {
        Aritmetica fragment = new Aritmetica();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        et1 = (EditText) et1.findViewById(R.id.txt_num1);
//        et2 = (EditText) et2.findViewById(R.id.txt_num2);
//        tv1 = (TextView) tv1.findViewById(R.id.txt_resusltado);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_aritmetica, container, false);
    }


}