/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Scanner;

/**
 *
 * @author DENIS
 */
public class Home_5_9 {

    public static void main(String args[]) {
        System.out.println("Enter the mark!");
        Scanner input = new Scanner(System.in);
        String mark = input.nextLine();
        switch (mark) {
            case "9":
            case "10":
                System.out.println("i'm proud you!");
                break;
            case "8":
            case "7":
                System.out.println("very good!");
                break;
            case "6":
                System.out.println("good!");
                break;
            case "5":
                System.out.println("approved!");
                break;
            case "4":
            case "3":
            case "2":
            case "1":
            case "0":
                System.out.println("Fail!");
                break;
            default:
                System.out.println("Marks are from 0 to 10!\nTry again! ");
        }
    }

}
