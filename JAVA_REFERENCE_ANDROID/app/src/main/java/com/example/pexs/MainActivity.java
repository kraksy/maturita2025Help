package com.example.pexs;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public int sc = 0;

    ImageView img;
    TextView score;
    Button button;

    ImageView firstCard;
    ImageView secondCard;

    public void toGame()
    {
        setContentView(R.layout.activity_game);
        game();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.imageView);
        score = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        img.setImageDrawable(getDrawable(R.drawable.cardback));
        score.setText("score :" +  sc);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toGame();
            }
        });

    }

    ImageView[][] cardViews = new ImageView[4][8];

    public void initGame()
    {
        for(int y = 0; y < 8; y++)
        {
            for(int x= 0; x < 4; x++)
            {
                for (int i = 2; i < 32; i++)
                {
                    cardViews[x][y] = (ImageView) findViewById(i);
                }
            }
        }
    }

    public void game()
    {
        initGame();
        for (int y = 0; y < 8; y++)
        {
            for (int x = 0; x < 4; x++)
            {
                cardViews[y][x].setImageDrawable(getDrawable(R.drawable.cardback));

                cardViews[y][x].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
            }
        }
    }
}