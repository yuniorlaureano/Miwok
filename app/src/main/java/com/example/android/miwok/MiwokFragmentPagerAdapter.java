package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MiwokFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String tabTiles[] = new String[]{ "Number","Phrase","Colors","Family"};
    private Context context;

    public MiwokFragmentPagerAdapter(FragmentManager fm, Context context){
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment current = null;
        switch (position)
        {
            case 0: current = NumbersFragment.newInstance();
                break;
            case 1: current = PhraseFragment.newInstance();
                break;
            case 2: current = ColorsFragment.newInstance();
                break;
            case 3: current = FamilyFragment.newInstance();
                break;
        }

        return  current;
    }

    @Override
    public int getCount() {
        return this.PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTiles[position];
    }
}
