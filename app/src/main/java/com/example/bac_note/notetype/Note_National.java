package com.example.bac_note.notetype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bac_note.MainActivity;
import com.example.bac_note.R;

public class Note_National extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note__national);
        setTitle(R.string.nationalscience_note);
    }

    public void choseField(View view) {
        switch (view.getId()){
            case R.id.mathID:
                Intent intmath=new Intent(this,com.example.bac_note.ScienseFields.Field_Math.class);
                startActivity(intmath);
                break;
            case R.id.pcID:
                Intent intPC =new Intent(this,com.example.bac_note.ScienseFields.FieldPC.class);
                startActivity(intPC);
                break;
            case R.id.svtID:
                Intent intSVT=new Intent (this,com.example.bac_note.ScienseFields.FieldSVT.class);
                startActivity(intSVT);
                break;
        }
    }
}