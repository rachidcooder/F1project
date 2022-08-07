package com.example.bac_note.Letter_Field;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bac_note.MainActivity;
import com.example.bac_note.R;

public class S_human_Natina extends MainActivity {
    private EditText edtarabsh,edtijtimsh,edtenglishsh,edtfalsafash;
    private TextView txttosetnotesh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_human__natina);
        setTitle(R.string.S_humman);
        edtarabsh=findViewById(R.id.edtarabnationalsh);
        edtijtimsh=findViewById(R.id.edtgiogrnationalsh);
        edtenglishsh=findViewById(R.id.edtenglinationalsh);
        edtfalsafash=findViewById(R.id.edtphilonationalsh);
        txttosetnotesh=findViewById(R.id.txttosetnotesh);
    }
    public void calculnationals_h(View view) {
        try {
            Double arabnotesh=Double.parseDouble(edtarabsh.getText().toString());
            Double ijtinotesh=Double.parseDouble(edtijtimsh.getText().toString());
            Double englishnotesh=Double.parseDouble(edtenglishsh.getText().toString());
            Double falsafnotesh =Double.parseDouble(edtfalsafash.getText().toString());
            //result
            Double tosetresult=(arabnotesh*3+ijtinotesh*4+falsafnotesh*4+englishnotesh*3)/14;
            //setresult
            txttosetnotesh.setText(tosetresult.toString());
        }catch (Exception e){
            Toast.makeText(getBaseContext(),"المرجو ملء جميع الخانات",Toast.LENGTH_LONG).show();
        }
    }
    }
