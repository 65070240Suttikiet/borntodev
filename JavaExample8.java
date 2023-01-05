import java.util.Scanner;

public class JavaExample8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Money (Dollar) : ");
        double dollarInput = scanner.nextDouble();
        double exchangeRate = 35.0;
        double bath = dollarInput*exchangeRate;
        System.out.println(bath +" THB");

    }
}
