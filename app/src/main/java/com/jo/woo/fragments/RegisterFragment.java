package com.jo.woo.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.jo.woo.Constants;
import com.jo.woo.MainActivity;
import com.jo.woo.R;

/**
 * Created by jo on 2016-01-28.
 */
public class RegisterFragment extends Fragment {
    private View wholeView=null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle date){
        wholeView = inflater.inflate(R.layout.fragment_register, null);
        //bring root view
        //bind to wholeView
        return wholeView;
        //must return wholeView for showing xml , null-> nullPointerException
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
        //make listener and convey to makeView
        ((Button) wholeView.findViewById(R.id.btnRegister_login)).setOnClickListener(click);
        //Register button click listener
        ((RadioButton)wholeView.findViewById(R.id.radio_Male)).setOnCheckedChangeListener(check);
        ((RadioButton)wholeView.findViewById(R.id.radio_Female)).setOnCheckedChangeListener(check);
    }


    View.OnClickListener click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            //when View is clicked in onClickListener
            int id = v.getId();
            //get id from clicked one (as integer)

            if(id == R.id.btnRegister_login){
                //some thing
                ((MainActivity)getActivity()).moveFragment(Constants.MENU);
                //Second page
            }

        }

    };

    CheckBox.OnCheckedChangeListener check = new OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(buttonView.getId()==R.id.radio_Male)
                if(isChecked);
                    //남아가 체크 됐을때

            if(buttonView.getId()==R.id.radio_Female)
                if(isChecked);
                    //여아가 체크 됐을때



        }
    };

}

