import java.util.Scanner;

void main() {
    Scanner scan = new Scanner(System.in);

    double temperature;
    String unit;
    double result;

    IO.println("Enter the temperature: ");
    temperature = scan.nextDouble();

    IO.println("Enter unit that you want: C or F");
    unit = scan.next();

    result = (unit.equals("C")) ? (temperature - 32) * 5 /9 : (temperature * 5/9) + 32;
    System.out.printf("Your result is: %f %s", result, unit);


    scan.close();
}