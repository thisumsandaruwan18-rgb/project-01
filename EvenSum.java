import java.util.Scanner;

public class EvenSum {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");

        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i%2==0){
                sum+=i;
            }
        }

        System.out.println("Sum of Even Numbers: " + sum);
    }
}