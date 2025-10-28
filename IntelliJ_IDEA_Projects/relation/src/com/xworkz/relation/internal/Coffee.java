package com.xworkz.relation.internal;

public class Coffee {

    public int coffeePrice;
    public Sugar sugar;

    public Coffee(int coffeePrice, Sugar sugar){

        this.coffeePrice=coffeePrice;
        this.sugar=sugar;

    }

    public void coffeeDetails(){

        System.out.println("The price of the coffee is = "+coffeePrice);
        System.out.println("The brand of the sugar used in the coffee is = "+sugar.sugarBrand);
        System.out.println("The number of spoons sugar required is = "+sugar.sugarSpoons);

    }

}
