import java.util.Scanner;

void main() {
    Scanner scan = new Scanner(System.in);

    double firstNumber;
    double secondNumber;
    String operator;
    double result = 0;

    IO.println("Enter the first number: ");
    firstNumber = scan.nextDouble();

    IO.println("Enter the second number: ");
    secondNumber = scan.nextDouble();

    IO.println("Enter the operator: ");
    operator = scan.next();

    switch (operator){
        case "+" -> result = firstNumber + secondNumber;
        case "-" -> result = firstNumber - secondNumber;
        case "/" -> result = firstNumber / secondNumber;
        case "*" -> result = firstNumber * secondNumber;

    }

    IO.println(result);

    scan.close();
}