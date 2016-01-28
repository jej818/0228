package com.jo.woo;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jo.woo.fragments.DevelopFragment;
import com.jo.woo.fragments.ExpectFragment;
import com.jo.woo.fragments.GraphFragment;
import com.jo.woo.fragments.GrowthinfoFragment;
import com.jo.woo.fragments.MeasureFragment;
import com.jo.woo.fragments.MenuFragment;
import com.jo.woo.fragments.RegisterFragment;
import com.jo.woo.fragments.ValueFragment;

/*public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}*/

public class MainActivity extends FragmentActivity {
    private FragmentTransaction mFrgTransaction = null;
    private RegisterFragment mRegister = null;
    private MenuFragment mMenu = null;
    private MeasureFragment mMeasure = null;
    private ValueFragment mValue = null;
    private GrowthinfoFragment mGrowthinfo = null;
    private DevelopFragment mDevelop = null;
    private ExpectFragment mExpect = null;
    private GraphFragment mGraph = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onResume(){
        super.onResume();
        makeView();
        moveFragment(Constants.REGISTER);
    }
    @Override
    public void onPause(){
        super.onPause();

    }

    private void makeView()
    {
        mRegister = new RegisterFragment();
        mMenu = new MenuFragment();
        mMeasure = new MeasureFragment();
        mGrowthinfo = new GrowthinfoFragment();
        mDevelop = new DevelopFragment();
        mExpect = new ExpectFragment();
        mGraph = new GraphFragment();
        mValue = new ValueFragment();

    }

    public void moveFragment(int type){
        //int �� type ������ �޾ƿͼ�
        mFrgTransaction = getSupportFragmentManager().beginTransaction();
        //transaction �����ͼ� mFrgTransaction�� �־���
        switch (type){
            case Constants.REGISTER:
                mFrgTransaction.replace(R.id.container, mRegister);
                //container��� ������ mainFragment�� ����ž� ��� FrgTransaction���� �˷���
                break;
            case Constants.MENU:
                mFrgTransaction.replace(R.id.container, mMenu);
                break;
            case Constants.MEASURE:
                mFrgTransaction.replace(R.id.container, mMeasure);
                break;
            case Constants.VALUE:
                mFrgTransaction.replace(R.id.container, mValue);
                break;
            case Constants.GROWTHINFO:
                mFrgTransaction.replace(R.id.container, mGrowthinfo);
                break;
            case Constants.DEVELOP:
                mFrgTransaction.replace(R.id.container, mDevelop);
                break;
            case Constants.EXPECT:
                mFrgTransaction.replace(R.id.container, mExpect);
                break;
            case Constants.GRAPH:
                mFrgTransaction.replace(R.id.container, mGraph);
                break;
            default:
        }
        mFrgTransaction.commit();
        //commit�� ������ ������ ���Ǽ� ����ڿ��� ��Ÿ���� ��
    }
}

