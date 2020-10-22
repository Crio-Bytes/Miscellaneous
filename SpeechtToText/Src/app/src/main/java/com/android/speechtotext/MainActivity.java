
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   private ImageButton imageButton;
   private TextView textView;
   protected static final int RESULT_SPEECH=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 //assign imagebutton as which you give id for Imagebutton
        textView= findViewById(R.id.textView);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE,"hi-IN");
               try {
                   startActivityForResult(intent,RESULT_SPEECH);
                }catch (ActivityNotFoundException e)
               {
                   Toast.makeText(getApplicationContext(),"your device is not supported",Toast.LENGTH_SHORT).show();
                   e.printStackTrace();
               }


            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
         switch (requestCode){
            case RESULT_SPEECH:
                if(resultCode==RESULT_OK && data !=null)
                {
                    ArrayList<String> text =data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    textView.setText(text.get(0));

                }
                break;


        }
    }
}
