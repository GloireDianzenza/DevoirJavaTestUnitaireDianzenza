package Exo1;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jacqu
 */
public class Jour
{
    private int idJour;
    private String nomJour;
    private ArrayList<Cours> listeCours;
    
    public Jour(int id,String nom)
    {
        idJour = id;
        nomJour = nom;
        listeCours = new ArrayList<>();
    }

    /**
     * @return the idJour
     */
    public int getIdJour() {
        return idJour;
    }

    /**
     * @return the nomJour
     */
    public String getNomJour() {
        return nomJour;
    }

    /**
     * @return the listeCours
     */
    public ArrayList<Cours> getListeCours() {
        return listeCours;
    }
}
