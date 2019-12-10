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
public class Home_5_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        char operator = input.next().charAt(0);
        double addition = a + b;
        double subtraction = a - b;
        double multiplication = a * b;
        double division = a / b;
        switch (operator) {
            case '+': {
                System.out.print("Total after Addition is : " + addition);
                break;
            }
            case '-': {
                System.out.print("Total after Subtraction is : " + subtraction);
                break;
            }
            case '*': {
                System.out.print("Total after Multiplication is : " + multiplication);
                break;
            }
            case '/': {
                System.out.print("Total after Division is : " + division);
                break;
            }
            default: {
                System.out.println("Please select proper operator");
                return;
            }
        }
    }
}
