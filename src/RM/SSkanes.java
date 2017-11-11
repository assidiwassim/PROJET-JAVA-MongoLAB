/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RM;


public  class SSkanes extends Salle{
  public   int chh; //nb chaise honneur
   public  boolean tabh[];
  public    float prixo ,prixb ,prixh;//prix chaise h=honneur o=ordiinaire b=balcon
  public  SSkanes(int ord,int bal,int hon ,boolean To[],boolean Tb[],boolean Th[],float po ,float pb ,float ph )
    {
        super(ord, bal,To,Tb);
        this.tabh= Th;
        this.chh=hon;
        this.prixo=po;
        this.prixb=pb;
        this.prixh=ph;
    }
    @Override
      public int getcapacitetotal()
    {
    return (super.getcapacitetotal()+this.chh);
    };
      
   

}
