package sept.ex_24092024.sep;

import java.util.Scanner;

public class Lab002 {



        public static void main(String[] args) {

            /*

        Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
Input  - 12
Out - Dec.

         */

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number correspnding to the the Month you want from 1 to 12");
        int number = myObj.nextInt();

        switch (number) {
            case 1:
                System.out.println("The month corresponding to your " + number + " is January");
                break;
            case 2:
                System.out.println("The month corresponding to your " + number + " is February");
                break;
            case 3:
                System.out.println("The month corresponding to your " + number + " is March");
                break;
            case 4:
                System.out.println("The month corresponding to your " + number + " is April");
                break;
            case 5:
                System.out.println("The month corresponding to your " + number + " is May");
                break;
            case 6:
                System.out.println("The month corresponding to your " + number + " is June");
                break;
            case 7:
                System.out.println("The month corresponding to your " + number + " is July");
                break;
            case 8:
                System.out.println("The month corresponding to your " + number + " is August");
                break;
            case 9:
                System.out.println("The month corresponding to your " + number + " is September");
                break;
            case 10:
                System.out.println("The month corresponding to your " + number + " is October");
                break;
            case 11:
                System.out.println("The month corresponding to your " + number + " is November");
                break;
            case 12:
                System.out.println("The month corresponding to your " + number + " is December");
                break;
            default:
                System.out.println("Invalid numberber. Please enter a numberber between 1 and 12.");

        }


    }



}



