package totalenglish.irfanullah.com.totalenglish.LessonFragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import totalenglish.irfanullah.com.totalenglish.R;

public class QuizHolderFragment extends Fragment {
public static int i =0;
private static final String KEY_ARGS = "Quiz";
    public static QuizHolderFragment newInstance(int position, String key)
    {
        i = position;
        QuizHolderFragment fragment = new QuizHolderFragment();
        Bundle args = new Bundle();
        args.putString(KEY_ARGS,key);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(i ==1 || i == 0) {
            return inflater.inflate(R.layout.quiz_page_layout, container, false);
        }
        else if(i == 2)
        {
            return inflater.inflate(R.layout.matchphrasefrag_layout, container, false);

        }

        else if(i == 3)
        {
            return inflater.inflate(R.layout.write_and_listen, container, false);

        }
        else
        {
            return inflater.inflate(R.layout.quiz_page_layout, container, false);

        }
    }
}
