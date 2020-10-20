package com.riseinsteps.tictactoe;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean activeGame; // set default value of activeGame to "true"
    
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

        
        // Sets the condition if the value of activeGame is "False"
        
         if (!activeGame){
        // write your code here to call  the function "gameReset"
        }
        
        
        if(gameState[cell] == 2 && activeGame){
            gameState[cell] = activePlayer;
            img.setTranslationY(-1000f);

            if(activePlayer == 0){
                img.setImageResource(R.drawable.x);
                activePlayer = 1;
                
                // set the value of status to the Id of status with the method "FindViewByid"
                TextView status;
                status.setText("O's Turn");
            } else{
                img.setImageResource(R.drawable.o);
                activePlayer = 0;
                // set the value of status to the Id of status with the method "FindViewByid"
                TextView status;
                status.setText("X's Turn");
            }
            img.animate().translationYBy(1000f).setDuration(300);
        }


        for(int[] winpos: winPositions){
            String winner = "";
            if(gameState[winpos[0]] == gameState[winpos[1]] && gameState[winpos[1]] == gameState[winpos[2]]
                    && gameState[winpos[0]]!=2){
                if(gameState[winpos[0]] == 0){
                    winner = "X won";
                } else{
                    winner ="O won";
                }
                TextView status;
                // write the code to set the text of status to "winner"
                activeGame = false;
            }
        }
    }

    public void gameReset(View view){
        activeGame = true;
        activePlayer = 0;
        for (int i = 0; i < gameState.length; i++){
            gameState[i] = 2;
        }
        TextView status ;
        status.setText("Tap to Play");

        // set the ImageResources to "0" of all imageView
        ((ImageView) findViewById(R.id.imageView1)).setImageResource(0);


        // write the code for set the ImageResources to "0" of all imageView
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}