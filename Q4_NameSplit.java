/*Write a complete Java program that shows your first name and last name on screen.*/

import java.util.Scanner;

public class SplitName{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        
        String[] nameParts = name.split(" ");
        System.out.println("First name: " + nameParts[0]);
        System.out.println("Last name: " + nameParts[nameParts.length-1]);
    }
}
