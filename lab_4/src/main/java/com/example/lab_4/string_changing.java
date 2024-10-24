package com.example.lab_4;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.res.Resources;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class string_changing extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_string_changing);
        Resources resources = getResources();
        int textColor = resources.getColor(R.color.textViewFontColor, null);
        int backgroundColor = resources.getColor(R.color.textViewBackColor, null);
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        TextView textView = new TextView(this);
        textView.setText("Hello Android!");
        textView.setTextSize(32);
        // COLOR
        textView.setTextColor(textColor);
        textView.setBackgroundColor(backgroundColor);
        textView.setLayoutParams(layoutParams);
        constraintLayout.addView(textView);
        setContentView(constraintLayout);
    }
}