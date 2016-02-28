package com.jo.woo.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.jo.woo.Constants;
import com.jo.woo.MainActivity;
import com.jo.woo.R;

/**
 * Created by jo on 2016-01-28.
 */
public class DevelopFragment extends Fragment {
    private View wholeView = null;

    private String mName = null;
    private Integer mMonth = null;
    private String mAge = null;
    private String mGender = null;
    private Float mHeight = null;
    private Float mWeight = null;
    public DevelopFragment(){}
    public DevelopFragment(String Name, Integer Month, String Age, String Gender, Float Height, Float Weight){
        this.mName = Name;
        this.mMonth = Month;
        this.mAge = Age;
        this.mGender = Gender;
        this.mHeight = Height;
        this.mWeight = Weight;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle data){
        wholeView = inflater.inflate(R.layout.fragment_develop, null);
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

    private int rank_height(Integer mMonth, String mGender, Float mHeight){

        int rank=0;

        return rank;
    }

    private int rank_weight(Integer mMonth, String mGender, Float mWeight){

        int rank=0;

        return rank;
    }

    private void makeView(){
        ((Button)wholeView.findViewById(R.id.btnDevelop_back)).setOnClickListener(click);
        ((TextView)wholeView.findViewById(R.id.develop_height)).setText("키는 " + rank_height(mMonth, mGender, mHeight) + "등 입니다.");
        ((TextView)wholeView.findViewById(R.id.develop_weight)).setText("몸무게는 "+rank_weight(mMonth,mGender,mWeight)+"등 입니다.");
    }

    View.OnClickListener click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if(v.getId() == R.id.btnDevelop_back)
                //back button clicked
                ((MainActivity)getActivity()).moveFragment(Constants.GROWTHINFO);
        }
    };
}
