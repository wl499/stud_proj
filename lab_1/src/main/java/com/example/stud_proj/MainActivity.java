package com.example.stud_proj;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView myTextView;

    Button myButton;

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        myTextView = findViewById(R.id.textView);
        myButton = findViewById(R.id.button);
        imageButton = findViewById(R.id.imageButton);
        myButton.setOnClickListener(oMyButton);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    View.OnClickListener oMyButton = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int counter = 0;
            myTextView.setText(String.valueOf(++counter));
            imageButton.setVisibility(View.VISIBLE);
        }
    };
}