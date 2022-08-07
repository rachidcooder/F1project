package com.example.bac_note.notetype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bac_note.MainActivity;
import com.example.bac_note.R;

public class Note_BAC extends MainActivity {
 EditText edts1note,edts2note,edtregionote;
  TextView txtnonacces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note__b_a_c);
        setTitle(R.string.bac_note);
        edts1note=findViewById(R.id.edts1_note);
        edts2note=findViewById(R.id.edts2_note);
        edtregionote=findViewById(R.id.edtregional_note);
        txtnonacces=findViewById(R.id.notfor_access);

    }
    public void calcul_note(View view) {
        try {
            Double notes1 = Double.parseDouble(edts1note.getText().toString());
            Double notes2 = Double.parseDouble(edts2note.getText().toString());
            Double noteregional = Double.parseDouble(edtregionote.getText().toString());
            //result
            Double classnote = ((notes1 + notes2) / 2);
            Double nationalnote = ((10 - (noteregional * 0.25) - (classnote * 0.25)) / 0.5);
            //setresult
            txtnonacces.setText(nationalnote.toString());
        }catch (Exception e){
            Toast.makeText(getBaseContext(),"المرجو ملء جميع الخانات",Toast.LENGTH_LONG).show();
        }

    }
}