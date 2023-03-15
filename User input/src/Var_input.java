import java.util.Scanner;

public class Var_input {
    public static void main(String[] args) {
        System.out.print("Enter your roll number :");
        try (Scanner userinput = new Scanner(System.in)) {
            int rollno = userinput.nextInt();
            System.out.println("Your rollno is "+rollno);
        }

    }
}
