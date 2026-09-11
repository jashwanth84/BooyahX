//For set fragment to viewpager via sectionpager adapter
package com.BooyahX.ui.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.BooyahX.ui.activities.HomeActivity;
import com.BooyahX.ui.fragments.EarnFragment;
import com.BooyahX.ui.fragments.MeFragment;
import com.BooyahX.ui.fragments.PlayFragment;

public class SectionsPagerAdapter extends FragmentPagerAdapter {



    public SectionsPagerAdapter(HomeActivity homeActivity, @NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                EarnFragment tab1 = new EarnFragment();
                return tab1;
            case 1:
                PlayFragment tab2 = new PlayFragment();
                return tab2;
            case 2:
                MeFragment tab3 = new MeFragment();
                return tab3;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return 3;
    }
}