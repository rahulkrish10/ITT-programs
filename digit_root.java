import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        int tempNumber = number; 
        while (tempNumber > 9) {
            int sum = 0;
            while (tempNumber > 0) {
                sum += tempNumber % 10;
                tempNumber /= 10;
            }
            tempNumber = sum;
        }
        System.out.println("Digital Root: " + tempNumber);
        scanner.close();
    }
}
