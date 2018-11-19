package totalenglish.irfanullah.com.totalenglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LanguageActivity extends AppCompatActivity implements View.OnClickListener {

    private Button aBtn, fBtn, pBtn,sBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        aBtn = findViewById(R.id.arabicBtn);
        fBtn = findViewById(R.id.frenchBtn);
        pBtn = findViewById(R.id.portuguesBtn);
        sBtn = findViewById(R.id.spanishBtn);

        aBtn.setOnClickListener(this);
        fBtn.setOnClickListener(this);
        pBtn.setOnClickListener(this);
        sBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent lessonsActivity = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(lessonsActivity);
    }
}
