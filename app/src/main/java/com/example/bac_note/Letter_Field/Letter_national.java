package com.example.bac_note.Letter_Field;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bac_note.MainActivity;
import com.example.bac_note.R;

public class Letter_national extends MainActivity {
private EditText edtarab,edtijtim,edtenglish,edtfalsafa;
private TextView txttosetnote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_national);
        setTitle(R.string.Letter);
        edtarab=findViewById(R.id.edtarabnational);
        edtijtim=findViewById(R.id.edtgiogrnational);
        edtenglish=findViewById(R.id.edtenglinational);
        edtfalsafa=findViewById(R.id.edtphilonational);
        txttosetnote=findViewById(R.id.txttosetnote);
    }
    public void calculnationalLet(View view) {
        try {
       Double arabnote=Double.parseDouble(edtarab.getText().toString());
        Double ijtinote=Double.parseDouble(edtijtim.getText().toString());
        Double englishnote =Double.parseDouble(edtenglish.getText().toString());
        Double falsafnote =Double.parseDouble(edtfalsafa.getText().toString());
        //result
        Double tosetresult=(arabnote*4+ijtinote*4+falsafnote*3+englishnote*4)/15;
        //setresult
        txttosetnote.setText(tosetresult.toString());
        }catch (Exception e){
            Toast.makeText(getBaseContext(),"المرجو ملء جميع الخانات",Toast.LENGTH_LONG).show();
        }
    }
}