package totalenglish.irfanullah.com.totalenglish;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

import totalenglish.irfanullah.com.totalenglish.LessonFragments.PlaceHolderFragment;

public class FPAdapter extends FragmentStatePagerAdapter {

    List<String> mKeyList = new ArrayList<>();
    private static int LAST_FRAG = 0;

    public FPAdapter(FragmentManager fm, int LAST_FRAG) {
        super(fm);
        this.LAST_FRAG = LAST_FRAG;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceHolderFragment.newInstance(mKeyList.get(position),position, LAST_FRAG);
    }
    @Override
    public int getCount() {
        return mKeyList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "SCOUT " + (getCount() - position);
    }

    public void add(int position, String key) {
        mKeyList.add(position, key);
        notifyDataSetChanged();
    }

    public int getFragmentsSize()
    {
        return mKeyList.size();
    }

}
