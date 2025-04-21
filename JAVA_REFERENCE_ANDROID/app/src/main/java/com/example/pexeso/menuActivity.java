package com.example.pexeso;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class menuActivity extends AppCompatActivity {

    ImageView img;
    TextView text;
    Button btn;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.menu);

        this.img = (ImageView)findViewById(R.id.logo);
        this.text = (TextView)findViewById(R.id.score);
        this.btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener();


    }
}
