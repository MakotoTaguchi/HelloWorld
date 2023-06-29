package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        txt = (TextView)this.findViewById(R.id.textView);
//        txt.setText("実験中です");
        Log.v("test", "実験です");
    }

    //次へボタン
    public void subButton(View view){
        Intent intent = new Intent(this,SubActivity.class);
        intent.putExtra("message", txt.getText().toString());
        startActivity(intent);
    }

    //日本語ボタン
    public void japButton(View view){
        txt.setText(R.string.jap_message);
    }

    //Englishボタン
    public void engButton(View view){
        txt.setText(R.string.eng_message);
    }

    public void endButton(View view){
        setContentView(R.layout.end);
    }

    //終了ボタンの処理
    public void exitButton(View view){
        super.finish();
    }
}