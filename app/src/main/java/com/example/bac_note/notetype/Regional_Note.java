package com.example.bac_note.notetype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bac_note.MainActivity;
import com.example.bac_note.R;

public class Regional_Note extends MainActivity {
 private EditText edtarabic,edtfransh,edtislamiyat,edtijtimaaiyat;
 private TextView txtsetnot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regional__note);
        setTitle(R.string.regionalscience_note);
        edtarabic=findViewById(R.id.edtarabic);
        edtfransh=findViewById(R.id.edtfranch);
        edtislamiyat=findViewById(R.id.edtislamiyat);
        edtijtimaaiyat=findViewById(R.id.edtijtimaayat);
        txtsetnot=findViewById(R.id.setregionote);
    }


    public void tosetreg_noteS(View view) {
        try {
        //get_note
        Double arabicnote=Double.parseDouble(edtarabic.getText().toString());
        Double franshnote=Double.parseDouble(edtfransh.getText().toString());
        Double islami_note=Double.parseDouble(edtislamiyat.getText().toString());
        Double ijtima_note=Double.parseDouble(edtijtimaaiyat.getText().toString());
        //result
        Double regionalNote=(arabicnote*2+franshnote*4+islami_note*2+ijtima_note*2)/10;
        //setresult
        txtsetnot.setText(regionalNote.toString());
        }catch (Exception e){
            Toast.makeText(getBaseContext(),"المرجو ملء جميع الخانات",Toast.LENGTH_LONG).show();
        }
    }
}