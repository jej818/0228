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
public class ExpectFragment extends Fragment {
    private View wholeView = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle data){
        wholeView = inflater.inflate(R.layout.fragment_expect, null);
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
        ((Button)wholeView.findViewById(R.id.btnExpect_calculation)).setOnClickListener(click);
        ((Button)wholeView.findViewById(R.id.btnExpect_back)).setOnClickListener(click);
        (wholeView.findViewById(R.id.layout_hiddenpage)).setVisibility(View.INVISIBLE);
    }

    View.OnClickListener click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if(v.getId() == R.id.btnExpect_calculation)
                //calculation button clicked
                (wholeView.findViewById(R.id.layout_hiddenpage)).setVisibility(View.VISIBLE);
            else if(v.getId() == R.id.btnExpect_back)
                //back button clicked
                ((MainActivity)getActivity()).moveFragment(Constants.GROWTHINFO);
        }
    };
}

