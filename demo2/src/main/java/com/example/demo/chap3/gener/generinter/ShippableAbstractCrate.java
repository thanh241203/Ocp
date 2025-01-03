package com.example.demo.chap3.gener.generinter;

/**
 * Second way
 *
 */
public class ShippableAbstractCrate<U> implements Shippable<U> {
    @Override
    public void ship(U u) {

    }

    public static void main(String[] args) {
        ShippableAbstractCrate<Robot> robotShippableAbstractCrate=new ShippableAbstractCrate<>();
        Robot robot=new Robot();
        robotShippableAbstractCrate.ship(robot);
    }
}
