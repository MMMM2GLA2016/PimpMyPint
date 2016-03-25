package fr.istic.m2gla.mmm.pimpmypint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }

    public void gotoMyBeers(View view){
        Intent intent = new Intent(this,MyBeersActivity.class);
        startActivity(intent);
    }

    public void gotoMyContacts(View view){
        Intent intent = new Intent(this,MyBeersActivity.class);
        startActivity(intent);
    }
}
