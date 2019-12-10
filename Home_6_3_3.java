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
public class Home_6_3_3 {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int toFind = 8;   //se lucreaza cu valori   ### Scanner###
        boolean found = false;
        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(toFind + " is found.");
        } else {
            System.out.println(toFind + " is not found.");
        }
    }
}
