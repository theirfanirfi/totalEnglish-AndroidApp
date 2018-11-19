package totalenglish.irfanullah.com.totalenglish.LessonFragments;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class QuizFragmentAdapter extends FragmentStatePagerAdapter {

    List<String> mKeyList = new ArrayList<>();
    public QuizFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {


        return QuizHolderFragment.newInstance(i, mKeyList.get(i));
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }

    @Override
    public int getCount() {
        return mKeyList.size();

    }

    public void add(int index,String title)
    {
        mKeyList.add(index,title);
        notifyDataSetChanged();
    }

    public int getFragSize()
    {
        return mKeyList.size();
    }
}
