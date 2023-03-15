import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Enter the temperature in Celcius: ");
        Scanner userinput = new Scanner(System.in);
        float tempinC = userinput.nextFloat();
        float tempinF = (tempinC * 9/5) + 32;
        System.out.println("The temperature in Farenheit is: " + tempinF);
        userinput.close();

    }
}
