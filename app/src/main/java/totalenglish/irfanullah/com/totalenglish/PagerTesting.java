package totalenglish.irfanullah.com.totalenglish;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PagerTesting extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_testing);
        viewPager = findViewById(R.id.pager);

        int LAST_FRAG = 4;
        FPAdapter adapter = new FPAdapter(getSupportFragmentManager(),LAST_FRAG);
        adapter.add(0,"one");
        adapter.add(1,"one");
        adapter.add(2,"one");
        adapter.add(3,"one");
        viewPager.setAdapter(adapter);



    }


}
