package com.jo.woo.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.jo.woo.Constants;
import com.jo.woo.MainActivity;
import com.jo.woo.R;

/**
 * Created by jo on 2016-02-11.
 */
public class MainFragment extends Fragment {
    private View wholeView = null;

    private String mName = null;
    private Integer mMonth = null;
    private String mGender = null;
    public MainFragment (){}
    public MainFragment (String Name, Integer Month, String Gender){
        this.mName = Name;
        this.mMonth = Month;
        this.mGender = Gender;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle data){
        wholeView = inflater.inflate(R.layout.fragment_main, null);
        return wholeView;
    }

    @Override
    public void onResume(){
        super.onResume();
        makeView();
    }
    @Override
    public void onPause(){
        super.onPause();
    }

    private void makeView(){
        ((Button)wholeView.findViewById(R.id.btnMain_register)).setOnClickListener(click);
        ((Button)wholeView.findViewById(R.id.btnMain_menu)).setOnClickListener(click);
        ((TextView)wholeView.findViewById(R.id.textViewMain)).setText(mName + " ("+ mGender +"/"+mMonth+"개월)");
    }

    View.OnClickListener click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if(v.getId() == R.id.btnMain_register)
                //Back button clicked
                ((MainActivity)getActivity()).moveFragment(Constants.REGISTER);
            if(v.getId() == R.id.btnMain_menu)
                //Back button clicked
                ((MainActivity)getActivity()).moveFragment(Constants.MENU);
        }
    };
}
