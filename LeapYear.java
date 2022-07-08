package Example.java.ConditiosAndLoops;

public class LeapYear {
    public static void main(String[] args) {
        int y = 2002; //intialise the variable y
        if(y%400==0){ //condition of leap year
            System.out.println("leap Year"+y);
        }
        if(y%4==0&&y%100!=0){
            System.out.println("leap Year " +y);
        }else {
            System.out.println("not Leap year "+y);
        }
    }
}
