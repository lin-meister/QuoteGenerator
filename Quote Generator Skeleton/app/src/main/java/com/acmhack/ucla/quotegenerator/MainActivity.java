package com.acmhack.ucla.quotegenerator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton smallberg_button, nachenberg_button, miodrag_button;
    Button generate;
    TextView smallberg_text, nachenberg_text, miodrag_text, quote_text;
    //If active professor is 0 => Smallberg, 1 => Nachenberg, 2 => Miodrag
    int active_professor;
    //Add your own quotes here!
    //FUN FACT: miodrag's tumblr has some very "interesting" quotes http://pot-cognac.tumblr.com/
    String [] smallberg_quotes = {"\"Don’t forget the semicolon\""};
    String [] nachenberg_quotes = {"\"I need a volunteer. Yes, you—if it starts smoking, tell me!\""};
    String [] miodrag_quotes = {"\"Don’t get all excited when you find problems easy; your peers will find them easy too\""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Set up Image Buttons

        //Set up Buttons

        //Set up Text Views

        //Set up On Click Listeners

    }

    //free optional helper function, for resetting all professors to black text
    /*
    public void setAllProfessorToBlackText(){
        smallberg_text.setTextColor(Color.BLACK);
        nachenberg_text.setTextColor(Color.BLACK);
        miodrag_text.setTextColor(Color.BLACK);
    }
    */
}
