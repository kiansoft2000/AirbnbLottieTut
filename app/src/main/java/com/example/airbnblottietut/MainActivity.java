package com.example.airbnblottietut;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    //public final static String TAG = "Loop";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView animationView = findViewById(R.id.animationView_main);
        Button playButton = findViewById(R.id.btn_main_play);


        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               animationView.playAnimation();
               animationView.setRepeatCount(5);
               //animationView.setRepeatMode(Animation.REVERSE);
               //animationView.setProgress(0.5f);

            }
        });

        animationView.addAnimatorListener(new Animator.AnimatorListener() {

            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }


        });

        //--------------------------------------------------Animation Update

        animationView.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                animation.getAnimatedValue();
            }
        });

    }
}