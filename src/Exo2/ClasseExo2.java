/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo2;

/**
 *
 * @author jbuffeteau
 */
public class ClasseExo2
{
    public static double CalculerForfait(boolean licencie, int age,boolean carteNeige, boolean assurance)
    {
        int prixForfait = 0;
        if(licencie)
        {
            prixForfait += 13;
        }
        else
        {
            if(age < 12)
            {
                prixForfait += 20;
            }
            else
            {
                prixForfait += 30;
            }
        }
        if(carteNeige)
        {
            prixForfait *= 0.9;
        }
        if(assurance)
        {
            prixForfait += 3;
        }
        return prixForfait;
    }
}
