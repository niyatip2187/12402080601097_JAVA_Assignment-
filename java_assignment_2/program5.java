import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        try {
            // Open file
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {

                // Convert to lowercase & split words
                String words[] = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (word.length() > 0) {
                        map.put(word, map.getOrDefault(word, 0) + 1);
                    }
                }
            }

            br.close();

            // Display result
            System.out.println("Word Count:");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("Error reading file!");
        }
    }
}
