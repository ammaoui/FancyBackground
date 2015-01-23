package tslamic.com.fancybackground;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import tslamic.com.fancybg.FancyBackground;


public class MainActivity extends ActionBarActivity implements FancyBackground.FancyListener {

    private static final String TAG = "FancyBackground";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final View view = findViewById(R.id.view);
        FancyBackground
                .on(view)
                .listener(this)
                .interval(3000)
                .set(R.drawable.fancy_bg_0, R.drawable.fancy_bg_1, R.drawable.fancy_bg_2)
                .inAnimation(android.R.anim.fade_in)
                .outAnimation(android.R.anim.fade_out)
                .cache(null)
                .scale(ImageView.ScaleType.FIT_XY)
                .start();

//        final View colors = findViewById(R.id.colors);
//        FancyBackground
//                .on(colors)
//                .interval(1500)
//                .set(R.drawable.easy_blue, R.drawable.red, R.drawable.blue)
//                .start();
    }

    @Override
    public void onStarted(FancyBackground bg) {
        Log.d(TAG, "onStarted");
    }

    @Override
    public void onNew(FancyBackground bg) {
        Log.d(TAG, "onNew");
    }

    @Override
    public void onStopped(FancyBackground bg) {
        Log.d(TAG, "onStopped");
    }

    @Override
    public void onLoopDone(FancyBackground bg) {
        Log.d(TAG, "onLoopDone");
    }

}