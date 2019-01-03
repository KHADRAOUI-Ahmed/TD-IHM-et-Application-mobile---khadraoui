package com.example.ahmed.tdihmetapplicationmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * La classe MainActivity est l'activité lancé lorsqu'on execute l'application.
     * Au lancement, la liste du 1er écran est vide.
     * - On clique sur le bouton Add du premier écran modelisé ici par GoToInputButton qui nous redirige vers le deuxieme écran.
     * - On peut saisir du texte dans le champs de texte.
     * - Au clic sur le bouton Add in list du 2eme écran modelisé dans la classe InputListeActivity par BoutonAjouterListe
     * - Le texte saisie dans le champ de l'écran 2 est inscrit dans un item de liste de l'écran 1
     * - Sinon depuis le 2eme ecran on peut visualiser la liste de l'ecran 1 via le bouton Go To The List modelisé dans la classe InputListeActivity par Boutonliste
     */
    private Button GoToInputButton;
    // On initialise le RecyclerView qui permettra d'afficher la liste
    private RecyclerView TheRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GoToInputButton = findViewById(R.id.Input_list_activity_go_to_input_button);
        GoToInputButton.setOnClickListener(this);

        // Récupération de la vue associée au RecyclerView et définition du Layout approprié et de son Adapter

        TheRecyclerView = findViewById(R.id.Input_list_activity_recycler_view);
        TheRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        TheRecyclerView.setAdapter(new InputListAdapter());

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Input_list_activity_go_to_input_button:
                // Lancement de l'activité permettant l'affichage de la liste
                Intent InputaddListActivity = new Intent(this, InputListActivity.class);
                startActivity(InputaddListActivity);
                break;


        }
    }

}
