package com.example.bac_note.Letter_Field;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bac_note.MainActivity;
import com.example.bac_note.R;

public class National_Letter extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national__letter);
        setTitle(R.string.nationalettre_note);
    }

    public void nationaletterField(View view) {
        switch(view.getId()) {
            case R.id.Letter:
                Intent intletter=new Intent(this,com.example.bac_note.Letter_Field.Letter_national.class) ;
            startActivity(intletter);
                break;
            case R.id.S_humman:
                Intent ints_human=new Intent(this,com.example.bac_note.Letter_Field.S_human_Natina.class);
                startActivity(ints_human);
                break;
        }
    }
}