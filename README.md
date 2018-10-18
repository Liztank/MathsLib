# MathsLib
Java Solutions for Simple Mathematics problems
## Factorial
Simple and short recursive function to calculate factorial of any given value using Java
> Factorial of any n! = n∗(n−1)∗(n−2)∗(n−3)∗...3∗2∗1

    `public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }`
> The end of Factorial function
***
## Even Number
A simple method to test is a number is even or not. It returs true if number is even.
> Test for Even number

    `public static boolean evenNumber(int a) {
        if (a > 0 && (a % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }`
> The end of even number test
***
## Odd Number
> Test for Odd number

    `public static boolean oddNumber(int a) {
        if (a > 0 && (a % 2) != 0) {
            return true;
        } else {
            return false;
        }
    }`
  >The end of odd number test
  ***
    
