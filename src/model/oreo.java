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
public class oreo extends Toppings {

    IceCreams icecream;

    public oreo(IceCreams icecream) {
        this.icecream = icecream;
    }

    @Override
    public String getToppingName() {
        return "OREO";
    }

    @Override
    public double price() {
        return 300.00;
    }

}
