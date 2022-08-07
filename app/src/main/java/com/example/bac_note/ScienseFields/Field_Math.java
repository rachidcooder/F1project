package com.example.bac_note.ScienseFields;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bac_note.MainActivity;
import com.example.bac_note.R;

public class Field_Math extends MainActivity {
  private EditText edtmath,edtpc,edtsvt,edtanglais,edtphilosophie;
  private TextView txtsetnot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field__math);
        setTitle(R.string.math);
        edtmath=findViewById(R.id.mathSubjectM);
        edtpc=findViewById(R.id.pcSubjectM);
        edtsvt=findViewById(R.id.svtSubjectM);
        edtanglais=findViewById(R.id.anglaisSubjectM);
        edtphilosophie=findViewById(R.id.philosSubjectM);
        txtsetnot=findViewById(R.id.setnote);
    }
    public void calculnationalM(View view) {
        try {
        Double mathnote=Double.parseDouble(edtmath.getText().toString());
        Double pcnote=Double.parseDouble(edtpc.getText().toString());
        Double svtnote=Double.parseDouble(edtsvt.getText().toString());
        Double anglaisnote=Double.parseDouble(edtanglais.getText().toString());
        Double philosophienote=Double.parseDouble(edtphilosophie.getText().toString());
        //result
        Double calculnote=(mathnote*9+pcnote*7+svtnote*3+anglaisnote*2+philosophienote*2)/23;
        //setresult
        txtsetnot.setText(calculnote.toString());
        }catch (Exception e){
            Toast.makeText(getBaseContext(),"المرجو ملء جميع الخانات",Toast.LENGTH_LONG).show();
        }
    }
}