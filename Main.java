import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}

