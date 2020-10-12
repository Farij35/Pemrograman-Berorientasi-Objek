import java.util.*;
import java.lang.String;

public class RekursifBercabang {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int nilai = userInput.nextInt();
        int nilaiFibonacci = fibonacci(nilai, "atas");
        System.out.println("nilai fibonacci ke-" + nilai + " adalah " + nilaiFibonacci);
    }

    private static int fibonacci(int n, String daun){
        System.out.println("daun " + daun);
        System.out.println("Fibonacci ke - " + n);
        if (n == 1 || n == 0){
            return n;
        }
        return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
    }
}
