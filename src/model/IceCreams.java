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
public abstract class IceCreams {
    
    String name;

    public String getIceCreamName() {
        return name;
    }

    public abstract double price();
}
