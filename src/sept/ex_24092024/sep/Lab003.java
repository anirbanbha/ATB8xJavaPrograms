package sept.ex_24092024.sep;

import java.util.Scanner;

public class Lab003 {

    /*

    Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
Input. -
choice - 1 - km → m, km → 1km
choice - 2 - f → c, f → c

     */

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the caseID for Operation name you want");
        System.out.println("CaseID - 1 if Kms to m ");
        System.out.println("CaseID - 2 if Fahrenheit to Celsius ");

        int _CaseID = myObj.nextInt();
        switch (_CaseID) {
            case 1:
                System.out.println("Please Enter the value in KMs for conversion to Metre: ");
                float v_KMS = myObj.nextFloat();
                float v_metre = v_KMS *1000;


                System.out.println("The conversion value in metre is " + v_metre + " for KMs provided "+ v_KMS);
                break;
            case 2:
                System.out.println("Please Enter the value in Fahrenheit for conversion tso Celsius: " );
                double v_faren = myObj.nextDouble();
                double Celsius  =  (v_faren - 32) * 5/9;


                //(32°F − 32) × 5/9 = 0°C
                 System.out.println("The conversion value for Celsius " + Celsius + " from Fahrenheit " + v_faren);
                break;

            default:
                System.out.println("Invalid operation selected");

        }
    }
}
