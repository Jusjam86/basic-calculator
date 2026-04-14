import java.util.Scanner;

    public class BasicCalculator {
        public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);


        System.out.print ("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print ("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println();
        System.out.println("Possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println();
        System.out.print ("Select any option above: ");

        String option = scanner.next();
        if (option.equals("A")){
            System.out.println("Total is: " + (num1 + num2));
        }
        else if (option.equals("S")){
            System.out.println("Total is: " + (num1 - num2));
        }
        else if (option.equals("M")){
            System.out.println("Total is: " + (num1 * num2));
        }
        else if (option.equals("D")){
            System.out.println("Total is: " + (num1 / num2));
        }
        else {
            System.out.println("Invalid option, please try again");
        }

    }
}
