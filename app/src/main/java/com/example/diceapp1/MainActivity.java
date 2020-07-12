package com.example.diceapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button b1;
ImageView i1,i2,i3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int images[]={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};
        b1=(Button)findViewById(R.id.button);
        i1=(ImageView)findViewById(R.id.imageView);
        i2=(ImageView)findViewById(R.id.imageView2);
        i3=(ImageView)findViewById(R.id.imageView3);
        final MediaPlayer mp=MediaPlayer.create(this,R.raw.dice_sound);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("diceapp1","thanks for enrolling");
                Random i=new Random();

                int randomnum=i.nextInt(6);
                Log.i("diceapp1","your number of dice is"+randomnum);
                i2.setImageResource(images[randomnum]);
                int km=i.nextInt(6);
                i3.setImageResource(images[km]);
                mp.start();


            }
        });
    }
}
