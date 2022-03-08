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
public class Planning
{
   private ArrayList<Jour> listeJours;
   
   public Planning()
   {
       listeJours = new ArrayList<>();
   }
   
   public ArrayList<Jour> getJours()
   {
       return listeJours;
   }
}
