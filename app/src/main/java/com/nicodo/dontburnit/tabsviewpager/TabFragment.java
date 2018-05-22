package com.nicodo.dontburnit.tabsviewpager;

import android.app.Fragment;
import android.os.Bundle;

public class TabFragment extends Fragment {

    private int position;
    private static final String POS = "pos";

    public static Fragment getInstance(int position){
        Bundle bundle = new Bundle();
        bundle.putInt(POS, position);
        TabFragment tab = new TabFragment();
        tab.setArguments(bundle);
        return tab;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
