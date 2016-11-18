package com.lhh.apst.advancedpagerslidingtabstrip;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;

import com.lhh.apst.fragments.EightFragment;
import com.lhh.apst.fragments.FirstFragment;
import com.lhh.apst.fragments.FiveFragment;
import com.lhh.apst.fragments.FourthFragment;
import com.lhh.apst.fragments.SecondFragment;
import com.lhh.apst.fragments.SevenFragment;
import com.lhh.apst.fragments.SixFragment;
import com.lhh.apst.fragments.ThirdFragment;
import com.lhh.apst.library.AdvancedPagerSlidingTabStrip;

/**
 * Created by linhonghong on 2015/8/10.
 */
public class NormalTabActivity extends ActionBarActivity implements ViewPager.OnPageChangeListener {

    public AdvancedPagerSlidingTabStrip mAPSTS;
    public APSTSViewPager mVP;

    private static final int VIEW_FIRST = 0;
    private static final int VIEW_SECOND = 1;
    private static final int VIEW_THIRD = 2;
    private static final int VIEW_FOURTH = 3;
    private static final int VIEW_FIVE = 4;
    private static final int VIEW_SIX = 5;
    private static final int VIEW_SEVEN = 6;
    private static final int VIEW_EIGH = 7;

    private static final int VIEW_SIZE = 8;

    private FirstFragment mFirstFragment = null;
    private SecondFragment mSecondFragment = null;
    private ThirdFragment mThirdFragment = null;
    private FourthFragment mFourthFragment = null;
    private FiveFragment mFiveFragment = null;
    private SixFragment mSixFragment = null;
    private SevenFragment mSevenFragment = null;
    private EightFragment mEightFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_tab);
        findViews();
        init();
    }

    private void findViews() {
        mAPSTS = (AdvancedPagerSlidingTabStrip) findViewById(R.id.tabs);
        mVP = (APSTSViewPager) findViewById(R.id.vp_main);
    }

    private void init() {
        mVP.setOffscreenPageLimit(VIEW_SIZE);
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());

        mVP.setAdapter(new FragmentAdapter(getSupportFragmentManager()));

        adapter.notifyDataSetChanged();
        mAPSTS.setViewPager(mVP);
        mAPSTS.setOnPageChangeListener(this);
//        mAPSTS.showDot(VIEW_FIRST);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public class FragmentAdapter extends FragmentStatePagerAdapter {

        public FragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position >= 0 && position < VIEW_SIZE) {
                switch (position) {
                    case VIEW_FIRST:
                        if (null == mFirstFragment)
                            mFirstFragment = FirstFragment.instance();
                        return mFirstFragment;

                    case VIEW_SECOND:
                        if (null == mSecondFragment)
                            mSecondFragment = SecondFragment.instance();
                        return mSecondFragment;

                    case VIEW_THIRD:
                        if (null == mThirdFragment)
                            mThirdFragment = ThirdFragment.instance();
                        return mThirdFragment;

                    case VIEW_FOURTH:
                        if (null == mFourthFragment)
                            mFourthFragment = FourthFragment.instance();
                        return mFourthFragment;
                    case VIEW_FIVE:
                        if (null == mFiveFragment)
                            mFiveFragment = FiveFragment.instance();
                        return mFiveFragment;
                    case VIEW_SIX:
                        if (null == mSixFragment)
                            mSixFragment = SixFragment.instance();
                        return mSixFragment;
                    case VIEW_SEVEN:
                        if (null == mSevenFragment)
                            mSevenFragment = SevenFragment.instance();
                        return mSevenFragment;

                    case VIEW_EIGH:
                        if (null == mEightFragment)
                            mEightFragment = EightFragment.instance();
                        return mEightFragment;
                    default:
                        break;
                }
            }
            return null;
        }

        @Override
        public int getCount() {
            return VIEW_SIZE;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if (position >= 0 && position < VIEW_SIZE) {
                switch (position) {
                    case VIEW_FIRST:
                        return "张无忌";
                    case VIEW_SECOND:
                        return "范遥";
                    case VIEW_THIRD:
                        return "杨逍";
                    case VIEW_FOURTH:
                        return "紫衫龙王";
                    case VIEW_FIVE:

                        return "白眉鹰王";
                    case VIEW_SIX:
                        return "金毛狮王";

                    case VIEW_SEVEN:

                        return "白眉鹰王";
                    case VIEW_EIGH:
                        return "金毛狮王";
                    default:
                        break;
                }
            }
            return null;
        }
//
//        @Override
//        public float getPageWeight(int position) {
//            if(position >= 0 && position < VIEW_SIZE){
//                switch (position){
//                    case  VIEW_FIRST:
//                        return  1.0f;
//                    case  VIEW_SECOND:
//                        return  2.0f;
//                    case  VIEW_THIRD:
//                        return  2.0f;
//                    case  VIEW_FOURTH:
//                        return  1.0f;
//                    default:
//                        break;
//                }
//            }
//            return 1.0f;
//        }
    }
}
