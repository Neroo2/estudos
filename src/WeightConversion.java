import java.util.Scanner;

void main() {
    Scanner scan = new Scanner(System.in);

    double weight;
    int option;
    double result;

    IO.println("Enter your weight: ");
    weight = scan.nextDouble();

    IO.println("Select an option: 1 - to kg or 2 - to lb: ");
    option = scan.nextInt();

    if (option == 1) {
        result = weight * 0.4536;
        IO.println(result);
    }else if (option == 2){
        result = weight * 2.205;
        IO.println(result);
    }else{
        IO.println("Invalid option");
    }


}