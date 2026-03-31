// Thread class
class PrimeThread extends Thread {
    int start, end;

    PrimeThread(int s, int e) {
        start = s;
        end = e;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        PrimeThread t1 = new PrimeThread(1, 50);
        PrimeThread t2 = new PrimeThread(51, 100);

        t1.start();
        t2.start();
    }
}
