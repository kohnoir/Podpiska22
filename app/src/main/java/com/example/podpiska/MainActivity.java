package com.example.podpiska;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1 ;
    Button btn2 ;
    EditText name;
    EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initOk();
        initClear();
    }
    private void init(){
        btn1 = findViewById(R.id.btn1);
        name = findViewById(R.id.editEmail);
        email = findViewById(R.id.underTxt);
    }
    private void initOk () {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = getString(R.string.txt_second)  + " " + name.getText().toString()+" "+getString(R.string.txt_first) + " " + email.getText().toString();
                TextView textView = findViewById(R.id.txt);
                textView.setText(str);


            }
        });
    }
    private void initClear(){
        btn2 =  findViewById(R.id.btn2);
        btn2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView underTxt = findViewById(R.id.underTxt);
                underTxt.setText("");
                TextView editEmail = findViewById(R.id.editEmail);
                editEmail.setText("");
            }
        });
    }
}
