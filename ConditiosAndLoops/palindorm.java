package Example.java.ConditiosAndLoops;

public class palindorm {
    public static void main(String[] args) {
         int num =909,rev=0,temp=num,rem;
         while (temp!=0){
             rem =temp%10;
             rev =rev*10+rem;
             temp/=10;
         }
         if(num==rev){
             System.out.println("palindrome " +num);
         }
         else {
             System.out.println(
                     "Not a palindorme"
             );
         }
    }
}
