package com.example.ahmed.tdihmetapplicationmobile;
/**
 * AHMED KHADRAOUI
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InputListActivity extends AppCompatActivity implements View.OnClickListener {


    private Button Boutonliste;
    private Button BoutonAjouterListe;
    // On Déclare une variable ChampEntree qui va nous servir pour recuperer l'entrée de l'utilisateur
    private EditText ChampEntree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_list);

        // Récupèration des vues de chaques boutons
        Boutonliste = findViewById(R.id.input_list_form_activity_button);
        Boutonliste.setOnClickListener(this);

        BoutonAjouterListe = findViewById(R.id.input_form_activity_add_button);
        BoutonAjouterListe.setOnClickListener(this);

        // Récupèration des vues du champs d'entrée de notre formulaire
        ChampEntree = findViewById(R.id.input_form_activity_input_field);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.input_list_form_activity_button:
                // Lancement de l'activité permettant l'affichage de la liste contenant les entrées de l'utilisateur
                Intent inputListActivity = new Intent(this, MainActivity.class);
                startActivity(inputListActivity);
                break;
            case R.id.input_form_activity_add_button:
                // Lance de l'activité permettant l'affichage de la liste contenant les entrées de l'utilisateur mais cette fois ci en ajoutant l'entrée en cours
                if (sauvegarderInput()) {
                    Intent inputAddListActivity = new Intent(this, MainActivity.class);
                    startActivity(inputAddListActivity);
                }
                break;
        }
    }
    // Définition d'une méthode sauvegarderInput() permettant de stocker une entrée dans le DataManager
    private boolean sauvegarderInput() {
        Entree<String> nouvelleEntree = new Entree(ChampEntree.getText().toString());
        // On vérifie si l'utilisateur a renseigné quelque chose dans le champ ou pas
        if (!nouvelleEntree.getEntree().isEmpty()) {
            DataManager.getInstance().addString(nouvelleEntree);
            return true;
        } else {
            // Si le champ d'entrée n'est pas renseigné, on demande à l'utilisateur de saisir quelque chose dans le champ
            Toast.makeText(this, "Il faut écrire quelques chose dans ce champ", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

}
