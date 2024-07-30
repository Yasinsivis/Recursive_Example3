
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    static void goDeepBy5(int n) {
        goDeepBy5(n, 0);
    }

    static int goDeepBy5(int n, int count) {
        if (n <= 0)
            return goUpBy5(n, count);

        System.out.print(n + " ");
        return goDeepBy5(n - 5, ++count);
    }

    static int goUpBy5(int n, int count) {
        System.out.print(n + " ");

        if (count == 0)
            System.exit(0);

        return goUpBy5(n + 5, --count);
    }

    public static void main(String[] args) {
        int N = 0;
        System.out.println("Lütfen Bir Sayı Giriniz:");
        N = scanner.nextInt();
        goDeepBy5(N);
    }
}