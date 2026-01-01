import java.util.Scanner;

void main() {

    Scanner scan = new Scanner(System.in);

    String item;
    double price;
    int quantity;
    double total;

    IO.println("Enter the item name: ");
    item = scan.nextLine();

    IO.println("Enter the item price: ");
    price = scan.nextDouble();

    IO.println("Enter the number of items: ");
    quantity = scan.nextInt();

    total = price * quantity;

    System.out.printf("Your shopping cart total is: %.2f  and you chose the current item: %s ", total, item);

    scan.close();
}
