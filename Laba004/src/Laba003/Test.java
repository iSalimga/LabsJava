package Laba003;
import java.util.Scanner;
public class Test {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        Car car1 = new Car(in.nextLine());
        Car car2 = new Car(in.nextLine());
        System.out.println(car1.getName());
        System.out.println(car2.getName());
    }
}
