package com.example.texttospeechtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    EditText u,p;
    Button b1,b2;
    TextToSpeech t;
    String s1,s2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        u=findViewById(R.id.detail1);
        p=findViewById(R.id.detail2);
        b1=findViewById(R.id.login);
        t=new TextToSpeech(MainActivity.this,this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                s1=u.getText().toString();
                s2=p.getText().toString();
                if(s1.contentEquals("shreya") && s2.contentEquals("abc1234"))
                {
                    t.speak("Login is Successful",TextToSpeech.QUEUE_ADD,null);
                }else
                {
                    t.speak("Wrong Credentials",TextToSpeech.QUEUE_ADD,null);
                }
            }});
    }


    @Override
    public void onInit(int i) {
        t.setLanguage(Locale.ENGLISH);

    }
}