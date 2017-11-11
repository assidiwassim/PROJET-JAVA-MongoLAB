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
public abstract class guichet implements Iguichet{
    float RS=0;
    float RA=0;
    @Override
    public void vendreTickSkanes (String type, int num)
    {
        if(type.equals("honneur"))
        {
       // RS+=SSkanes.;
        }
        if(type.equals("balcon"))
        {
        
        }
        if(type.equals("ordinaire"))
        {
    
        }

};
    @Override 
    public void vendreTickAgba (String type, int num) 
    {
        if(type.equals("honneur"))
        {
        
        }
    if(type.equals("balcon"))
        {
        
        }
    };

    @Override 
    public double getRecetteSkanes() 
            {
                return this.RS;
            };
    
    @Override
    public double getRecetteAgba()
            {
            return this.RA;
            };

}