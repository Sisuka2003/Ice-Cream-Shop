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
public class fruitNnut extends IceCreams{

     String name;
    
    
    public fruitNnut() {
        name="Fruit & Nut";
    }

    
    @Override
    public double price() {
        return 450.00;
    }
    
}
