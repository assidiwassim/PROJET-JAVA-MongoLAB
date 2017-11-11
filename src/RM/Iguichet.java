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
public interface Iguichet {
    
public void vendreTickSkanes (String type, int num);
public void vendreTickAgba (String type, int num) ;
public double getRecetteSkanes( ) ;
public double getRecetteAgba( );
}
