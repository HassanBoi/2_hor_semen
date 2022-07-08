package Example.java.ConditiosAndLoops;

import java.util.Scanner;

public class Find_Square_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height : ");
        int Height = sc.nextInt();
        System.out.println("Enter the Width : ");
        int  Width =sc.nextInt();
        if(Height==Width){
            System.out.println("Square");
        }
        else {
            System.out.println("Rectangle");
        }
    }
}
