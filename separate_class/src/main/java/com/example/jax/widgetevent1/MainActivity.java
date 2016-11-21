package com.example.jax.widgetevent1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = (Button) findViewById(R.id.bt1);
        Button bt2 = (Button) findViewById(R.id.bt2);
        bt1.setOnClickListener(new showText("Hello", this));
        bt2.setOnClickListener(new showText("GoodBye", this));
    }

    public void setText(String text) {
        Toast tempMessage =
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT);
        tempMessage.show();
    }

    public class showText implements View.OnClickListener {
        private String text;
        private MainActivity mainActivity;

        public showText(String text, MainActivity mainActivity) {

            this.text = text;
            this.mainActivity = mainActivity;
        }

        @Override
        public void onClick(View view) {

            setText(text);
        }
    }
}
