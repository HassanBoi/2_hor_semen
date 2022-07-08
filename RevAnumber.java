package Example.java.ConditiosAndLoops;

public class RevAnumber {
    public static void main(String[] args) {
        int num =90323 , rem,rev = 0;
        while (num!=0){
            rem = num%10;
            rev=rev*10+rem;
            num/=10;

        }
        System.out.println("The rev number "+rev);
    }
}
