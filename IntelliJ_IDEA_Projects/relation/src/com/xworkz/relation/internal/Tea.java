package com.xworkz.relation.internal;

public class Tea {

    public int teaPrice;
    public Sugar sugar;

    public Tea(int teaPrice,Sugar sugar){

        this.teaPrice=teaPrice;
        this.sugar=sugar;

    }

    public void teaDetails(){

        System.out.println("The price of the tea is = "+teaPrice);
        System.out.println("The brand of the sugar used in the tea is = "+sugar.sugarBrand);
        System.out.println("The number of spoons sugar required is = "+sugar.sugarSpoons);

    }

}
