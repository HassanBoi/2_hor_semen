package Example.java.ConditiosAndLoops;

import java.util.Scanner;
//import java.util.logging.SocketHandler;

public class Find_Even_or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int Add_number = sc.nextInt();
//        if(Add_number >=0){
        if(Add_number%2==0){
            System.out.println("Even");
//        }
//        break;
        }
        else {
            System.out.println("Odd");
        }

    }
}
