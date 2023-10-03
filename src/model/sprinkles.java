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
public class sprinkles extends Toppings{
  IceCreams icecream;

    public sprinkles(IceCreams icecream) {
        this.icecream = icecream;
    }
    @Override
    public String getToppingName() {
        return "SPRINKLES";
    }

    @Override
    public double price() {
        return 200.00;
    }
     
}
