package Combinate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Follow_HSp {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("趣味赛大海u", "fnmp", 10.1));
        col.add(new Book("大海u", "fnmp1", 10.5));
        col.add(new Book("趣味赛u", "fnmp2", 10.9));
        System.out.println(col);//可以直接输出了;
        Iterator itor = col.iterator();
        while (itor.hasNext()) {
            System.out.println(itor.next());
        }
        itor = col.iterator();//重置itor迭代器
        
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Book [name=" + name + ", author=" + author + ", price=" + price + "]";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}