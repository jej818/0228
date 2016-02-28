package com.jo.woo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;

import com.jo.woo.fragments.DevelopFragment;
import com.jo.woo.fragments.ExpectFragment;
import com.jo.woo.fragments.GraphFragment;
import com.jo.woo.fragments.GrowthinfoFragment;
import com.jo.woo.fragments.MainFragment;
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
    private String mName = null;
    private Integer mMonth = null;
    private String mAge = null;
    private String mGender = null;
    private Float mHeight = null;
    private Float mWeight = null;

    private SharedPreferences pref = null;

    private FragmentTransaction mFrgTransaction = null;

    private MainFragment mMain = null;
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
        loadSharedPreference();
        makeView();
        moveFragment(Constants.MAIN);
    }
    @Override
    public void onPause(){
        super.onPause();
        saveSharedPreference();
    }

    private void makeView()
    {
        mRegister = new RegisterFragment();
        mMeasure = new MeasureFragment();
        mGraph = new GraphFragment();
        mValue = new ValueFragment();

    }

    public void moveFragment(int type){
        //int �� type ������ �޾ƿͼ�
        mFrgTransaction = getSupportFragmentManager().beginTransaction();
        //transaction �����ͼ� mFrgTransaction�� �־���
        switch (type){
            case Constants.MAIN:
                if(mMain == null)
                    mMain = new MainFragment(mName, mMonth, mAge, mGender);
                mFrgTransaction.replace(R.id.container, mMain);
                break;
            case Constants.REGISTER:
                mFrgTransaction.replace(R.id.container, mRegister);
                //container��� ������ mainFragment�� ����ž� ��� FrgTransaction���� �˷���
                break;
            case Constants.MENU:
                if(mMenu == null)
                    mMenu = new MenuFragment(mName, mMonth, mAge, mGender);
                mFrgTransaction.replace(R.id.container, mMenu);
                break;
            case Constants.MEASURE:
                mFrgTransaction.replace(R.id.container, mMeasure);
                break;
            case Constants.VALUE:
                mFrgTransaction.replace(R.id.container, mValue);
                break;
            case Constants.GROWTHINFO:
                if(mGrowthinfo == null)
                    mGrowthinfo = new GrowthinfoFragment(mName, mMonth, mAge, mGender);
                mFrgTransaction.replace(R.id.container, mGrowthinfo);
                break;
            case Constants.DEVELOP:
                if(mDevelop == null)
                    mDevelop = new DevelopFragment(mName, mMonth, mAge, mGender,mHeight,mWeight);
                mFrgTransaction.replace(R.id.container, mDevelop);
                break;
            case Constants.EXPECT:
                if(mExpect == null)
                    mExpect = new ExpectFragment(mGender);
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

    public void setName(String Name) { mName = Name; }
    public void setMonth(Integer Month) { mMonth = Month; }
    public void setAge(Integer month) {
        int age;
        if(month < 36)
            mAge = month +"개월";
        else{
            age = month/12;
            mAge = "만 " + age + "세";
        }
    }
    public void setGender(Boolean Gender) {
        if(Gender)
            mGender = "남아";
        else
            mGender = "여아";
    }
    public void setHeight(Float Height) { mHeight = Height; }
    public void setWeight(Float Weight) { mWeight = Weight; }

    public String getName() { return mName; }
    public Integer getMonth() { return mMonth; }
    public String getAge() { return mAge;}
    public String getGender() { return mGender; }
    public Float getHeight() { return mHeight; }
    public Float getWeight() { return mWeight; }

    private void saveSharedPreference(){
        if(pref == null) pref= getSharedPreferences("myapplication", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit= pref.edit();
        if(mName != null) edit.putString("name", mName);
        if(mMonth != null) edit.putInt("month", mMonth);
        if(mAge != null) edit.putString("age", mAge);
        if(mGender != null) edit.putString("gender", mGender);
        if(mHeight != null) edit.putFloat("height", mHeight);
        if(mWeight != null) edit.putFloat("weight", mWeight);

        edit.commit();
    }
    // load data on local
    private void loadSharedPreference(){
        pref= getSharedPreferences("myapplication", Context.MODE_PRIVATE);
        mName= pref.getString("name", null);
        mMonth = pref.getInt("month", 0);
        mAge = pref.getString("age", null);
        mGender = pref.getString("gender", null);
        mHeight = pref.getFloat("height", 0);
        mWeight = pref.getFloat("weight", 0);
    }

}

