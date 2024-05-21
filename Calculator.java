import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        float num1;
        float num2;
        System.out.println("Enter first number :");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();

        System.out.println("Enter second number :");
        //  Scanner scan2 = new Scanner(System.in);

        num2 = scan.nextFloat();
        System.out.println("you have entered :");
        System.out.println(num1);
        System.out.println("and");
        System.out.println(num2);

        String promt = "Enter 0 for addition, 1 for subtraction, 2 for multiply, 3 for divide";
        System.out.println(promt);

        int input = scan.nextInt();1
        switch (input) {
            case 0:
                System.out.println("Adding these number");
                System.out.println("the Result is :");
                System.out.println(num1 + num2);
                break;
            case 1:
                System.out.println("subtract these number");
                System.out.println("the Result is :");
                System.out.println(num1 - num2);
                break;
            case 2:
                System.out.println("multiply these number");
                System.out.println("the Result is :");
                System.out.println(num1 * num2);
                break;
            case 3:
                System.out.println("Divide these number");
                System.out.println("the Result is :");
                System.out.println(num1 / num2);
                break;

            default:
                System.out.println("invalid input");
        }

    }
}
