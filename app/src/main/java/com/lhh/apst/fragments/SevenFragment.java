package com.lhh.apst.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lhh.apst.advancedpagerslidingtabstrip.R;

/**
 * Created by linhonghong on 2015/8/11.
 */
public class SevenFragment extends Fragment {

    public static SevenFragment instance() {
        SevenFragment view = new SevenFragment();
        return view;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fourth_fragment, null);
        return view;
    }
}