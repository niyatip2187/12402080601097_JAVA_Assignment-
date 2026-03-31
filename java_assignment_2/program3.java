import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ArrayListCRUD {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        // CREATE
        list.add(new Student(1, "Rahul"));
        list.add(new Student(2, "Priya"));

        // READ
        System.out.println("Students:");
        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }

        // UPDATE
        for (Student s : list) {
            if (s.id == 1) {
                s.name = "Amit";
            }
        }

        // DELETE
        list.removeIf(s -> s.id == 2);

        System.out.println("After Update & Delete:");
        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}

public class HashMapCRUD {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // CREATE
        map.put(1, "Rahul");
        map.put(2, "Priya");

        // READ
        System.out.println("Students: " + map);

        // UPDATE
        map.put(1, "Amit");  // replaces value

        // DELETE
        map.remove(2);

        System.out.println("After Update & Delete: " + map);
    }
}

public class TreeMapCRUD {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        // CREATE
        map.put(2, "Priya");
        map.put(1, "Rahul");

        // READ (sorted order)
        System.out.println("Students: " + map);

        // UPDATE
        map.put(1, "Amit");

        // DELETE
        map.remove(2);

        System.out.println("After Update & Delete: " + map);
    }
}
