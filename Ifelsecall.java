import java.util.Scanner;

public class Ifelsecall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a= ");
        int a = in.nextInt();
        Scanner in1 = new Scanner(System.in);
        System.out.print("b= ");
        int b = in.nextInt();
        System.out.println("Choice sum=1");
        System.out.println("Choice sub=2");
        System.out.println("Choice Divide=3");
        System.out.println("Choice Multiple=4");
        System.out.println("Choice Moduluse=5");
        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter The Choice=");
        int c = in.nextInt();
        if (c == 1) {
            System.out.println(a + b);
        } else if (c == 2) {
            System.out.println(a - b);
        } else if (c == 3) {
            System.out.println(a / b);
        } else if (c == 4) {
            System.out.println(a * b);
        } else if (c == 5) {
            System.out.println(a % b);
        } else {
            System.out.println("Error!");
        }

    }

}
