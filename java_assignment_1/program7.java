// Outer class
class Outer {

    int x = 10;

    //  Member Inner Class
    class MemberInner {
        void display() {
            System.out.println("Member Inner Class: x = " + x);
        }
    }

    // Method to show Local Inner Class
    void showLocal() {
        int y = 20;

        //  Local Inner Class
        class LocalInner {
            void display() {
                System.out.println("Local Inner Class: y = " + y);
            }
        }

        LocalInner obj = new LocalInner();
        obj.display();
    }
}

// Interface for Anonymous class
interface Test {
    void show();
}

// Main class
public class Main {
    public static void main(String[] args) {

        Outer outer = new Outer();

        // Access Member Inner Class
        Outer.MemberInner m = outer.new MemberInner();
        m.display();

        // Access Local Inner Class
        outer.showLocal();

        //  Anonymous Inner Class
        Test t = new Test() {
            public void show() {
                System.out.println("Anonymous Inner Class");
            }
        };

        t.show();
    }
}
