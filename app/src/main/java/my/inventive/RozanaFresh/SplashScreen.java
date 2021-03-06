package my.inventive.RozanaFresh;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

import my.inventive.RozanaFresh.R;

public class SplashScreen extends FragmentActivity {


    private Animation animation;
    private ImageView logo;
    private TextView appTitle;
    private TextView appSlogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        logo = findViewById(R.id.logo);
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    endSplash();
                }
            }, 4000);
    }

    private void endSplash() {
              Intent intent = new Intent(getApplicationContext(),
                     StartActivity.class);
                startActivity(intent);
                finish();
    }

    @Override
    public void onBackPressed() {
        // Do nothing
    }

}
