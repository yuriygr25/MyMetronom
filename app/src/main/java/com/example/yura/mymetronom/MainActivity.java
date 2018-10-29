package com.example.yura.mymetronom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        RotateAnimation rAnim = new RotateAnimation(-30, 60, 100, 180);
        rAnim.setRepeatMode(Animation.REVERSE);
        rAnim.setRepeatCount(Animation.INFINITE);
        rAnim.setInterpolator(new LinearInterpolator());
        rAnim.setDuration(1000L);

        ImageView imgview = (ImageView) findViewById(R.id.imageView1);
        imgview.startAnimation(rAnim);
    }
}
