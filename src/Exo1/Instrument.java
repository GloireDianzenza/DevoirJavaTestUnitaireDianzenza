package Exo1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jacqu
 */
public class Instrument
{
    private int idInstrument;
    private String nomInstrument;
    
    public Instrument(int id, String nom)
    {
        idInstrument = id;
        nomInstrument = nom;
    }
    
    public int getId()
    {
        return idInstrument;
    }
    
    public String getNom()
    {
        return nomInstrument;
    }
}
