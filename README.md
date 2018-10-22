# MathsLib
Java Solutions for Simple Mathematics problems
## Factorial
Simple and short recursive function to calculate factorial of any given value using Java
> Factorial of any n! = n∗(n−1)∗(n−2)∗(n−3)∗...3∗2∗1

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
> Another way of calculating factorial without using recursion

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
     }
> The end of Factorial function using recursive method
***
 ## Permutation
 Simple code to calculate the permutation (Refering to the factorial fucntions above).
 > nPr = factorial(n) / factorial(n-r) Permutation
 
       public static float permutation(int n, int r) {
           float nPr = factorial(n) / factorial(n - r);
            return nPr;
        }
 > The end of permutation
 ***
  ## Combination
  Simple code to calculate the combination (Refering to the factorial fucntions above).
  > nCr = factorial(n)/(factorial(n-r) * factorial(r))
  
        public static float combination(int n, int r) {
           float nCr = factorial(n) / (factorial(r) * factorial(n - r));
            return nCr;
         }
> The end of combination
***
## Even Number
A simple method to test is a number is even or not. It returs true if number is even.
> Test for Even number

    public static boolean evenNumber(int a) {
        if (a > 0 && (a % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
> The end of even number test
***
## Odd Number
> Test for Odd number

    public static boolean oddNumber(int a) {
        if (a > 0 && (a % 2) != 0) {
            return true;
        } else {
            return false;
        }
    }
  >The end of odd number test
  ***
  ## Prime Numbers
  >A simple java method to test if any given number is a Prime numbers 
  
        public static boolean primeTest(int n) {
           if (n <= 1) {
              return false;
          }
           for (int i = 2; i < Math.sqrt(n); i++) {
              if (n % i == 0) {
                return false;
               }
          }
            return true;
        }
  > The end of prime number
  ***
  ## Fibonacci Series
  > A simple method to display fibonnaci series
  
    public static void fibonacci(int n) {
        int a = 0, b = 0, c = 1;
        while (a < n) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a);
        }
    }
  >The end of fibonacci series
  ***
