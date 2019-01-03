package com.example.ahmed.tdihmetapplicationmobile;
/**
 * AHMED KHADRAOUI
 */

// La Classe Entree contient 1 champs : input.
public class Entree<e> {

    private final e input;

    // Constructeur
    public Entree(e entree) {
        this.input = entree;
    }

    // Getters
    public e getEntree() { return input; }
}