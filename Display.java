import java.util.Scanner;

public class Display{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        while (n>=1){
            System.out.print(n+" ");
            n--;
        }
    }

    public void main2(){

    }
}
