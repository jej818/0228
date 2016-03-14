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

        if(mGender.equals("남아")) {
            if (mMonth >= 12 && mMonth < 15) {
                if (mHeight >= 84.0)
                    rank = 97;
                else if (mHeight >= 83.3)
                    rank = 95;
                else if (mHeight >= 82.1)
                    rank = 90;
                else if (mHeight >= 80.3)
                    rank = 75;
                else if (mHeight >= 78.2)
                    rank = 50;
                else if (mHeight >= 76.2)
                    rank = 25;
                else if (mHeight >= 74.3)
                    rank = 10;
                else if (mHeight >= 73.2)
                    rank = 5;
                else
                    rank = 3;
            }
            else if (mMonth >= 15 && mMonth < 18) {
                if (mHeight >= 87.3)
                    rank = 97;
                else if (mHeight >= 86.5)
                    rank = 95;
                else if (mHeight >= 85.3)
                    rank = 90;
                else if (mHeight >= 83.3)
                    rank = 75;
                else if (mHeight >= 81.2)
                    rank = 50;
                else if (mHeight >= 79.0)
                    rank = 25;
                else if (mHeight >= 77.0)
                    rank = 10;
                else if (mHeight >= 75.8)
                    rank = 5;
                else
                    rank = 3;
            }
            else if (mMonth >= 18 && mMonth < 21) {
                if (mHeight >= 90.3)
                    rank = 97;
                else if (mHeight >= 89.5)
                    rank = 95;
                else if (mHeight >= 88.2)
                    rank = 90;
                else if (mHeight >= 86.1)
                    rank = 75;
                else if (mHeight >= 83.8)
                    rank = 50;
                else if (mHeight >= 81.5)
                    rank = 25;
                else if (mHeight >= 79.4)
                    rank = 10;
                else if (mHeight >= 78.2)
                    rank = 5;
                else
                    rank = 3;
            }
            else if (mMonth >= 21 && mMonth < 24) {
                if (mHeight >= 93.1)
                    rank = 97;
                else if (mHeight >= 92.2)
                    rank = 95;
                else if (mHeight >= 90.8)
                    rank = 90;
                else if (mHeight >= 88.6)
                    rank = 75;
                else if (mHeight >= 86.2)
                    rank = 50;
                else if (mHeight >= 83.7)
                    rank = 25;
                else if (mHeight >= 81.6)
                    rank = 10;
                else if (mHeight >= 80.3)
                    rank = 5;
                else
                    rank = 3;
            }
            else if (mMonth >= 24 && mMonth < 30) {
                if (mHeight >= 96.9)
                    rank = 97;
                else if (mHeight >= 95.9)
                    rank = 95;
                else if (mHeight >= 94.4)
                    rank = 90;
                else if (mHeight >= 92.0)
                    rank = 75;
                else if (mHeight >= 89.4)
                    rank = 50;
                else if (mHeight >= 86.8)
                    rank = 25;
                else if (mHeight >= 84.5)
                    rank = 10;
                else if (mHeight >= 83.1)
                    rank = 5;
                else
                    rank = 3;
            }
            else if (mMonth >= 30 && mMonth < 36) {
                if (mHeight >= 101.3)
                    rank = 97;
                else if (mHeight >= 100.2)
                    rank = 95;
                else if (mHeight >= 98.6)
                    rank = 90;
                else if (mHeight >= 96.0)
                    rank = 75;
                else if (mHeight >= 93.1)
                    rank = 50;
                else if (mHeight >= 90.4)
                    rank = 25;
                else if (mHeight >= 87.9)
                    rank = 10;
                else if (mHeight >= 86.5)
                    rank = 5;
                else
                    rank = 3;
            }
            else if (mMonth >= 36 && mMonth < 42) {
                if (mHeight >= 105.0)
                    rank = 97;
                else if (mHeight >= 103.9)
                    rank = 95;
                else if (mHeight >= 102.3)
                    rank = 90;
                else if (mHeight >= 99.6)
                    rank = 75;
                else if (mHeight >= 96.7)
                    rank = 50;
                else if (mHeight >= 94.0)
                    rank = 25;
                else if (mHeight >= 91.6)
                    rank = 10;
                else if (mHeight >= 90.2)
                    rank = 5;
                else
                    rank = 3;
            }
            else if (mMonth >= 42 && mMonth < 48) {
                if (mHeight >= 108.7)
                    rank = 97;
                else if (mHeight >= 107.6)
                    rank = 95;
                else if (mHeight >= 105.9)
                    rank = 90;
                else if (mHeight >= 103.2)
                    rank = 75;
                else if (mHeight >= 100.3)
                    rank = 50;
                else if (mHeight >= 97.5)
                    rank = 25;
                else if (mHeight >= 95.1)
                    rank = 10;
                else if (mHeight >= 93.6)
                    rank = 5;
                else
                    rank = 3;
            }
            else if (mMonth >= 48 && mMonth < 54) {
                if (mHeight >= 112.2)
                    rank = 97;
                else if (mHeight >= 111.1)
                    rank = 95;
                else if (mHeight >= 109.4)
                    rank = 90;
                else if (mHeight >= 106.7)
                    rank = 75;
                else if (mHeight >= 103.8)
                    rank = 50;
                else if (mHeight >= 101.0)
                    rank = 25;
                else if (mHeight >= 98.5)
                    rank = 10;
                else if (mHeight >= 97.0)
                    rank = 5;
                else
                    rank = 3;
            }
            else if (mMonth >= 54 && mMonth < 60) {
                if (mHeight >= 115.6)
                    rank = 97;
                else if (mHeight >= 114.5)
                    rank = 95;
                else if (mHeight >= 112.9)
                    rank = 90;
                else if (mHeight >= 110.2)
                    rank = 75;
                else if (mHeight >= 107.2)
                    rank = 50;
                else if (mHeight >= 104.3)
                    rank = 25;
                else if (mHeight >= 101.7)
                    rank = 10;
                else if (mHeight >= 100.2)
                    rank = 5;
                else
                    rank = 3;
            }
            else if (mMonth >= 60 && mMonth < 66) {
                if (mHeight >= 118.9)
                    rank = 97;
                else if (mHeight >= 117.8)
                    rank = 95;
                else if (mHeight >= 116.2)
                    rank = 90;
                else if (mHeight >= 113.5)
                    rank = 75;
                else if (mHeight >= 110.5)
                    rank = 50;
                else if (mHeight >= 107.5)
                    rank = 25;
                else if (mHeight >= 104.9)
                    rank = 10;
                else if (mHeight >= 103.3)
                    rank = 5;
                else
                    rank = 3;
            }
            else if (mMonth >= 66 && mMonth < 72) {
                if (mHeight >= 122.2)
                    rank = 97;
                else if (mHeight >= 121.1)
                    rank = 95;
                else if (mHeight >= 119.5)
                    rank = 90;
                else if (mHeight >= 116.7)
                    rank = 75;
                else if (mHeight >= 113.6)
                    rank = 50;
                else if (mHeight >= 110.6)
                    rank = 25;
                else if (mHeight >= 107.9)
                    rank = 10;
                else if (mHeight >= 106.3)
                    rank = 5;
                else
                    rank = 3;
            }
            else if (mMonth >= 72 && mMonth < 78) {
                if (mHeight >= 125.6)
                    rank = 97;
                else if (mHeight >= 124.4)
                    rank = 95;
                else if (mHeight >= 122.7)
                    rank = 90;
                else if (mHeight >= 119.8)
                    rank = 75;
                else if (mHeight >= 116.6)
                    rank = 50;
                else if (mHeight >= 113.5)
                    rank = 25;
                else if (mHeight >= 110.7)
                    rank = 10;
                else if (mHeight >= 109.1)
                    rank = 5;
                else
                    rank = 3;
            }
            else if (mMonth >= 78 && mMonth < 84) {
                if (mHeight >= 128.9)
                    rank = 97;
                else if (mHeight >= 127.7)
                    rank = 95;
                else if (mHeight >= 125.9)
                    rank = 90;
                else if (mHeight >= 122.8)
                    rank = 75;
                else if (mHeight >= 119.5)
                    rank = 50;
                else if (mHeight >= 116.3)
                    rank = 25;
                else if (mHeight >= 113.5)
                    rank = 10;
                else if (mHeight >= 111.8)
                    rank = 5;
                else
                    rank = 3;
            }
            else if (mMonth >= 84 && mMonth < 96) {
                if (mHeight >= 133.9)
                    rank = 97;
                else if (mHeight >= 132.6)
                    rank = 95;
                else if (mHeight >= 130.6)
                    rank = 90;
                else if (mHeight >= 127.3)
                    rank = 75;
                else if (mHeight >= 123.7)
                    rank = 50;
                else if (mHeight >= 120.3)
                    rank = 25;
                else if (mHeight >= 117.3)
                    rank = 10;
                else if (mHeight >= 115.5)
                    rank = 5;
                else
                    rank = 3;
            }
            else if (mMonth >= 96 && mMonth < 108) {
                if (mHeight >= 140.1)
                    rank = 97;
                else if (mHeight >= 138.7)
                    rank = 95;
                else if (mHeight >= 136.5)
                    rank = 90;
                else if (mHeight >= 132.9)
                    rank = 75;
                else if (mHeight >= 129.1)
                    rank = 50;
                else if (mHeight >= 125.3)
                    rank = 25;
                else if (mHeight >= 122.1)
                    rank = 10;
                else if (mHeight >= 120.1)
                    rank = 5;
                else
                    rank = 3;
            }
            else if (mMonth >= 108 && mMonth <= 120) {
                if (mHeight >= 145.5)
                    rank = 97;
                else if (mHeight >= 144.1)
                    rank = 95;
                else if (mHeight >= 141.9)
                    rank = 90;
                else if (mHeight >= 138.2)
                    rank = 75;
                else if (mHeight >= 134.2)
                    rank = 50;
                else if (mHeight >= 130.2)
                    rank = 25;
                else if (mHeight >= 126.7)
                    rank = 10;
                else if (mHeight >= 124.6)
                    rank = 5;
                else
                    rank = 3;
            }
        }
        else{
            if(mMonth>=12 && mMonth <15){
                if(mHeight >= 82.8)
                    rank = 97;
                else if(mHeight >= 82.1)
                    rank = 95;
                else if(mHeight >= 80.9)
                    rank = 90;
                else if(mHeight >= 79.0)
                    rank = 75;
                else if(mHeight >= 77.0)
                    rank = 50;
                else if(mHeight >= 74.9)
                    rank = 25;
                else if(mHeight >= 73.1)
                    rank = 10;
                else if(mHeight >= 72.0)
                    rank = 5;
                else
                    rank = 3;
            }
            else if(mMonth>=15 && mMonth <18){
                if(mHeight >= 86.1)
                    rank = 97;
                else if(mHeight >= 85.3)
                    rank = 95;
                else if(mHeight >= 84.1)
                    rank = 90;
                else if(mHeight >= 82.1)
                    rank = 75;
                else if(mHeight >= 79.9)
                    rank = 50;
                else if(mHeight >= 77.8)
                    rank = 25;
                else if(mHeight >= 75.9)
                    rank = 10;
                else if(mHeight >= 74.8)
                    rank = 5;
                else
                    rank = 3;
            }
            else if(mMonth>=18 && mMonth <21){
                if(mHeight >= 89.1)
                    rank = 97;
                else if(mHeight >= 88.3)
                    rank = 95;
                else if(mHeight >= 87.0)
                    rank = 90;
                else if(mHeight >= 84.8)
                    rank = 75;
                else if(mHeight >= 82.6)
                    rank = 50;
                else if(mHeight >= 80.3)
                    rank = 25;
                else if(mHeight >= 78.4)
                    rank = 10;
                else if(mHeight >= 77.3)
                    rank = 5;
                else
                    rank = 3;
            }
            else if(mMonth>=21 && mMonth <24){
                if(mHeight >= 91.9)
                    rank = 97;
                else if(mHeight >= 91.0)
                    rank = 95;
                else if(mHeight >= 89.6)
                    rank = 90;
                else if(mHeight >= 87.4)
                    rank = 75;
                else if(mHeight >= 85.0)
                    rank = 50;
                else if(mHeight >= 82.7)
                    rank = 25;
                else if(mHeight >= 80.7)
                    rank = 10;
                else if(mHeight >= 79.5)
                    rank = 5;
                else
                    rank = 3;
            }
            else if(mMonth>=24 && mMonth <30){
                if(mHeight >= 95.6)
                    rank = 97;
                else if(mHeight >= 94.6)
                    rank = 95;
                else if(mHeight >= 93.2)
                    rank = 90;
                else if(mHeight >= 90.8)
                    rank = 75;
                else if(mHeight >= 88.2)
                    rank = 50;
                else if(mHeight >= 85.8)
                    rank = 25;
                else if(mHeight >= 83.6)
                    rank = 10;
                else if(mHeight >= 82.4)
                    rank = 5;
                else
                    rank = 3;
            }
            else if(mMonth>=30 && mMonth <36){
                if(mHeight >= 99.7)
                    rank = 97;
                else if(mHeight >= 98.7)
                    rank = 95;
                else if(mHeight >= 97.2)
                    rank = 90;
                else if(mHeight >= 94.7)
                    rank = 75;
                else if(mHeight >= 91.9)
                    rank = 50;
                else if(mHeight >= 89.3)
                    rank = 25;
                else if(mHeight >= 87.0)
                    rank = 10;
                else if(mHeight >= 85.6)
                    rank = 5;
                else
                    rank = 3;
            }
            else if(mMonth>=36 && mMonth <42){
                if(mHeight >= 103.5)
                    rank = 97;
                else if(mHeight >= 102.5)
                    rank = 95;
                else if(mHeight >= 100.9)
                    rank = 90;
                else if(mHeight >= 98.3)
                    rank = 75;
                else if(mHeight >= 95.6)
                    rank = 50;
                else if(mHeight >= 92.9)
                    rank = 25;
                else if(mHeight >= 90.5)
                    rank = 10;
                else if(mHeight >= 89.1)
                    rank = 5;
                else
                    rank = 3;
            }
            else if(mMonth>=42 && mMonth <48){
                if(mHeight >= 107.3)
                    rank = 97;
                else if(mHeight >= 106.2)
                    rank = 95;
                else if(mHeight >= 104.6)
                    rank = 90;
                else if(mHeight >= 102.0)
                    rank = 75;
                else if(mHeight >= 99.2)
                    rank = 50;
                else if(mHeight >= 96.5)
                    rank = 25;
                else if(mHeight >= 94.0)
                    rank = 10;
                else if(mHeight >= 92.6)
                    rank = 5;
                else
                    rank = 3;
            }
            else if(mMonth>=48 && mMonth <54){
                if(mHeight >= 110.9)
                    rank = 97;
                else if(mHeight >= 109.8)
                    rank = 95;
                else if(mHeight >= 108.2)
                    rank = 90;
                else if(mHeight >= 105.6)
                    rank = 75;
                else if(mHeight >= 102.7)
                    rank = 50;
                else if(mHeight >= 100.0)
                    rank = 25;
                else if(mHeight >= 97.5)
                    rank = 10;
                else if(mHeight >= 96.1)
                    rank = 5;
                else
                    rank = 3;
            }
            else if(mMonth>=54 && mMonth <60){
                if(mHeight >= 114.3)
                    rank = 97;
                else if(mHeight >= 113.3)
                    rank = 95;
                else if(mHeight >= 111.7)
                    rank = 90;
                else if(mHeight >= 109.0)
                    rank = 75;
                else if(mHeight >= 106.1)
                    rank = 50;
                else if(mHeight >= 103.3)
                    rank = 25;
                else if(mHeight >= 100.8)
                    rank = 10;
                else if(mHeight >= 99.4)
                    rank = 5;
                else
                    rank = 3;
            }
            else if(mMonth>=60 && mMonth <66){
                if(mHeight >= 117.7)
                    rank = 97;
                else if(mHeight >= 116.6)
                    rank = 95;
                else if(mHeight >= 115.0)
                    rank = 90;
                else if(mHeight >= 112.3)
                    rank = 75;
                else if(mHeight >= 109.4)
                    rank = 50;
                else if(mHeight >= 106.5)
                    rank = 25;
                else if(mHeight >= 104.0)
                    rank = 10;
                else if(mHeight >= 102.5)
                    rank = 5;
                else
                    rank = 3;
            }
            else if(mMonth>=66 && mMonth <72){
                if(mHeight >= 120.9)
                    rank = 97;
                else if(mHeight >= 119.9)
                    rank = 95;
                else if(mHeight >= 118.2)
                    rank = 90;
                else if(mHeight >= 115.5)
                    rank = 75;
                else if(mHeight >= 112.5)
                    rank = 50;
                else if(mHeight >= 109.6)
                    rank = 25;
                else if(mHeight >= 107.0)
                    rank = 10;
                else if(mHeight >= 105.4)
                    rank = 5;
                else
                    rank = 3;
            }
            else if(mMonth>=72 && mMonth < 78){
                if(mHeight >= 124.2)
                    rank = 97;
                else if(mHeight >= 123.1)
                    rank = 95;
                else if(mHeight >= 121.4)
                    rank = 90;
                else if(mHeight >= 118.6)
                    rank = 75;
                else if(mHeight >= 115.5)
                    rank = 50;
                else if(mHeight >= 112.4)
                    rank = 25;
                else if(mHeight >= 109.7)
                    rank = 10;
                else if(mHeight >= 108.1)
                    rank = 5;
                else
                    rank = 3;
            }
            else if(mMonth>=78 && mMonth < 84){
                if(mHeight >= 127.5)
                    rank = 97;
                else if(mHeight >= 126.3)
                    rank = 95;
                else if(mHeight >= 124.5)
                    rank = 90;
                else if(mHeight >= 121.5)
                    rank = 75;
                else if(mHeight >= 118.3)
                    rank = 50;
                else if(mHeight >= 115.1)
                    rank = 25;
                else if(mHeight >= 112.3)
                    rank = 10;
                else if(mHeight >= 110.7)
                    rank = 5;
                else
                    rank = 3;
            }
            else if(mMonth>=84 && mMonth < 96){
                if(mHeight >= 132.5)
                    rank = 97;
                else if(mHeight >= 131.2)
                    rank = 95;
                else if(mHeight >= 129.2)
                    rank = 90;
                else if(mHeight >= 125.9)
                    rank = 75;
                else if(mHeight >= 122.4)
                    rank = 50;
                else if(mHeight >= 119.0)
                    rank = 25;
                else if(mHeight >= 116.0)
                    rank = 10;
                else if(mHeight >= 114.3)
                    rank = 5;
                else
                    rank = 3;
            }
            else if(mMonth>=96 && mMonth < 108){
                if(mHeight >= 139.3)
                    rank = 97;
                else if(mHeight >= 137.7)
                    rank = 95;
                else if(mHeight >= 135.4)
                    rank = 90;
                else if(mHeight >= 131.7)
                    rank = 75;
                else if(mHeight >= 127.8)
                    rank = 50;
                else if(mHeight >= 124.0)
                    rank = 25;
                else if(mHeight >= 120.7)
                    rank = 10;
                else if(mHeight >= 117.9)
                    rank = 5;
                else
                    rank = 3;
            }
            else if(mMonth>=108 && mMonth <= 120){
                if(mHeight >= 146.1)
                    rank = 97;
                else if(mHeight >= 144.5)
                    rank = 95;
                else if(mHeight >= 141.9)
                    rank = 90;
                else if(mHeight >= 137.8)
                    rank = 75;
                else if(mHeight >= 133.5)
                    rank = 50;
                else if(mHeight >= 129.3)
                    rank = 25;
                else if(mHeight >= 125.7)
                    rank = 10;
                else if(mHeight >= 123.6)
                    rank = 5;
                else
                    rank = 3;
            }

        }

        return rank;
    }

    private int rank_weight(Integer mMonth, String mGender, Float mWeight){
        int rank = 0;
        if(mGender.equals("여아")) {
            if(mMonth>=12&&mMonth<15) {
                if (mWeight >= 12.1)
                    rank = 97;
                else if(mWeight >= 11.8)
                    rank=95;
                else if(mWeight >= 11.4)
                    rank=90;
                else if(mWeight >= 10.6)
                    rank=75;
                else if(mWeight >= 9.8)
                    rank=50;
                else if(mWeight >= 9.1)
                    rank=25;
                else if(mWeight >= 8.5)
                    rank=10;
                else if(mWeight >= 8.1)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=15&&mMonth<18) {
                if (mWeight >= 13.0)
                    rank = 97;
                else if(mWeight >= 12.7)
                    rank=95;
                else if(mWeight >= 12.2)
                    rank=90;
                else if(mWeight >= 11.4)
                    rank=75;
                else if(mWeight >= 10.5)
                    rank=50;
                else if(mWeight >= 9.7)
                    rank=25;
                else if(mWeight >= 9.1)
                    rank=10;
                else if(mWeight >= 8.7)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=18&&mMonth<21) {
                if (mWeight >= 13.8)
                    rank = 97;
                else if(mWeight >= 13.4)
                    rank=95;
                else if(mWeight >= 12.9)
                    rank=90;
                else if(mWeight >= 12.0)
                    rank=75;
                else if(mWeight >= 11.1)
                    rank=50;
                else if(mWeight >= 10.3)
                    rank=25;
                else if(mWeight >= 9.6)
                    rank=10;
                else if(mWeight >= 9.2)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=21&&mMonth<24) {
                if (mWeight >= 14.6)
                    rank = 97;
                else if(mWeight >= 14.2)
                    rank=95;
                else if(mWeight >= 13.6)
                    rank=90;
                else if(mWeight >= 12.7)
                    rank=75;
                else if(mWeight >= 11.7)
                    rank=50;
                else if(mWeight >= 10.8)
                    rank=25;
                else if(mWeight >= 10.1)
                    rank=10;
                else if(mWeight >= 9.7)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=24&&mMonth<30) {
                if (mWeight >= 15.7)
                    rank = 97;
                else if(mWeight >= 15.2)
                    rank=95;
                else if(mWeight >= 14.6)
                    rank=90;
                else if(mWeight >= 13.5)
                    rank=75;
                else if(mWeight >= 12.5)
                    rank=50;
                else if(mWeight >= 11.6)
                    rank=25;
                else if(mWeight >= 11.2)
                    rank=10;
                else if(mWeight >= 10.9)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=30&&mMonth<36) {
                if (mWeight >= 16.9)
                    rank = 97;
                else if(mWeight >= 16.4)
                    rank=95;
                else if(mWeight >= 15.7)
                    rank=90;
                else if(mWeight >= 14.5)
                    rank=75;
                else if(mWeight >= 13.4)
                    rank=50;
                else if(mWeight >= 12.4)
                    rank=25;
                else if(mWeight >= 11.6)
                    rank=10;
                else if(mWeight >= 11.2)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=36&&mMonth<42) {
                if (mWeight >= 18.1)
                    rank = 97;
                else if(mWeight >= 17.5)
                    rank=95;
                else if(mWeight >= 16.7)
                    rank=90;
                else if(mWeight >= 15.5)
                    rank=75;
                else if(mWeight >= 14.3)
                    rank=50;
                else if(mWeight >= 13.3)
                    rank=25;
                else if(mWeight >= 12.5)
                    rank=10;
                else if(mWeight >= 12.0)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=42&&mMonth<48) {
                if (mWeight >= 19.4)
                    rank = 97;
                else if(mWeight >= 18.8)
                    rank=95;
                else if(mWeight >= 17.9)
                    rank=90;
                else if(mWeight >= 16.6)
                    rank=75;
                else if(mWeight >= 15.3)
                    rank=50;
                else if(mWeight >= 14.2)
                    rank=25;
                else if(mWeight >= 13.3)
                    rank=10;
                else if(mWeight >= 12.9)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=48&&mMonth<54) {
                if (mWeight >= 20.8)
                    rank = 97;
                else if(mWeight >= 20.1)
                    rank=95;
                else if(mWeight >= 19.1)
                    rank=90;
                else if(mWeight >= 17.7)
                    rank=75;
                else if(mWeight >= 16.3)
                    rank=50;
                else if(mWeight >= 15.1)
                    rank=25;
                else if(mWeight >= 14.2)
                    rank=10;
                else if(mWeight >= 13.7)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=54&&mMonth<60) {
                if (mWeight >= 22.4)
                    rank = 97;
                else if(mWeight >= 21.6)
                    rank=95;
                else if(mWeight >= 20.5)
                    rank=90;
                else if(mWeight >= 18.8)
                    rank=75;
                else if(mWeight >= 17.4)
                    rank=50;
                else if(mWeight >= 16.1)
                    rank=25;
                else if(mWeight >= 15.1)
                    rank=10;
                else if(mWeight >= 14.6)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=60&&mMonth<66) {
                if (mWeight >= 24.2)
                    rank = 97;
                else if(mWeight >= 23.3)
                    rank=95;
                else if(mWeight >= 22.0)
                    rank=90;
                else if(mWeight >= 20.1)
                    rank=75;
                else if(mWeight >= 18.4)
                    rank=50;
                else if(mWeight >= 17.1)
                    rank=25;
                else if(mWeight >= 16.1)
                    rank=10;
                else if(mWeight >= 15.5)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=66&&mMonth<72) {
                if (mWeight >= 26.2)
                    rank = 97;
                else if(mWeight >= 25.1)
                    rank=95;
                else if(mWeight >= 23.5)
                    rank=90;
                else if(mWeight >= 21.4)
                    rank=75;
                else if(mWeight >= 19.6)
                    rank=50;
                else if(mWeight >= 18.1)
                    rank=25;
                else if(mWeight >= 16.9)
                    rank=10;
                else if(mWeight >= 16.3)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=72&&mMonth<78) {
                if (mWeight >= 28.4)
                    rank = 97;
                else if(mWeight >= 27.0)
                    rank=95;
                else if(mWeight >= 25.3)
                    rank=90;
                else if(mWeight >= 22.8)
                    rank=75;
                else if(mWeight >= 20.7)
                    rank=50;
                else if(mWeight >= 19.1)
                    rank=25;
                else if(mWeight >= 17.8)
                    rank=10;
                else if(mWeight >= 17.1)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=78&&mMonth<84) {
                if (mWeight >= 30.7)
                    rank = 97;
                else if(mWeight >= 29.2)
                    rank=95;
                else if(mWeight >= 27.1)
                    rank=90;
                else if(mWeight >= 24.3)
                    rank=75;
                else if(mWeight >= 22.0)
                    rank=50;
                else if(mWeight >= 20.1)
                    rank=25;
                else if(mWeight >= 18.6)
                    rank=10;
                else if(mWeight >= 17.9)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=84&&mMonth<96) {
                if (mWeight >= 34.5)
                    rank = 97;
                else if(mWeight >= 32.7)
                    rank=95;
                else if(mWeight >= 30.2)
                    rank=90;
                else if(mWeight >= 26.8)
                    rank=75;
                else if(mWeight >= 23.9)
                    rank=50;
                else if(mWeight >= 21.6)
                    rank=25;
                else if(mWeight >= 19.9)
                    rank=10;
                else if(mWeight >= 19.1)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=96&&mMonth<108) {
                if (mWeight >= 40.1)
                    rank = 97;
                else if(mWeight >= 37.8)
                    rank=95;
                else if(mWeight >= 34.8)
                    rank=90;
                else if(mWeight >= 30.6)
                    rank=75;
                else if(mWeight >= 26.9)
                    rank=50;
                else if(mWeight >= 24.0)
                    rank=25;
                else if(mWeight >= 21.9)
                    rank=10;
                else if(mWeight >= 20.7)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=108&&mMonth<=120) {
                if (mWeight >= 46.1)
                    rank = 97;
                else if(mWeight >= 43.5)
                    rank=95;
                else if(mWeight >= 39.9)
                    rank=90;
                else if(mWeight >= 35.0)
                    rank=75;
                else if(mWeight >= 30.5)
                    rank=50;
                else if(mWeight >= 26.9)
                    rank=25;
                else if(mWeight >= 24.3)
                    rank=10;
                else if(mWeight >= 22.9)
                    rank=5;
                else
                    rank = 3;
            }
        }
        else{ //남
            if(mMonth>=12&&mMonth<15) {
                if (mWeight >= 12.8)
                    rank = 97;
                else if(mWeight >= 12.4)
                    rank=95;
                else if(mWeight >= 12.0)
                    rank=90;
                else if(mWeight >= 11.2)
                    rank=75;
                else if(mWeight >= 10.4)
                    rank=50;
                else if(mWeight >= 9.7)
                    rank=25;
                else if(mWeight >= 9.0)
                    rank=10;
                else if(mWeight >= 8.6)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=15&&mMonth<18) {
                if (mWeight >= 13.6)
                    rank = 97;
                else if(mWeight >= 13.3)
                    rank=95;
                else if(mWeight >= 12.8)
                    rank=90;
                else if(mWeight >= 12.0)
                    rank=75;
                else if(mWeight >= 11.1)
                    rank=50;
                else if(mWeight >= 10.3)
                    rank=25;
                else if(mWeight >= 9.6)
                    rank=10;
                else if(mWeight >= 9.2)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=18&&mMonth<21) {
                if (mWeight >= 14.5)
                    rank = 97;
                else if(mWeight >= 14.1)
                    rank=95;
                else if(mWeight >= 13.5)
                    rank=90;
                else if(mWeight >= 12.7)
                    rank=75;
                else if(mWeight >= 11.7)
                    rank=50;
                else if(mWeight >= 10.9)
                    rank=25;
                else if(mWeight >= 10.2)
                    rank=10;
                else if(mWeight >= 9.5)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=21&&mMonth<24) {
                if (mWeight >= 15.2)
                    rank = 97;
                else if(mWeight >= 14.8)
                    rank=95;
                else if(mWeight >= 14.2)
                    rank=90;
                else if(mWeight >= 13.3)
                    rank=75;
                else if(mWeight >= 12.3)
                    rank=50;
                else if(mWeight >= 11.4)
                    rank=25;
                else if(mWeight >= 10.7)
                    rank=10;
                else if(mWeight >= 10.3)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=24&&mMonth<30) {
                if (mWeight >= 16.3)
                    rank = 97;
                else if(mWeight >= 15.8)
                    rank=95;
                else if(mWeight >= 15.2)
                    rank=90;
                else if(mWeight >= 14.2)
                    rank=75;
                else if(mWeight >= 13.1)
                    rank=50;
                else if(mWeight >= 12.2)
                    rank=25;
                else if(mWeight >= 11.4)
                    rank=10;
                else if(mWeight >= 11.0)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=30&&mMonth<36) {
                if (mWeight >= 17.4)
                    rank = 97;
                else if(mWeight >= 16.9)
                    rank=95;
                else if(mWeight >= 16.2)
                    rank=90;
                else if(mWeight >= 15.1)
                    rank=75;
                else if(mWeight >= 14.0)
                    rank=50;
                else if(mWeight >= 13.0)
                    rank=25;
                else if(mWeight >= 12.2)
                    rank=10;
                else if(mWeight >= 11.8)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=36&&mMonth<42) {
                if (mWeight >= 18.6)
                    rank = 97;
                else if(mWeight >= 18.1)
                    rank=95;
                else if(mWeight >= 17.3)
                    rank=90;
                else if(mWeight >= 16.1)
                    rank=75;
                else if(mWeight >= 14.9)
                    rank=50;
                else if(mWeight >= 14.9)
                    rank=25;
                else if(mWeight >= 13.0)
                    rank=10;
                else if(mWeight >= 12.5)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=42&&mMonth<48) {
                if (mWeight >= 20.1)
                    rank = 97;
                else if(mWeight >= 19.5)
                    rank=95;
                else if(mWeight >= 18.6)
                    rank=90;
                else if(mWeight >= 17.2)
                    rank=75;
                else if(mWeight >= 15.9)
                    rank=50;
                else if(mWeight >= 14.8)
                    rank=25;
                else if(mWeight >= 13.8)
                    rank=10;
                else if(mWeight >= 13.3)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=48&&mMonth<54) {
                if (mWeight >= 21.7)
                    rank = 97;
                else if(mWeight >= 21.0)
                    rank=95;
                else if(mWeight >= 20.0)
                    rank=90;
                else if(mWeight >= 18.4)
                    rank=75;
                else if(mWeight >= 17.0)
                    rank=50;
                else if(mWeight >= 15.7)
                    rank=25;
                else if(mWeight >= 14.7)
                    rank=10;
                else if(mWeight >= 14.2)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=54&&mMonth<60) {
                if (mWeight >= 23.6)
                    rank = 97;
                else if(mWeight >= 22.7)
                    rank=95;
                else if(mWeight >= 21.5)
                    rank=90;
                else if(mWeight >= 19.7)
                    rank=75;
                else if(mWeight >= 18.1)
                    rank=50;
                else if(mWeight >= 16.7)
                    rank=25;
                else if(mWeight >= 15.7)
                    rank=10;
                else if(mWeight >= 15.1)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=60&&mMonth<66) {
                if (mWeight >= 25.7)
                    rank = 97;
                else if(mWeight >= 24.6)
                    rank=95;
                else if(mWeight >= 23.1)
                    rank=90;
                else if(mWeight >= 21.0)
                    rank=75;
                else if(mWeight >= 19.2)
                    rank=50;
                else if(mWeight >= 17.7)
                    rank=25;
                else if(mWeight >= 16.6)
                    rank=10;
                else if(mWeight >= 16.0)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=66&&mMonth<72) {
                if (mWeight >= 28.0)
                    rank = 97;
                else if(mWeight >= 26.6)
                    rank=95;
                else if(mWeight >= 24.8)
                    rank=90;
                else if(mWeight >= 22.4)
                    rank=75;
                else if(mWeight >= 20.4)
                    rank=50;
                else if(mWeight >= 18.8)
                    rank=25;
                else if(mWeight >= 17.6)
                    rank=10;
                else if(mWeight >= 16.9)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=72&&mMonth<78) {
                if (mWeight >= 30.4)
                    rank = 97;
                else if(mWeight >= 28.8)
                    rank=95;
                else if(mWeight >= 26.7)
                    rank=90;
                else if(mWeight >= 23.9)
                    rank=75;
                else if(mWeight >= 21.6)
                    rank=50;
                else if(mWeight >= 19.8)
                    rank=25;
                else if(mWeight >= 18.5)
                    rank=10;
                else if(mWeight >= 17.8)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=78&&mMonth<84) {
                if (mWeight >= 32.9)
                    rank = 97;
                else if(mWeight >= 31.0)
                    rank=95;
                else if(mWeight >= 28.6)
                    rank=90;
                else if(mWeight >= 25.4)
                    rank=75;
                else if(mWeight >= 22.9)
                    rank=50;
                else if(mWeight >= 20.9)
                    rank=25;
                else if(mWeight >= 19.4)
                    rank=10;
                else if(mWeight >= 18.7)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=84&&mMonth<96) {
                if (mWeight >= 36.9)
                    rank = 97;
                else if(mWeight >= 34.6)
                    rank=95;
                else if(mWeight >= 31.7)
                    rank=90;
                else if(mWeight >= 27.9)
                    rank=75;
                else if(mWeight >= 24.8)
                    rank=50;
                else if(mWeight >= 22.5)
                    rank=25;
                else if(mWeight >= 20.8)
                    rank=10;
                else if(mWeight >= 19.9)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=96&&mMonth<108) {
                if (mWeight >= 42.6)
                    rank = 97;
                else if(mWeight >= 39.9)
                    rank=95;
                else if(mWeight >= 36.3)
                    rank=90;
                else if(mWeight >= 31.7)
                    rank=75;
                else if(mWeight >= 27.8)
                    rank=50;
                else if(mWeight >= 24.8)
                    rank=25;
                else if(mWeight >= 22.7)
                    rank=10;
                else if(mWeight >= 21.6)
                    rank=5;
                else
                    rank = 3;
            }
            else if(mMonth>=108&&mMonth<=120) {
                if (mWeight >= 48.7)
                    rank = 97;
                else if(mWeight >= 45.7)
                    rank=95;
                else if(mWeight >= 41.6)
                    rank=90;
                else if(mWeight >= 36.1)
                    rank=75;
                else if(mWeight >= 31.3)
                    rank=50;
                else if(mWeight >= 27.6)
                    rank=25;
                else if(mWeight >= 24.9)
                    rank=10;
                else if(mWeight >= 23.5)
                    rank=5;
                else
                    rank = 3;
            }
        }
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
