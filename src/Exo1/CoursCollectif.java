package Exo1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jacqu
 */
public class CoursCollectif extends Cours
{
    private int nbPlaces;
    
    public CoursCollectif(int id,String nom,int prix,int places)
    {
        super(id, nom, prix);
        nbPlaces = places;
    }
    
    public int getNbPlaces()
    {
        return nbPlaces;
    }
    
    public int getPrixCours()
    {
        int prixFinal = super.getPrixCours();
        if(getNbPlaces() >= 10)
        {
            prixFinal += 3;
        }
        else if(getNbPlaces() >= 5)
        {
            prixFinal += 6;
        }
        else
        {
            prixFinal += 9;
        }
        return prixFinal;
    }
    
    public void setNbPlaces(int nombre)
    {
        nbPlaces = nombre;
    }
}
