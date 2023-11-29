package WrapperType;

import java.util.Comparator;
import java.util.Arrays;
public class ArraysExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Java", 100);
        books[1] = new Book("C++", 200);
        books[2] = new Book("Python", 300);
        books[3] = new Book("JavaScript", 250);
        
        /*Arrays.sort(books,new Comparator(){
            public int compare(Object o1, Object o2) {
                Book book = (Book) o1;
                Book book2 = (Book) o2;
                double pricebook = book.getPrice() - book2.getPrice();
                if (pricebook > 0) {
                    return -1;
                } else if (pricebook < 0) {
                    return 1;
                } else
                    return 0;
            }
        });*/
        Arrays.sort(books,new Comparator(){
            public int compare(Object o1, Object o2){
                Book book = (Book) o1;
                Book book2 = (Book) o2;
                return book2.getName().length()-book.getName().length();
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
    class Book {
        private String name;
        private double price;

        public Book(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Book [name=" + name + ", price=" + price + "]";
        }
        
    }