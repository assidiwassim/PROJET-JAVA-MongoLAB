/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RM;

/**
 *
 * @author DToshiba
 */
public abstract class Salle {
    
   public int cho; //nbr chaises ordinair
   public int chb;//nbr chaises balcon
    public boolean To[],Tb[];//table de boolean
    public int getcapacitetotal()
    {
        return(cho+chb);
    };
    Salle(int ord,int bal,boolean tabo[],boolean tabb[])
    {
    this.cho=ord;
    this.chb=bal;
    this.To=tabo;
    this.Tb=tabb;
    }
}
