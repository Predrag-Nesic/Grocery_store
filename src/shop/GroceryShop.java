package shop;

import java.util.ArrayList;
import java.util.Collections;

public class GroceryShop {
    private String name;
    private String address;
    private ArrayList<Bill> bills;

    public GroceryShop(String name, String address) {
        this.name = name;
        this.address = address;
        bills = new ArrayList<>();
    }

    public void addBill(Bill bill) {
        bills.add(bill);
    }

    public Bill findBillForDay(int day, int month, int year) {
        for(Bill r : bills) {
            if(r.getDay() == day && r.getMonth() == month && r.getYear() == year) {
                return r;
            }
        }
        System.out.println("No bills are found for the date of " + day + "." + month + "." + year + ".");
        return null;
    }

    public Bill findTheMostExpensive() {
        if(bills.isEmpty()) {
            System.out.println("No bills were found.");
            return null;
        }
        return Collections.max(bills);
    }

    public Bill findTheLeastExpensive() {
        if(bills.isEmpty()) {
            System.out.println("No bills were found.");
            return null;
        }
        return Collections.min(bills);
    }

    public double averagePrice() {
        if(bills.isEmpty()) {
            System.out.println("No bills were found.");
            return -1;
        }
        double total = 0;
        double average;
        for(Bill r : bills) {
            total += r.totalPrice();
        }
        return average = total / bills.size();
    }

    @Override
    public String toString() {
        String text;
        text = "Grocery store: " + name + ", " + address;
        text += "\n------------------------------------------------";
        text += "\nThe most expensive bill: " + findTheMostExpensive();
        text += "\n------------------------------------------------";
        text += "\nThe least expensive bill: " + findTheLeastExpensive();
        text += "\n------------------------------------------------";
        text += "\nAverage bill price: " + averagePrice();
        text += "\n------------------------------------------------";
        for(Bill r : bills) {
            text += "\n" + r + "\n------------------------------------------------";
        }
        return text;
    }
}
