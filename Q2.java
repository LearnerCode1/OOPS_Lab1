/*Write a java program to find the biggest and the smallest of five inputs.*/

import java.util.Scanner;

public class Q2{
    public static void main(String Args[]){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter input " + i);
            arr[i] = scanner.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<5;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        for(int i=0;i<5;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
    }
}
