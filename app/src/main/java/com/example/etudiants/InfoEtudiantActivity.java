package com.example.etudiants;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class InfoEtudiantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Informations de l'étudiant");
        setContentView(R.layout.activity_info_etudiant);
    }
}