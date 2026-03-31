import java.util.*;

// Book class
class Book implements Comparable<Book> {
    int id;
    String name;
    double price;

    Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Comparable → sort by price
    public int compareTo(Book b) {
        if (this.price > b.price)
            return 1;
        else if (this.price < b.price)
            return -1;
        else
            return 0;
    }
}

// Comparator → sort by name
class NameComparator implements Comparator<Book> {
    public int compare(Book a, Book b) {
        return a.name.compareTo(b.name);
    }
}

// Comparator → sort by id
class IdComparator implements Comparator<Book> {
    public int compare(Book a, Book b) {
        return a.id - b.id;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<>();

        list.add(new Book(3, "Java", 500));
        list.add(new Book(1, "Python", 300));
        list.add(new Book(2, "C++", 400));

        //  Sort using Comparable (by price)
        Collections.sort(list);
        System.out.println("Sorted by Price:");
        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.price);
        }

        // Sort using Comparator (by name)
        Collections.sort(list, new NameComparator());
        System.out.println("\nSorted by Name:");
        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.price);
        }

        //  Sort using Comparator (by id)
        Collections.sort(list, new IdComparator());
        System.out.println("\nSorted by ID:");
        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.price);
        }
    }
}
