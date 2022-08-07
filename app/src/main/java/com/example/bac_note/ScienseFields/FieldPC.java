package com.example.bac_note.ScienseFields;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bac_note.MainActivity;
import com.example.bac_note.R;

public class FieldPC extends MainActivity {
   private EditText edtmath,edtpc,edtsvt,edtanglais,edtphilosophie;
   private TextView txtsetnot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field_p_c);

        setTitle(R.string.phyzique);
        edtmath=findViewById(R.id.mathSubjectPC);
        edtpc=findViewById(R.id.pcSubjectPC);
        edtsvt=findViewById(R.id.svtSubjectPC);
        edtanglais=findViewById(R.id.anglaisSubjectPC);
        edtphilosophie=findViewById(R.id.philosSubjectPC);
        txtsetnot=findViewById(R.id.setnotePC);
    }
    public void calculnationalPC(View view) {
        try {
        Double mathnote=Double.parseDouble(edtmath.getText().toString());
        Double pcnote=Double.parseDouble(edtpc.getText().toString());
        Double svtnote=Double.parseDouble(edtsvt.getText().toString());
        Double anglaisnote=Double.parseDouble(edtanglais.getText().toString());
        Double philosophienote=Double.parseDouble(edtphilosophie.getText().toString());
        //result
       Double calculnote=(mathnote*7+pcnote*7+svtnote*5+anglaisnote*2+philosophienote*2)/23;
        //setresult
        txtsetnot.setText(calculnote.toString());
        }catch (Exception e){
            Toast.makeText(getBaseContext(),"المرجو ملء جميع الخانات",Toast.LENGTH_LONG).show();
        }
    }
}