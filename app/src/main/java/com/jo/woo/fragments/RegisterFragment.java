package com.jo.woo.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

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
        ((Button)wholeView.findViewById(R.id.btnRegister_Login)).setOnClickListener(click);
        //Register button click listener
    }

    View.OnClickListener click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            //when View is clicked in onClickListener
            int id = v.getId();
            //get id from clicked one (as integer)

            if(id == R.id.btnRegister_Login){
                //some thing
                ((MainActivity)getActivity()).moveFragment(Constants.MENU);
                //Second page
            }
        }
    };
}
