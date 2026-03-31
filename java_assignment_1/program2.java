import java.util.Scanner;

class Matrix {
    int rows, cols;
    int arr[][];

    // Constructor
    Matrix(int r, int c) {
        rows = r;
        cols = c;
        arr = new int[rows][cols];
    }

    // Input matrix
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // Display matrix
    void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Transpose
    Matrix transpose() {
        Matrix t = new Matrix(cols, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                t.arr[j][i] = arr[i][j];
            }
        }
        return t;
    }

    // Multiplication
    Matrix multiply(Matrix m2) {
        Matrix result = new Matrix(this.rows, m2.cols);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < m2.cols; j++) {
                result.arr[i][j] = 0;
                for (int k = 0; k < this.cols; k++) {
                    result.arr[i][j] += this.arr[i][k] * m2.arr[k][j];
                }
            }
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First matrix
        System.out.print("Enter rows and columns of Matrix 1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        Matrix m1 = new Matrix(r1, c1);
        m1.input();

        // Transpose
        System.out.println("Transpose of Matrix 1:");
        Matrix t = m1.transpose();
        t.display();

        // Second matrix
        System.out.print("Enter rows and columns of Matrix 2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        Matrix m2 = new Matrix(r2, c2);
        m2.input();

        // Multiplication check
        if (c1 == r2) {
            System.out.println("Multiplication Result:");
            Matrix result = m1.multiply(m2);
            result.display();
        } else {
            System.out.println("Multiplication not possible!");
        }
    }
}
