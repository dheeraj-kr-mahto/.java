import java.util.Scanner;

public class findFactorial {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();

        int factorial = factorial(num);
        int sumOfDigits = sumOfDigits(factorial);
        
        System.out.println("Factorial of number : " + factorial);
        System.out.println("Sum of digits of factorial: " + sumOfDigits);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}



    


