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
        System.out.println("Try try try \n" + factorial(7));
    }
// Factorial of any n! = n∗(n−1)∗(n−2)∗(n−3)∗...3∗2∗1

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    // Combination of any 

}
