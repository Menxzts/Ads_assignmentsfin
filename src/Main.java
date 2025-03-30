import java.util.*;

public class Main{

    //You are given a number “n” and an array of “n” elements, write the function that returns minimum of them.
    //Time Complexity:O(n)
    //Space Complexity: O(1)
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // You are given a number “n” and an array of “n” elements, write the function that returns average of them.
    // Time Complexity;O(n)
    //Space Complexity: O(1)
    public static double findAverage(int[] arr) {
        if (arr.length == 0) return 0;
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    // You are given a number “n”, write the function for checking whether“n” is prime.
    //Time Complexity:O(sqrt(n)
    //Space Complexity:O(sqrt(n))
    public static boolean isPrime(int n, int i) {
        if (n <= 2) return (n == 2);
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }

    // You are given a number “n”, write the program using recursion for finding “n!”
    // Time Complexity: O(n)
    //Space Complexity: O(n) (Recursive call stack)
    public static int factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }

    //You are given a number “n”, write the function for finding n-th elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2).
    //Time Complexity:O(2n)
    //Space Complexity: O(n)
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // You are given numbers “a” and “n”, write the function that returns “an”.
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public static int power(int a, int n) {
        return (n == 0) ? 1 : a * power(a, n - 1);
    }

    // You are given a string consisting of M distinct symbols. Print
    //all the permutations (all possible variants) of the symbols of this string.
    //Time Complexity:O(n!)
    //Space Complexity: O(n)
    public static void permute(char[] str, int l, int r) {
        if (l == r) {
            System.out.println(new String(str));
            return;
        }
        for (int i = l; i <= r; i++) {
            swap(str, l, i);
            permute(str, l + 1, r);
            swap(str, l, i);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // You are given a string “s”, write the function for checking whether “s” is all consists of digits.
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public static boolean isDigitString(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    // You are given numbers “n” and “k”, write the program that finds Ck (binomial coefficient) using formulaCk=C
    //k−1+C k where C0=Cn=1.
    // Time Complexity:O(2n)
    //Space Complexity: O(n)
    public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }

    // You are given “a” and “b”, write the function for finding GCD(a, b) using recursion. (Hint: Euclidean Algorithm
    // Time Complexity:O(logmax(a,b))
    //Space Complexity: O(logmax(a,b))
    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose a problem (1-10), 0 stop");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    int n1 = scanner.nextInt();
                    int[] arr1 = new int[n1];
                    for (int i = 0; i < n1; i++) arr1[i] = scanner.nextInt();
                    System.out.println(findMin(arr1));
                    break;
                case 2:
                    int n2 = scanner.nextInt();
                    int[] arr2 = new int[n2];
                    for (int i = 0; i < n2; i++) arr2[i] = scanner.nextInt();
                    System.out.println(findAverage(arr2));
                    break;
                case 3:
                    int num3 = scanner.nextInt();
                    System.out.println(isPrime(num3, 2) ? "Prime" : "Composite");
                    break;
                case 4:
                    int num4 = scanner.nextInt();
                    System.out.println( factorial(num4));
                    break;
                case 5:
                    int num5 = scanner.nextInt();
                    System.out.println(fibonacci(num5));
                    break;
                case 6:
                    int base = scanner.nextInt(), exp = scanner.nextInt();
                    System.out.println(power(base, exp));
                    break;
                case 7:
                    String str = scanner.next();
                    permute(str.toCharArray(), 0, str.length() - 1);
                    break;
                case 8:
                    String s = scanner.next();
                    System.out.println(isDigitString(s) ? "Yes" : "No");
                    break;
                case 9:
                    int n9 = scanner.nextInt(), k = scanner.nextInt();
                    System.out.println(binomialCoeff(n9, k));
                    break;
                case 10:
                    int a = scanner.nextInt(), b = scanner.nextInt();
                    System.out.println(gcd(a, b));
                    break;
            }
        }
        scanner.close();
    }
}


