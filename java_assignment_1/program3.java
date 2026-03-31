class WrapperDemo {
    public static void main(String[] args) {

        //  Wrapper Class Example
        int num = 10;

        // Convert primitive to object (Boxing)
        Integer obj = Integer.valueOf(num);

        // Convert object to primitive (Unboxing)
        int num2 = obj.intValue();

        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper object: " + obj);
        System.out.println("Unboxed value: " + num2);

        //  String (Immutable)
        String s1 = "Hello";
        s1 = s1 + " World";   // new object created

        System.out.println("String: " + s1);

        //  StringBuffer (Mutable)
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");  // same object modified

        System.out.println("StringBuffer: " + sb);
    }
}
