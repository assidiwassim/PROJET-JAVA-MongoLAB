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
public class Sagba extends Salle{
   
   public float prixo ,prixb ;//prix chaise h=honneur o=ordiinaire b=balcon
public    Sagba(int ord,int bal,boolean To[],boolean Tb[],float po ,float pb  )
    {
        super(ord, bal,To,Tb);
        
        this.prixo=po;
        this.prixb=pb;
    }
     
            
}