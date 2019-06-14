package com.biswasvideoblog.sushenbiswas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this for Button
        configureAboutMeBtn();
        configureBlogBtn();
        configureContactBtn();

    }


    // This is for Go to Hello World
    private void configureAboutMeBtn(){
        Button nextButton = (Button) findViewById(R.id.AboutMe);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"About me",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Hello World Activety
                Intent intent = new Intent(MainActivity.this,AboutMe.class);
                startActivity(intent);
            }
        });
    }

    // This is for Go to Print Line
    private void configureBlogBtn(){
        Button nextButton = (Button) findViewById(R.id.Blog);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"I am BlogBtn",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(MainActivity.this,Blog.class);
                startActivity(intent);
            }
        });
    }

    // This is for Go to Variable
    private void configureContactBtn(){
        Button nextButton = (Button) findViewById(R.id.Contact);
        nextButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"I am ContactBtn",Toast.LENGTH_SHORT)
                        .show();

                // Lonch The Print Line Activety
                Intent intent = new Intent(MainActivity.this,Contact.class);
                startActivity(intent);
            }
        });
    }
}
