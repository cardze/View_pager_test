package com.example.view_pager_test;

import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

class mypagerAdapter extends PagerAdapter {
    private ArrayList<View> pageview1;
    public mypagerAdapter(ArrayList<View> pageview1){
        this.pageview1 = pageview1;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        Log.d("MainActivityDestroy",position+"");
        if (pageview1.get(position)!=null) {
            container.removeView(pageview1.get(position));
        }
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(pageview1.get(position));
        Log.d("MainActivityInstanti",position+"");
        return pageview1.get(position);
    }

    @Override
    public int getCount() {
        return pageview1.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return object==view;
    }
}