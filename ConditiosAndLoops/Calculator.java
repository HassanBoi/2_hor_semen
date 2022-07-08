package Example.java.ConditiosAndLoops;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the kind of operation : ");
        int ans =0;
        while (true){
            char op =in.next().trim().charAt(0);

            if(op =='+'||op =='-'||op =='*'||op =='/'||op =='%'){
                System.out.print("Enter the first digit : ");
                int in1 =in.nextInt();
                System.out.print ("Enter the second digit : ");
                int in2 =in.nextInt();
                if(op=='+') {
                    ans=in1 + in2;
                }
                if (op=='-') {
                    ans=in1 - in2;
                }
                if (op=='*') {
                    ans=in1 * in2;
                }
                if (op=='/') {
                    if(in2!=0){
                    ans=in1 / in2;
                    }
                }
                if (op=='%'){
                    ans=in1 % in2;
                }
            }
            else if (op=='x'||op=='X'){
                break;
            }
            else {
                System.out.println("Invalid inputs opreators!!!!!");
            }
            System.out.println("The ans for is: "+ ans);
        }
    }
}
