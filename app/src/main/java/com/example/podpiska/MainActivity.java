package com.example.podpiska;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        Clear();
    }
    private void Init () {
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = findViewById(R.id.editEmail);
                EditText email = findViewById(R.id.underTxt);
                String str = getString(R.string.txt_second)  + " " + name.getText().toString()+" "+getString(R.string.txt_first) + " " + email.getText().toString();
                TextView textView = findViewById(R.id.txt);
                textView.setText(str);


            }
        });
    }
    private void Clear(){
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView underTxt = (TextView)findViewById(R.id.underTxt);
                underTxt.setText("");
                TextView editEmail = (TextView)findViewById(R.id.editEmail);
                editEmail.setText("");
            }
        });
    }
}
