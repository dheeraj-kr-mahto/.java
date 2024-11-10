import java.util.Scanner;

public class stringOccurance {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        System.out.print("Enter a character to search for: ");
        char searchChar = sc.next().charAt(0);

        int count = countOccurrences(inputString, searchChar);
        System.out.println("The character '" + searchChar + "' appears " + count + " times in the string.");
    }

    // Method to count occurrences of a character in a string
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}




