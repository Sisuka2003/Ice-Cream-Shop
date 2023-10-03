/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sisuk
 */
public class blueberry extends IceCreams{

     String name;
    
    
    public blueberry() {
        name="Blue Berry";
    }

    @Override
    public double price() {
        return 350.00;
    }
    
}
