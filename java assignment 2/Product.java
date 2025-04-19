import java.util.Scanner;

class Products {
    private int id;
    private String name;
    private double price;

    public Products(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void displayProductDetails() {
        System.out.println("Product Details:-");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        Products product = new Products(id, name, price);
        product.displayProductDetails();
        
        scanner.close();
    }
}
