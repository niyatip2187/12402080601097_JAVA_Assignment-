import java.io.File;

public class Main {
    public static void main(String[] args) {

        // Give directory path here
        File dir = new File("C:\\Users\\Public\\Documents");

        // Get list of files
        File files[] = dir.listFiles();

        if (files != null) {
            System.out.println("Files in directory:");

            for (File f : files) {
                if (f.isFile()) {
                    System.out.println(f.getName());
                }
            }
        } else {
            System.out.println("Directory not found!");
        }
    }
}
