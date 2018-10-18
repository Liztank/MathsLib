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
