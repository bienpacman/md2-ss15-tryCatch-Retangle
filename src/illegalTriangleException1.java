import java.util.InputMismatchException;
import java.util.Scanner;

public class illegalTriangleException1 {
    public static void TriangleException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cạnh a :");
        int a = scanner.nextInt();
        System.out.println("cạnh b :");
        int b = scanner.nextInt();
        System.out.println("cạnh c :");
        int c = scanner.nextInt();
        if ((a > 0 && b > 0 && c > 0) && a + b > c && b + c > a && c + a > b) {
            System.out.println("là tam giác");
        } else {
            System.out.println("Không phải tam giác");
        }
    }

    public static void main(String[] args) {
        try {
            TriangleException();
        } catch (Exception e) {
            System.out.println("Không hợp lệ");
        }
    }
}

