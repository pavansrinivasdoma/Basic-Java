import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
            System.out.print("Enter your first number: ");
            int num1 = userinput.nextInt();
            System.out.print("Enter your next number: ");
            int num2 = userinput.nextInt();

            int sum = num1 + num2;
            System.out.println("The sum of two numbers is: " + sum);
            userinput.close();
        }

    }

