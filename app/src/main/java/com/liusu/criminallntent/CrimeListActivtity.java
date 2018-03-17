package com.liusu.criminallntent;

import android.support.v4.app.Fragment;

/**
 * Created by liusu on 18-3-17.
 */

public class CrimeListActivtity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
