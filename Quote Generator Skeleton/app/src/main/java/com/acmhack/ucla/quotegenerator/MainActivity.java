package com.acmhack.ucla.quotegenerator;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton smallberg_button, nachenberg_button, miodrag_button;
    Button generate_button;
    TextView smallberg_text, nachenberg_text, miodrag_text, quote_text;
    //If active professor is 0 => Smallberg, 1 => Nachenberg, 2 => Miodrag
    int active_professor;
    int active_quote;
    int active_img = -1;
    //Add your own quotes here!
    //FUN FACT: miodrag's tumblr has some very "interesting" quotes http://pot-cognac.tumblr.com/
    String[] smallberg_quotes = {
            "\"Don’t forget the semicolon\""
    };
    String[] nachenberg_quotes = {
            "\"I need a volunteer. Yes, you—if it starts smoking, tell me!\"",
            "\"Can I call you Bob?\""
    };
    String[] miodrag_quotes = {
            "\"Don’t get all excited when you find problems easy; your peers will find them easy too\"",
            "\"I don’t like screaming it is too loud\""
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Set up Image Buttons
        smallberg_button = (ImageButton) findViewById(R.id.smallberg_button);
        nachenberg_button = (ImageButton) findViewById(R.id.nachenberg_button);
        miodrag_button = (ImageButton) findViewById(R.id.miodrag_button);

        //Set up Buttons
        generate_button = (Button) findViewById(R.id.generate_button);

        //Set up Text Views
        smallberg_text = (TextView) findViewById(R.id.smallberg_text);
        nachenberg_text = (TextView) findViewById(R.id.nachenberg_text);
        miodrag_text = (TextView) findViewById(R.id.miodrag_text);
        quote_text = (TextView) findViewById(R.id.quote_text);

        //set up three imgButtons' OnClick events
        smallberg_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAllProfessorToBlackText();
                if(active_img != 0){
                    smallberg_text.setTextColor(Color.parseColor("#FDC511"));
                    active_img = 0;
                }
                else
                    active_img = -1;
            }
        });

        nachenberg_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAllProfessorToBlackText();
                if(active_img != 1 ){
                    nachenberg_text.setTextColor(Color.parseColor("#FDC511"));
                    active_img = 1;
                }
                else
                    active_img = -1;
            }
        });

        miodrag_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAllProfessorToBlackText();
                if(active_img != 2){
                    miodrag_text.setTextColor(Color.parseColor("#FDC511"));
                    active_img = 2;
                }
                else
                    active_img = -1;
            }
        });


        //Set up On Click Listeners
        generate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set all the professor text colors to black
                // Choose a random professor
                Random rand = new Random();
                active_professor = active_img; //decide which professor's icon is clicked
                switch (active_professor) {
                    // Case 0: Professor will be Smallberg, generate a random quote from him
                    case 0:
                        active_quote = rand.nextInt(smallberg_quotes.length);
                        quote_text.setText(smallberg_quotes[active_quote]);
                        break;
                    // Case 1: Professor will be Nachenberg, generate a random quote from him
                    case 1:
                        active_quote = rand.nextInt(nachenberg_quotes.length);
                        quote_text.setText(nachenberg_quotes[active_quote]);
                        break;
                    // Case 2: Professor will be Niodrag, generate a random quote from him
                    case 2:
                        active_quote = rand.nextInt(miodrag_quotes.length);
                        quote_text.setText(miodrag_quotes[active_quote]);
                        break;
                    case -1:
                        quote_text.setText("Select a professor and then press generate to get a quote.");
                    default:
                        break;
                }
            }
        });

    }

    //free optional helper function, for resetting all professors to black text
    public void setAllProfessorToBlackText() {
        smallberg_text.setTextColor(Color.BLACK);
        nachenberg_text.setTextColor(Color.BLACK);
        miodrag_text.setTextColor(Color.BLACK);
    }

}
