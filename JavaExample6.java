import java.util.Scanner;

public class JavaExample6 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in); //input
        System.out.print("ืname = ");
        String name = value.nextLine();
        System.out.println("Hello" + name);
    }
}
