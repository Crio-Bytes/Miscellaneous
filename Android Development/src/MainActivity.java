package com.riseinsteps.tictactoe;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    boolean activeGame = true;
    int activePlayer = 0;
    int gameState[] = {2,2,2,2,2,2,2,2,2};
    int[][] winPositions = {
            {0,1,2},{3,4,5},{6,7,8},
            {0,3,6},{1,4,7},{2,5,8},
            {0,4,8},{6,4,2}
    };

    public void clickPlayer(View view){
        ImageView img = (ImageView) view;
        int cell = Integer.parseInt(img.getTag().toString());

        //Condition for game is not active but user wants to play

        //set the text id by method findviewbyid
//        TextView result = findViewById();



        if(gameState[cell] == 2 && activeGame){
            gameState[cell] = activePlayer;
            img.setTranslationY(-1000f);

            if(activePlayer == 0){
                img.setImageResource(R.drawable.x);
                activePlayer = 1;
            } else{
                img.setImageResource(R.drawable.o);
                activePlayer = 0;
                TextView result;
//                  Set the Text of TextView(result) and shown below in the screen as a status bar
//                result.setText();
//
            }
            // Use property to animate the images
        }


        for(int[] winpos: winPositions){
            if(gameState[winpos[0]] == gameState[winpos[1]] && gameState[winpos[1]] == gameState[winpos[2]]
            && gameState[winpos[0]]!=2){
                if(gameState[winpos[0]] == 0){
//                    winner;
//                } else{
                    winner ="O won";
                }
//          Set text who is the winner of the game
                activeGame = false;
            }
        }
    }

    public void gameReset(View view){
       // Set Default Values 0 or none for all the variables when the gameReset calls.

        ((ImageView) findViewById(R.id.imageView1)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView8)).setImageResource(0);
        ((ImageView) findViewById(R.id.imageView9)).setImageResource(0);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}