import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int value1;
        int value2;
        String operation;


        System.out.println("Java Calculator");

        System.out.print("Input 1st Value: ");
        value1 = input.nextInt();

        System.out.println(" ");

        System.out.print("Input 2nd Value: ");
        value2 = input.nextInt();

        System.out.println("Choose Operation: + , - , % , x");
        operation = input.next();

        if(operation.equals("+")){
            sum = value1 + value2;
        }

        if (operation.equals("-")) {
            sum = value1 - value2;
        }

        if (operation.equals("/")){
            sum = value1 / value2;
        }

        if (operation.equals("x")){
            sum = value1 * value2;
        }


        System.out.println("Result: " + sum);

    }
}
