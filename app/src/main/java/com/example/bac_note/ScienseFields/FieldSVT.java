package com.example.bac_note.ScienseFields;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bac_note.R;

public class FieldSVT extends AppCompatActivity {
    private EditText edtmath,edtpc,edtsvt,edtanglais,edtphilosophie;
    private TextView txtsetnot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field_s_v_t);

        setTitle(R.string.svt);
        edtmath=findViewById(R.id.mathSubjectSVT);
        edtpc=findViewById(R.id.pcSubjectSVT);
        edtsvt=findViewById(R.id.svtSubjectSVT);
        edtanglais=findViewById(R.id.anglaisSubjectSVT);
        edtphilosophie=findViewById(R.id.philosSubjectSVT);
        txtsetnot=findViewById(R.id.setnoteSVT);
    }

    public void calculnationalSVT(View view) {
        try {
        Double mathnote=Double.parseDouble(edtmath.getText().toString());
        Double pcnote=Double.parseDouble(edtpc.getText().toString());
        Double svtnote=Double.parseDouble(edtsvt.getText().toString());
        Double anglaisnote=Double.parseDouble(edtanglais.getText().toString());
        Double philosophienote=Double.parseDouble(edtphilosophie.getText().toString());
        //result
        Double calculnote=(mathnote*7+pcnote*5+svtnote*7+anglaisnote*2+philosophienote*2)/23;
        //setresult
        txtsetnot.setText(calculnote.toString());
        }catch (Exception e){
            Toast.makeText(getBaseContext(),"المرجو ملء جميع الخانات",Toast.LENGTH_LONG).show();
        }
    }
}