import java.util.Scanner;
class ShoppingSystem {
    public static void purchase(String productName) {
        System.out.println("Product: " + productName);
        System.out.println();
    }
    public static void purchase(String productName, int quantity) {
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }
    public static void purchase(String productName, int quantity, String discountCode) {
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount Code: " + discountCode);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p1 = scanner.next();
        ShoppingSystem.purchase(p1);
        String p2 = scanner.next();
        int q2 = scanner.nextInt();
        ShoppingSystem.purchase(p2, q2);
        String p3 = scanner.next();
        int q3 = scanner.nextInt();
        String code3 = scanner.next();
        ShoppingSystem.purchase(p3, q3, code3);
        scanner.close();
    }
}
