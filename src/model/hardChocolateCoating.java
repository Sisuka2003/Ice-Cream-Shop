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
public class hardChocolateCoating extends Toppings{
    IceCreams icecream;

    public hardChocolateCoating(IceCreams icecream) {
        this.icecream = icecream;
    }
    @Override
    public String getToppingName() {
        return "HARD CHOCOLATE COATING";
    }

    @Override
    public double price() {
        return 200.00;
    }
    
}
