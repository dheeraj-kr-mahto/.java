import java.util.Scanner;

public class PrimeNumbersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Prime numbers in the array:");
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
   
    public static boolean isPrime(int n) {
        if (n <= 1)
        return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) 
            return false;
        }
        return true;
    }
}
