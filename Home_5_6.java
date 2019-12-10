package homework;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DENIS
 */
public class Home_5_6 {

    public static void main(String[] args) {
        System.out.println("##### Include a day of week! #####");
        Scanner input = new Scanner(System.in);
        int dayweek = input.nextInt();
        switch (dayweek) {
            case 1:
                System.out.println("MON");
                
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 7:
                System.out.println("SUN");
                break;
            default:
                System.out.println("Include days from 1 to 7");

        }
    }
}
