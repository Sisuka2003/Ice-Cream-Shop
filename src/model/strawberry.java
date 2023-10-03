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
public class strawberry extends IceCreams{

     String name;
    
    public strawberry() {
        name="Strawberry";
    }

    
    @Override
    public double price() {
        return 250.00;
    }
    
}
