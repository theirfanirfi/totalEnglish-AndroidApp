package totalenglish.irfanullah.com.totalenglish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GoPremiumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.go_prem_layout);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
