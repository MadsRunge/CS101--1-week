package Methods;

import java.util.Scanner;

import static Methods.MaxMin.getMax;
import static Methods.MaxMin.getMin;

public class Main {
    public static void main(String[] args) {
         // first method
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        if (age >= 18){
            System.out.println("you are eligible to vote");
        }else {
            System.out.println("you are not eligible to vote");
        }
        
         /*
         //second method
            int max = getMax(1,18,8);
            System.out.println("Max: " + max); // 18

            int min = getMin(1,18,-8);
            System.out.println("Min: " + min); // -8

         */


        /* // third method
        Scanner OddOrEven = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = OddOrEven.nextInt();
        if (number % 2 == 0){
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
            }
         */

        /* // fourth method
        Scanner fullName = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = fullName.nextLine();
        String[] splitName = name.split(" ");
        String firstName = splitName[0].substring(0,1);
        String middleName = splitName[1].substring(0,1);
        String lastName = splitName[2];
        System.out.println("Abbreviations of your first and middle names are " + firstName + "." + middleName + " " + lastName);
         */








    }
}




