package com.example.ahmed.tdihmetapplicationmobile;
/**
 * AHMED KHADRAOUI
 */

import android.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class InputListViewHolder extends RecyclerView.ViewHolder {


    private TextView ChampEntree;


    private Entree<String> entreeActuel;

    public InputListViewHolder(final View itemView) {
        super(itemView);

        // On récupère les vues associées au champ d'entrée
        ChampEntree = itemView.findViewById(R.id.Champ_Entree);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            // On définit une méthode permettant d'afficher les détails de l'évènement lorsqu'on clique dessus
            public void onClick(View view) {
                new AlertDialog.Builder(itemView.getContext())
                        .setTitle(entreeActuel.getEntree())
                        .show();
            }
        });
    }

    // Méthode permettant de traiter les entrées successivement et ainsi les afficher
    public void display(Entree<String> entree) {
        entreeActuel = entree;
        this.ChampEntree.setText(entree.getEntree());
    }

}

