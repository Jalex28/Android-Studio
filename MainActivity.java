package com.example.finnkino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter<String> adapterte;
    ArrayAdapter<Integer> adapterpvm;
    ArrayAdapter<Integer> adapterkk;
    ArrayAdapter<String> adapterklo;
    ArrayAdapter<String> adaptermovies;

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner tespinner = (Spinner) findViewById(R.id.spinner);

        ArrayList<String> teatterit = new ArrayList<String>();
        teatterit.add("KINOPALATSI-HELSINKI");
        teatterit.add("KINOPALATSI-TURKU");
        teatterit.add("CINE ATLAS-TAMPERE");
        teatterit.add("SCALA-KUOPIO");
        teatterit.add("STRAND-LAPPEENRANTA");

        adapterte = new ArrayAdapter(this, android.R.layout.simple_spinner_item, teatterit);
        adapterte.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tespinner.setAdapter(adapterte);

        Spinner pvmspinner = (Spinner) findViewById(R.id.spinner2);

        ArrayList<Integer> pvm = new ArrayList<>();
        int i = 1;
        while (i <= 30) {
            pvm.add(i);
            i = i + 1;
        }
        adapterpvm = new ArrayAdapter(this, android.R.layout.simple_spinner_item, pvm);
        adapterpvm.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pvmspinner.setAdapter(adapterpvm);

        Spinner kkspinner = (Spinner) findViewById(R.id.spinner3);

        ArrayList<Integer> kk = new ArrayList<>();
        int x = 1;
        while (x <= 12) {
            kk.add(x);
            x = x + 1;
        }

        adapterkk = new ArrayAdapter(this, android.R.layout.simple_spinner_item, kk);
        adapterkk.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        kkspinner.setAdapter(adapterkk);

        Spinner klospinner = (Spinner) findViewById(R.id.spinner4);

        ArrayList<String> klo = new ArrayList<>();
        klo.add("10:00");
        klo.add("11:00");
        klo.add("12:00");
        klo.add("13:00");
        klo.add("14:00");
        klo.add("15:00");
        klo.add("16:00");
        klo.add("17:00");
        klo.add("18:00");
        klo.add("19:00");
        klo.add("20:00");
        klo.add("21:00");

        adapterklo = new ArrayAdapter(this, android.R.layout.simple_spinner_item, klo);
        adapterklo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        klospinner.setAdapter(adapterklo);
    }

    public void click(View v) {

        Spinner moviespinner = (Spinner) findViewById(R.id.spinner5);

        ArrayList<String> movies = new ArrayList<String>();
        movies.add("Tenet");
        movies.add("Hard kill");
        movies.add("Parasite");
        movies.add("Follow me");
        movies.add("Metsäjätti");

        adaptermovies = new ArrayAdapter(this, android.R.layout.simple_spinner_item, movies);
        adaptermovies.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        moviespinner.setAdapter(adaptermovies);
    }
}