/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathslib;

/**
 *
 * @author lizzy
 */
public class MathsLib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Try try try \n" + primeTest(2));
    }
// Factorial of any n! = n∗(n−1)∗(n−2)∗(n−3)∗...3∗2∗1

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    // Combination of any

    //Even numbers
    public static boolean evenNumber(int a) {
        if (a > 0 && (a % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    //odd numbers
    public static boolean oddNumber(int a) {
        if (a > 0 && (a % 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    //check if any given number is a Prime Number
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

}
