package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    //new表示
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);

        TextView txt = (TextView)this.findViewById(R.id.subText);

        Intent intent = getIntent();
        String word = intent.getStringExtra("message");

        if(word.equals("")){
            txt.setText("No Message");
        } else{
            txt.setText(word);
        }
    }
}
