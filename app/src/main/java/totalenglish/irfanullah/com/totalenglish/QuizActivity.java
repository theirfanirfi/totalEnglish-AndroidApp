package totalenglish.irfanullah.com.totalenglish;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import totalenglish.irfanullah.com.totalenglish.LessonFragments.QuizFragmentAdapter;

public class QuizActivity extends AppCompatActivity {

    ViewPager viewPager;
    //Button nextQuizBtn;
    int QUIZ_FRAGS = 0;
    int INCREMENT_NEXT_QUIZ_CLICK = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        viewPager = findViewById(R.id.QuizviewPager);
       // nextQuizBtn = findViewById(R.id.nextQuizBtn);
        QuizFragmentAdapter adapter = new QuizFragmentAdapter(getSupportFragmentManager());
        adapter.add(0,"one");
        adapter.add(1,"1");
        adapter.add(2,"2");
        adapter.add(3,"3");
        QUIZ_FRAGS = adapter.getFragSize();
        viewPager.setAdapter(adapter);

//        nextQuizBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            if(QUIZ_FRAGS > 0 && !(INCREMENT_NEXT_QUIZ_CLICK >= QUIZ_FRAGS))
//            {
//                INCREMENT_NEXT_QUIZ_CLICK++;
//               viewPager.setCurrentItem(INCREMENT_NEXT_QUIZ_CLICK);
//            }
//            }
//        });
    }
}
