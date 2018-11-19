package totalenglish.irfanullah.com.totalenglish;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd;

public class LessonDetail extends AppCompatActivity {

    private ImageView IV_AD;
    String AD_URL = "";
    private Context context;
    UnifiedNativeAd unifiedNativeAd;
    private Button startLesson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_detail);
        IV_AD = findViewById(R.id.imageView10);
        context = this;
        startLesson = findViewById(R.id.startLesson);

        startLesson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),PagerTesting.class);
                startActivity(i);
            }
        });

        MobileAds.initialize(this, getResources().getString(R.string.admob_app1_id));
        AdLoader adLoader = new AdLoader.Builder(this, getResources().getString(R.string.native_ad))
                .forUnifiedNativeAd(new UnifiedNativeAd.OnUnifiedNativeAdLoadedListener() {
                    @Override
                    public void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
                        setAd(unifiedNativeAd);
                        // Show the ad.
                       // Toast.makeText(getApplicationContext(),"Native Ad: "+unifiedNativeAd.getImages().get(0).getUri().toString(),Toast.LENGTH_LONG).show();
                            if(unifiedNativeAd.getImages().size() > 0)
                            {
                                Toast.makeText(getApplicationContext(),"Native Ad: "+unifiedNativeAd.getImages().get(0).getUri().toString(),Toast.LENGTH_LONG).show();
                                IV_AD.setImageDrawable(unifiedNativeAd.getImages().get(0).getDrawable());

                            }



                    }


                })
                .withAdListener(new AdListener() {
                    @Override
                    public void onAdFailedToLoad(int errorCode) {
                        // Handle the failure by logging, altering the UI, and so on.
                        Toast.makeText(getApplicationContext(),Integer.toString(errorCode),Toast.LENGTH_LONG).show();

                    }
                })
                .withAdListener(new AdListener(){
                    @Override
                    public void onAdClicked() {
                        super.onAdClicked();
                       // Toast.makeText(getApplicationContext(), "working",Toast.LENGTH_LONG).show();
                    }
                })
                .withNativeAdOptions(new NativeAdOptions.Builder()
                        // Methods in the NativeAdOptions.Builder class can be
                        // used here to specify individual options settings.
                        .build())
                .build();

        adLoader.loadAds(new AdRequest.Builder().build(),1);

    }

    public void setAd(UnifiedNativeAd unifiedNativeAd)
    {
        this.unifiedNativeAd = unifiedNativeAd;
    }

    public UnifiedNativeAd getAd()
    {
        return this.unifiedNativeAd;
    }
}
