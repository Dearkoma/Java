package 类的作业;

public class homework03 {
    public static void main(String[] args) {
        Book book = new Book("穿越火线", 100);
        book.print();
        book.UpdatePrice();
        book.print();
    }
}

class Book {
    String name;
    double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void UpdatePrice() {
        // 如果方法中,没有price 局部变量,this.price == price
        if (this.price > 150) {
            this.price = 150;
        } else if (this.price < 150 && this.price > 100) {
            this.price = 100;
        }
    }

    public void print() {
        System.out.println("书名:" + this.name + "价格=" + this.price);
    }
}