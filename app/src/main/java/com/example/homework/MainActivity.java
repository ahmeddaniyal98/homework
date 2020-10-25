package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg1,rg2;
    RadioButton rb1,rb2;
    TextView text;
    CheckBox cb1, cb2, cb3, cb4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg1=findViewById(R.id.radioGroup1);
        rg2=findViewById(R.id.radioGroup2);
        text=findViewById(R.id.textView);

    }


    public void ShowButtons(View view) {

        String res="selected";
        int id1=rg1.getCheckedRadioButtonId();
        int id2=rg2.getCheckedRadioButtonId();
        RadioButton rb=findViewById(id1);
        res += rb.getText();

        RadioButton rb1=findViewById(id2);
        res += rb1.getText();

        rb1=findViewById(id1);
        rb2=findViewById(id2);

        text.setText(res);



    }

    public void showcountires(View view) {
        String res="selected ";

        if (cb1.isChecked())
            res += cb1.getText();

        if (cb2.isChecked())
            res += cb2.getText();

        if (cb3.isChecked())
            res += cb3.getText();


        if (cb4.isChecked())
            res += cb4.getText();

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("country name",res);
        startActivity(intent);


    }
}