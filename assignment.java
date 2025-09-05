//1. Sum of Natural Numbers

import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("The sum of first " + N + " natural numbers is: " + sum);
        sc.close();
    }
}

//2. Multiplication Table

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        System.out.println("Multiplication Table of " + N + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
        sc.close();
    }
}

//3. Factorial of a Number

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        long fact = 1;  
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + N + " is: " + fact);
        sc.close();
    }
}

//4. Count Digits in a Number

import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int n = num;  
        if (n == 0) {
            count = 1;
        } else {
            while (n != 0) {
                n = n / 10; 
                count++;
            }
        }
        System.out.println("Number of digits in " + num + " is: " + count);
        sc.close();
    }
}

//5. Sum of Digits

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int n = num;
        while (n != 0) {
            int digit = n % 10;  
            sum += digit;       
            n = n / 10;         
        }
        System.out.println("Sum of digits of " + num + " is: " + sum);
        sc.close();
    }
}

//6. Palindrome Number

import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;   
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;          
            reverse = reverse * 10 + digit; 
            num = num / 10;                
        }
        if (original == reverse) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is Not Palindrome");
        }
        sc.close();
    }
}

//7. Fibonacci Series

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int N = sc.nextInt();
        int first = 0, second = 1;
        System.out.print("Fibonacci Series up to " + N + " terms: ");
        for (int i = 1; i <= N; i++) {
            System.out.print(first + " ");
            int next = first + second; 
            first = second;
            second = next;
        }
        sc.close();
    }
}

//8. Prime Number Check

import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
        sc.close();
    }
}

//9. Armstrong Number

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;       
            sum += digit * digit * digit; 
            num = num / 10;             
        }
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is Not an Armstrong number");
        }

        sc.close();
    }
}

//10. Strong Number

import java.util.Scanner;
public class StrongNumber {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;        
            sum += factorial(digit);    
            num = num / 10;              
        }
        if (sum == original) {
            System.out.println(original + " is a Strong number");
        } else {
            System.out.println(original + " is Not a Strong number");
        }

        sc.close();
    }
}

//11. Pythagorean Triplets

import java.util.Scanner;
public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        System.out.println("Pythagorean Triplets up to " + limit + ":");
        for (int a = 1; a < limit; a++) {
            for (int b = a; b < limit; b++) { 
                int cSquare = a * a + b * b;
                int c = (int) Math.sqrt(cSquare);
                if (c * c == cSquare && c < limit) {
                    System.out.println(a + ", " + b + ", " + c);
                }
            }
        }

        sc.close();
    }
}