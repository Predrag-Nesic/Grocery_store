package shop;

import article.Article;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;

public class Bill implements Comparable<Bill> {
    private static int ID = 1;
    private int id;
    private HashMap<Article, Integer> articles;
    private int day;
    private int month;
    private int year;

    public Bill() {
        this.id = Bill.ID++;
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        day = localDate.getDayOfMonth();
        month = localDate.getMonthValue();
        year = localDate.getYear();

//        this.dan = dan;
//        this.mesec = mesec;
//        this.godina = godina;
        articles = new HashMap<>();
    }

    public void addArticle(Article article, int quantity) {
        articles.put(article, quantity);
    }

    public static int getID() {
        return ID;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public double totalPrice() {
        double total = 0;
        for(Article a : articles.keySet()) {
            total += a.price(articles.get(a));
        }
        return total;
    }

    @Override
    public String toString() {
        String text = "Bill no: " + id + "(" + day + "." + month + "." + year + ")";
        for(Article a : articles.keySet()) {
            text += "\n- " + a + "\t" + articles.get(a) + "\t" + a.price(articles.get(a));
        }
        text += "\nTotal price: " + totalPrice();
        return text;
    }

    @Override
    public int compareTo(Bill o) {
        if(this.totalPrice() > o.totalPrice()) {
            return 1;
        } else if(this.totalPrice() < o.totalPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}
