package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String itemName = "Cheese";
        double itemPrice = 75.99;
        int itemQuantity = 2;

        System.out.println("You bought " + itemQuantity + " " + itemName + " " + "for $" + itemPrice );
    }
}
