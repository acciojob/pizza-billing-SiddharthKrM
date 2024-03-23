package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price=300;
            System.out.println("Base Price Of The Pizza: "+this.price);
        }
        else
        {
            this.price=400;
            System.out.println("Base Price Of The Pizza: "+this.price);
        }// your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        this.price+=80;
        System.out.println("Extra Cheese Added: 80");// your code goes here
    }

    public void addExtraToppings(){
        if(isVeg) {
            this.price += 70;
            System.out.println("Extra Toppings Added: 70");
        }
        else
        {
            this.price += 120;
            System.out.println("Extra Toppings Added: 120");
        }// your code goes here
    }

    public void addTakeaway(){
        this.price+=20;
        System.out.println("Paperbag Added: 20");// your code goes here
    }

    public String getBill(){
        this.bill="Total Price: "+this.price;// your code goes here
        return this.bill;
    }
}
