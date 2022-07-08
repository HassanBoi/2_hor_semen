package Example.java.ConditiosAndLoops;

import java.util.Scanner;

public class Fibnaci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of Fib");
        double n = sc.nextInt();
        double a=0,b=1,count=2;
        while (count<=n){
            double temp =b;
            b =a+b;
            a=temp;
            count++;
        }
        System.out.println("The number are "+b);
    }
}
