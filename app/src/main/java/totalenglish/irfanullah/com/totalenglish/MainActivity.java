package totalenglish.irfanullah.com.totalenglish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    //the adapter holds the data
    RecyclerView.Adapter adapter;
    //Layout manager is responsible for every single item
    RecyclerView.LayoutManager layoutManager;
    List<Lessons> lessonsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
       recyclerView = findViewById(R.id.rv);
        //will not change, no matter how many items are there.
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        lessonsList = new ArrayList<>();
        lessonsList.add(new Lessons("Irfan"));
        lessonsList.add(new Lessons("Inam"));
        lessonsList.add(new Lessons("Farman"));
        lessonsList.add(new Lessons("Tahir"));
        lessonsList.add(new Lessons("Sikandar"));
        lessonsList.add(new Lessons("Zeeshan"));
        lessonsList.add(new Lessons("Fizagat"));
        lessonsList.add(new Lessons("Azmat"));
        lessonsList.add(new Lessons("Zeeshan"));
        lessonsList.add(new Lessons("Charbagh"));
        lessonsList.add(new Lessons("Hasnain"));
        adapter = new LessonsDisplayingRecyclerView(this,lessonsList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
