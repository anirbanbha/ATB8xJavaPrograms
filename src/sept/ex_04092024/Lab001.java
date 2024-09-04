package sept.ex_04092024;

import java.util.Scanner;

public class Lab001 {
    public static void main(String[] args) {
        /*

        Create a simple calculator that performs addition, subtraction, multiplication, and division,
         modus based on user input using switch statements.

            Inputs :   num 1, num 2, +
            Output :  num1+num2 → print information.
         */
        Float num = 0.00F;
        Scanner myObj = new Scanner(System.in);
        //System.out.println("Enter numb1, num2 for Mathetical operations:");
        //System.out.println("For addition Type Add, for substraction type Sub," +
                //"Divison type Div, Modulo type Mod and Multiplication Type Mul");
        System.out.println("Enter numb1 and press enter: ");
        Float numb1 = myObj.nextFloat();
        System.out.println("Enter numb2 and press enter: ");
        Float numb2 = myObj.nextFloat();
        // Clear the buffer
        myObj.nextLine();
        System.out.println("Enter Add or Min or Sub or Mod or Mul and press enter: ");
        String oper = myObj.nextLine();
        switch (oper) {
            case "Add":
            case  "add":
                num = numb1 + numb2;
                System.out.println("Addition of two numbers is: " + num);
                break;
            case "Sub":
            case "sub":
                num = numb1 - numb2;
                System.out.println("Subtraction of two numbers is: " + num);
                break;
            case "Div":
            case "div":
                if (numb2 != 0) {
                    num = numb1 / numb2;
                    System.out.println("Division of two numbers is: " + num);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case "Mod":
            case "mod":
                if (numb2 != 0) {
                    num = numb1 % numb2;
                    System.out.println("Modulo operation result is: " + num);
                } else {
                    System.out.println("Modulo by zero is not allowed.");
                }
                break;
            case "Mul":
            case "mul":
                num = numb1 * numb2;
                System.out.println("Multiplication of two numbers is: " + num);
                break;
            default:
                System.out.println("Invalid operation selected.");
        }


    }



}
