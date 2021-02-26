package com.company;

import article.Article;
import article.Cosmetics;
import article.Vegetables;
import article.Fruit;
import shop.Bill;
import shop.GroceryShop;

public class Main {

    public static void main(String[] args) {
        Article a1 = new Vegetables("Potato", "kg", 70);
        Article a2 = new Vegetables("Carrot", "kg", 80);
        Article a3 = new Fruit("Orange", "kg", 95, "fresh");
        Article a4 = new Fruit("Apple", "kg", 120, "fresh");
        Article a5 = new Fruit("Raspberry", "kg", 90, "frozen");
        Article a6 = new Fruit("Fig", "kg", 88, "dry");
        Article a7 = new Cosmetics("Toothpaste", 120);
        Article a8 = new Cosmetics("Shampoo", 80);

        Bill r1 = new Bill();
        r1.addArticle(a1, 3);
        r1.addArticle(a2, 5);

        Bill r2 = new Bill();
        r2.addArticle(a3, 5);
        r2.addArticle(a4, 1);
        r2.addArticle(a5, 2);

        Bill r3 = new Bill();
        r3.addArticle(a1, 1);
        r3.addArticle(a7, 2);
        r3.addArticle(a8, 1);

        GroceryShop p = new GroceryShop("G.S...", "Obilicev venac 19");
        p.addBill(r1);
        p.addBill(r2);
        p.addBill(r3);

        System.out.println(p);


    }
}
