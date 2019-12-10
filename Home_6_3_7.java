
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *

/**
 *
 * @author DENIS
 */
public class Home_6_3_7 {

    public static void main(String[] args) {
        // Let us create different integers arrays 
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 3, 4};
        int[] arr3 = new int[]{1, 2, 4, 3};
        /* putem continua   cu diferite array-uri*/

        System.out.println("is arr1 equals to arr2 : "
                + Arrays.equals(arr1, arr2));   //pentru comparare
        System.out.println("is arr1 equals to arr3 : "
                + Arrays.equals(arr1, arr3));
    }
}
