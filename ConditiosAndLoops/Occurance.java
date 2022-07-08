package Example.java.ConditiosAndLoops;

public class Occurance {
    public static void main(String[] args) {
         //find the occurance of 3 in the given number
        //Eg: 3737379; find occurance of 3 which is = 3
        int num =3737379;
        int count =0,rem;
        while (num>0){
            rem =num%10;//the last digit is been assingend to rem

            if(rem==3){ //checking teh rem with the given conidition
                count=count+1; //increment the value by 1 already assigned in the first
            }
            num/=10; //reducing the number of rem which is 3737379 -> 373737 and so on until the loop ends

        }
        System.out.println("The occurance of 3 in the given number is = "+count);

    }
}
