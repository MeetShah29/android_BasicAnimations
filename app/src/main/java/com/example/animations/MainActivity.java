package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView ben,bean;
    Button button,changeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ben=findViewById(R.id.benImage);
        bean=findViewById(R.id.beanImage);
        button=findViewById(R.id.animateButton);
        changeButton=findViewById(R.id.changeButton);
    }



    public void fadeBen(View view){
        ben.animate().alpha(0f).setDuration(2000);
        bean.animate().alpha(1f).setDuration(2000);

    }
    public void fadeOut(View view){
        ben.animate().alpha(1f).setDuration(2000);
        ben.setTranslationY(-1000f);
        bean.animate().translationXBy(-1000f).setDuration(2000);
        button.animate().alpha(1f).setDuration(2000);
    }
    public void onAnimate(View view){
        ben.animate().translationYBy(1000f).setDuration(2000);
        button.animate().alpha(0f).setDuration(2000);
        changeButton.animate().alpha(1f).setDuration(1000);
    }
    public void onClickChange(View view){
        ben.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        bean.animate()
                .translationXBy(1000f)
                .translationYBy(100f)
                .rotation(3600)
                .setDuration(2000);
    }
}