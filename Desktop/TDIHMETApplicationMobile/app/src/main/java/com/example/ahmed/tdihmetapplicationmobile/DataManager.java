package com.example.ahmed.tdihmetapplicationmobile;
/**
 * AHMED KHADRAOUI
 */
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static DataManager INSTANCE;
    // Déclaration d'une liste qui contiendra des chaines de caractere rentrées par l'utilisateur
    private List<Entree<String>> entree;

    public DataManager() {
        entree = new ArrayList<>();
    }
    // Méthode qui sert à rendre le DataManager accessible
    public static DataManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }

    // Méthode permettant de récupérer la liste des chaines de caracteres à partir du Data Manager
    public List<Entree<String>> getStringList() {
        return entree;
    }

    // Méthode permettant d'ajouter une chaine de caractere dans la liste
    public void addString(Entree<String> entree){
        this.entree.add(entree);
    }
}

