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
public class Cours 
{
   private int idCours;
   private String nomCours;
   private int prixCours;
   
   public Cours(int id,String nom,int prix)
   {
       idCours = id;
       nomCours = nom;
       prixCours = prix;
   }

    /**
     * @return the idCours
     */
    public int getIdCours() {
        return idCours;
    }

    /**
     * @return the nomCours
     */
    public String getNomCours() {
        return nomCours;
    }

    /**
     * @return the prixCours
     */
    public int getPrixCours() {
        return 10;
    }
   
   
}
