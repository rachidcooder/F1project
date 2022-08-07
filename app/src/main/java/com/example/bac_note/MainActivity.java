package com.example.bac_note;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout=findViewById(R.id.linearlayoutonst);

    }
    //Menu code here
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuofapp, menu);
        return true;
}
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
           case R.id.share:
                Intent itnshare=new Intent(Intent.ACTION_SEND);
                itnshare.setType("text/plain");
                itnshare.putExtra(Intent.EXTRA_SUBJECT,"check the link");
                itnshare.putExtra(Intent.EXTRA_TEXT,"https://apps.samsung.com/appquery/appDetail.as?appId=com.example.bac_note");
                startActivity(Intent.createChooser(itnshare, "Share in"));
                break;
            case R.id.aboutappID:
                Intent intabout=new Intent (this,com.example.bac_note.ForMenu.forAboutApp.class);
                startActivity(intabout);
        }
        return super.onOptionsItemSelected(item);
    }

    public void NextActivity(View view) {

        switch(view.getId()){
            case R.id.bac_note:
                Intent intbacnot=new Intent(this,com.example.bac_note.notetype.Note_BAC.class);
                startActivity(intbacnot);
                break;
            case R.id.shool_note:
                Intent intshoolnot=new Intent(this,com.example.bac_note.notetype.Note_school.class);
                startActivity(intshoolnot);
                break;
            case R.id.natisci_note:
                Intent intnatiscinote=new Intent(this,com.example.bac_note.notetype.Note_National.class);
                startActivity(intnatiscinote);
                break;
            case R.id.regiscien_note:
                Intent intregiSnote=new Intent(this,com.example.bac_note.notetype.Regional_Note.class);
                startActivity(intregiSnote);
                break;
            case R.id.natiolett_note:
                Intent intnatiletter=new Intent(this,com.example.bac_note.Letter_Field.National_Letter.class);
                startActivity(intnatiletter);
                break;
            case R.id.regilett_note:
                Intent intreginote_let=new Intent(this,com.example.bac_note.notetype.Region_Not_lettre.class);
                startActivity(intreginote_let);
                break;
        }


    }
}

