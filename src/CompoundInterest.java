import java.util.Scanner;

void main() {
    Scanner scan = new Scanner(System.in);


    double principal;
    double rate;
    int interestAmount;
    int time;
    double result;

    IO.println("Enter the principal amount: ");
    principal = scan.nextDouble();

    IO.println("Enter the interest rate (%): ");
    rate = scan.nextDouble() / 100;

    IO.println("Enter the interest amount: ");
    interestAmount = scan.nextInt();

    IO.println("Enter the time (years): ");
    time = scan.nextInt();

    result = principal * Math.pow((1 + rate/interestAmount), interestAmount * time);
    IO.println("The result is: " + result);





}