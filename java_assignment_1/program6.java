// Abstract class
abstract class Cipher {
    String text;

    Cipher(String text) {
        this.text = text;
    }

    // Abstract methods
    abstract void encrypt();
    abstract void decrypt();
}

// Child class
class CaesarCipher extends Cipher {

    CaesarCipher(String text) {
        super(text);
    }

    // Encrypt method (override)
    void encrypt() {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                ch = (char) (ch + 3); // shift by 3
            }

            result += ch;
        }
        System.out.println("Encrypted Text: " + result);
    }

    // Decrypt method (override)
    void decrypt() {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                ch = (char) (ch - 3); // shift back
            }

            result += ch;
        }
        System.out.println("Decrypted Text: " + result);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        String msg = "HELLO";

        CaesarCipher obj = new CaesarCipher(msg);

        obj.encrypt();
        obj.decrypt();
    }
}
