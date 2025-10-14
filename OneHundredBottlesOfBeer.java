import java.util.Scanner;

public class OneHundredBottlesOfBeer {public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);
        int verses;

        // Ask user how many verses to print
        System.out.print("How many verses would you like to print? (1-100): ");
        verses = input.nextInt();

        //  input verification
        if (verses < 1 || verses > 100) {
            System.out.println("Invalid input. Please enter a number between 1 and 100.");
            return;
        }

        // Start from 100 bottles and print the requested number of verses
        int bottles = 100;
        for (int i = 0; i < verses; i++) {
            System.out.println(bottles + " bottles of beer on the wall");
            System.out.println(bottles + " bottles of beer");
            System.out.println("If one of those bottles should happen to fall");
            System.out.println((bottles - 1) + " bottles of beer on the wall\n");
            bottles--;
        }

        input.close();
    }
}
