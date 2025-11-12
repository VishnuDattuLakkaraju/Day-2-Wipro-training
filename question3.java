import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        String inputLine = scanner.nextLine();

       
        String reversedLine = new StringBuilder(inputLine).reverse().toString();

        
        System.out.println(reversedLine);

        scanner.close();
    }
}
