import java.util.Scanner;
import java.util.Random;

void main() {
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    int min = 1;
    int max = 11;
    int answer;
    int attempts = 0;


    int randomNumber = rand.nextInt(min, max);

    IO.println("Choose a number between 1 and 10: ");
    answer = scan.nextInt();

    while (answer != randomNumber){

        IO.println("Choose a number between 1 and 10: ");
        answer = scan.nextInt();
        attempts++;
    }
    IO.println("The number was: " + randomNumber + " Number of attempts: " + attempts);

    scan.close();


}