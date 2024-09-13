/*Write a java program to compute and print the average of the integers from 1 to 10. You
can make the name of class as DemoAvg. Modify the source code of the class DemoAvg so
that the program shows both the summation and the average of the integer 1 to 10 as the
following
The sum of 1 to 10 is 55.0
The average of 1 to 10 is 5.0*/

public class DemoAvg {
    public static void main(String[] args) {
        int sum = 0;
        float avg;
        
        for(int i=1;i<=10;i++){
            sum+=i;
        }
        
        avg = (float)sum/10;
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + avg);
    }
}
