import java.util.Scanner;

public class PrintVowelsAndNonVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read user input
        System.out.println("Enter a string:");
        String text = input.nextLine();

        // Start counters
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0, nonVowelCount = 0;

        // Loop through each character and count
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            switch (ch) {
                case 'a': countA++; break;
                case 'e': countE++; break;
                case 'i': countI++; break;
                case 'o': countO++; break;
                case 'u': countU++; break;
                default: nonVowelCount++; break;
            }
        }

        // Print results
        System.out.println("Number of 'a' characters: " + countA);
        System.out.println("Number of 'e' characters: " + countE);
        System.out.println("Number of 'i' characters: " + countI);
        System.out.println("Number of 'o' characters: " + countO);
        System.out.println("Number of 'u' characters: " + countU);
        System.out.println("Number of non-vowel characters: " + nonVowelCount);

        input.close();
    }
}
