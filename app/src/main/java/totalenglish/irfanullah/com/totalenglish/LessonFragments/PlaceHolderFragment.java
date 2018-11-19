package totalenglish.irfanullah.com.totalenglish.LessonFragments;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import totalenglish.irfanullah.com.totalenglish.QuizActivity;
import totalenglish.irfanullah.com.totalenglish.R;

public class PlaceHolderFragment extends Fragment {

    private static final String ARG_SCOUT_KEY = "scout_key";
    private static int i = 0;
    private  static int mLAST_FRAG = 0;

    public static PlaceHolderFragment newInstance(String key, int position, int LAST_FRAG) {
i = position;
            mLAST_FRAG =  LAST_FRAG;
        PlaceHolderFragment fragment = new PlaceHolderFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SCOUT_KEY, key);
        fragment.setArguments(args);
        return fragment;
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lesson_items,container,false);
        ImageView iv = view.findViewById(R.id.lesson_img);
        ImageView dl = view.findViewById(R.id.dottedline);
        TextView title = view.findViewById(R.id.item_title);
        TextView title2 = view.findViewById(R.id.item_title2);
        Button qBtn = view.findViewById(R.id.startquiz);
        qBtn.setVisibility(View.GONE);

        if(i == 2)
        {
            iv.setVisibility(View.GONE);
            title2.setVisibility(View.GONE);
            dl.setVisibility(View.GONE);


        }

        if(i == mLAST_FRAG-1)
        {
            qBtn.setVisibility(View.VISIBLE);
            qBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent quizActivity = new Intent(getContext(),QuizActivity.class);
                    startActivity(quizActivity);
                }
            });

        }



        return view;
    }


}
