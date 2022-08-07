package com.example.bac_note.notetype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bac_note.R;

public class Region_Not_lettre extends AppCompatActivity {
    private EditText edtmathlet,edtfranshlet,edtislamiyatlet;
    private TextView txtsetnotlet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region__not_lettre);
        setTitle(R.string.regionallettre_note);
        edtmathlet=findViewById(R.id.edtMathlet);
        edtfranshlet=findViewById(R.id.edtfranchLet);
        edtislamiyatlet=findViewById(R.id.edtislamiyatlet);
        txtsetnotlet=findViewById(R.id.setregionote_let);
    }

    public void tosetreg_notelet(View view) {
        //get_note
        try {
        Double mathnote=Double.parseDouble(edtmathlet.getText().toString());
        Double franshnote=Double.parseDouble(edtfranshlet.getText().toString());
        Double islami_note=Double.parseDouble(edtislamiyatlet.getText().toString());
        //result



            Double regionalNote = (mathnote * 1 + franshnote * 4 + islami_note * 2) / 7;
            //setresult
            txtsetnotlet.setText(regionalNote.toString());
        }catch (Exception e) {
            Toast.makeText(getBaseContext(),"المرجو ملء جميع الخانات",Toast.LENGTH_LONG).show();
        }
    }
}