package com.example.ahmed.tdihmetapplicationmobile;

/**
 * AHMED KHADRAOUI
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public class InputListAdapter extends RecyclerView.Adapter<InputListViewHolder> {


    //Classe qui permet la récupération des informations renseignées par l'utilisateur afin de les afficher par la suite suivant une cartaine forme d'affichage..


    // Récupération de l'entrée via le DataManager
    private final List<Entree<String>> inputs = DataManager.getInstance().getStringList();

    @Override
    // Récupération de la taille de la liste
    public int getItemCount() {
        return inputs.size();
    }

    @Override
    // Création du ViewHolder pour l'affichage de la liste
    public InputListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        // le layout input_layout.xml sert à mettre en forme l'affichage des éléments de la liste
        View view = inflater.inflate(R.layout.input_layout, parent, false);
        return new InputListViewHolder(view);
    }
    @Override
    // Mise en forme du ViewHolder pour l'affichage des éléments de la liste lorsqu'on on clique sur un element dans cette derniere
    public void onBindViewHolder(InputListViewHolder holder, int position) {
        Entree<String> entree = inputs.get(position);
        holder.display(entree);
    }
}
