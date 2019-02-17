package com.example.prince.multiscreen.Adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.prince.multiscreen.Fragments.NumbersFragment;
import com.example.prince.multiscreen.R;
import com.example.prince.multiscreen.Fragments.colorsFragment;
import com.example.prince.multiscreen.Fragments.familyFragment;

public class CategoryAdapter extends FragmentPagerAdapter {
    /** Context of the app */
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new familyFragment();
        } else {
            return new colorsFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_songs);
        } else if (position == 1) {
            return mContext.getString(R.string.category_playlist);
        } else  {
            return mContext.getString(R.string.category_online);
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
