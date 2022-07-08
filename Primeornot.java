package Example.java.ConditiosAndLoops;

import java.util.Scanner;

public class Primeornot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number to find : ");
        int Num = sc.nextInt();
        int count  = 2;
        if(Num < count){
            System.out.println("Nor prime nor composite ");
        }
        for (; Num>count; count++) {
            if(count%Num==0){
                System.out.println("Not prime");
//                break;
            }else {
                System.out.println("prime");
            }
        }
    }
}
