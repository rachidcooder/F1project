package com.example.bac_note.notetype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bac_note.MainActivity;
import com.example.bac_note.R;

public class Note_school extends MainActivity {
EditText edtnationnal,edtregional;
TextView txtnote_school;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_school);
        setTitle(R.string.hightschool_note);
        edtnationnal=findViewById(R.id.note_national);
        edtregional=findViewById(R.id.note_regionnal);
        txtnote_school=findViewById(R.id.note_school);
    }
    public void calcul_notescholl(View view) {
        try {


        Double note_national=Double.parseDouble(edtnationnal.getText().toString());
        Double note_regional=Double.parseDouble(edtregional.getText().toString());
        //result
        Double notschool= note_national*0.75+note_regional*0.25;
       //setresult
       txtnote_school.setText(notschool.toString());
        }catch (Exception e){
            Toast.makeText(getBaseContext(),"المرجو ملء جميع الخانات",Toast.LENGTH_LONG).show();
        }
    }
}