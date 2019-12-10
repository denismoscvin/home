/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author DENIS
 */
public class Home_6_3_5 {

    public static void main(String args[]) {

        int[] a = {1, 2, 3};
        int[] b = a;
        b[0]++;

        System.out.println("Scenario 1: ");
        System.out.print("Array a: ");

        printArray(a);
        System.out.print("Array b: ");
        printArray(b);
    }

    private static void printArray(int[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
