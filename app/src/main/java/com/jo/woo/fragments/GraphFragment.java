package com.jo.woo.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.jo.woo.Constants;
import com.jo.woo.MainActivity;
import com.jo.woo.R;
import com.jo.woo.adapter.MyAdapter;
import com.jo.woo.listitem.MyItem;

import java.util.ArrayList;

/**
 * Created by jo on 2016-01-28.
 */
public class GraphFragment extends Fragment {
    private View wholeView = null;

    private ListView mList= null;
    private MyAdapter mAdapter= null;
    private ArrayList<MyItem> mContent= null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle data){
        wholeView = inflater.inflate(R.layout.fragment_graph, null);
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
        ((Button)wholeView.findViewById(R.id.btnGraph_back)).setOnClickListener(click);
        mList= (ListView)wholeView.findViewById(R.id.listFragmentList);
        if(mAdapter == null){
            mContent= new ArrayList<MyItem>();
            //just for test :)
            for(int i=0; i<12; i++) mContent.add(new MyItem("2016년 "+(i+1)+"월 23일", "     키 : "+(i+70)+"cm  몸무게 : "+(i+30)+"kg"));
            mAdapter= new MyAdapter(getActivity(), R.layout.listitem_fragment_graph, mContent);
        }
        mList.setAdapter(mAdapter);
    }

    View.OnClickListener click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            if(v.getId() == R.id.btnGraph_back)
                //Back button clicked
                ((MainActivity)getActivity()).moveFragment(Constants.GROWTHINFO);
        }
    };
}
