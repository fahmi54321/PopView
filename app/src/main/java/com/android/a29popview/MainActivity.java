package com.android.a29popview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import rb.popview.PopField;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final PopField popField = PopField.attach2Window(this);

        final TextView textView = (TextView) findViewById(R.id.newTextView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View addView = inflater.inflate(R.layout.new_text_view,null);
                TextView helloWorld = (TextView)addView.findViewById(R.id.newHelloWorld);
                popField.popView(textView,addView,true);
            }
        });

    }
}