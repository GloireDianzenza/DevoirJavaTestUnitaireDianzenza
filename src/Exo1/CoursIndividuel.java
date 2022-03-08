package Exo1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jacqu
 */
public class CoursIndividuel extends Cours
{
    private Instrument instru;
    
    public CoursIndividuel(int id,String nom,int prix,Instrument ins)
    {
        super(id,nom,prix);
        instru = ins;
    }
    
    public Instrument getInstrument()
    {
        return instru;
    }
    
    public int getPrixCours()
    {
        int prixFinal = super.getPrixCours();
        if(getInstrument().getNom().compareTo("Guitare") == 0)
        {
            prixFinal += 5;
        }
        else
        {
            prixFinal += 7;
        }
        return prixFinal;
    }
}
