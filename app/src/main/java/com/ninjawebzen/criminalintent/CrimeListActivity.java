package com.ninjawebzen.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by VKurochkin on 1/5/2017.
 */

public class CrimeListActivity extends
        SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

