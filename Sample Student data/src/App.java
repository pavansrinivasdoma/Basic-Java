import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = userinput.nextLine();
        System.out.print("Enter your branch details: ");
        String branch = userinput.nextLine();
        System.out.print("Enter your rollno: ");
        int rollno = userinput.nextInt();

        System.out.println("\n");
        System.out.println("Name: "+name + "\n"+"Branch: " + branch + "\n" +"Roll no: " + rollno);
        userinput.close(); //To avoid the error that we get in initializing the input variable
    }
}
