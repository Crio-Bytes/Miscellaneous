package com.riseinsteps.myphotoframe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String [] names = {"Bill Gates", "Rohit", "SRK", "Virat" };
    ImageButton prev, next;
    ImageView pic;
    TextView text;
    int currentImage ;
    // 0-1-2-3-4-0-1-2-3-4


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void prev(View v){
        text = findViewById(R.id.text);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        // set the value of currentImage in such a way it repeats in a circulatory pattern.
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        // Set the value of alpha so that the image should be visible
        // Set the text for the names of the images

    }

    public void next(View v){
        text = findViewById(R.id.text);
        // write your code here

    }
}
