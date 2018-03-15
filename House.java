/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myadapter;

/**
 *
 * @author arash
 */
public class House implements IHouses {
    private int sqf;
    private double pricePerFeet;

    public House(int sqf, double pricePerFeet) {
        this.sqf = sqf;
        this.pricePerFeet = pricePerFeet;
    }
    
    
    @Override
    public double getPrice() {
        return sqf* pricePerFeet;
    }
    
}
