package Laba1;
import java.util.Scanner;
import java.util.ArrayList;
public class Laba1 {
    Scanner in = new Scanner(System.in);
    private ArrayList<Double> arr;
    private double sum;
    Laba1 (){
        arr = new ArrayList<Double>();
    }
    public void fillArray(){
        String s = in.nextLine();
        while ( !s.equals("end")){
            arr.add(Double.parseDouble(s));
            s = in.nextLine();
        }
    }
    public void sumFor(){
        sum = 0;
        for (int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
        }
    }
    public void sumWhile(){
        int i = 0;
        sum = 0;
        while(i<arr.size()){
            sum += arr.get(i);
            i++;
        }
    }
    public void sumDoWhile(){
        sum = 0;
        int i = 0;
        do{
            sum += arr.get(i);
            i++;
        }while (i<arr.size());
    }
    public void setSum(double i){
        sum = i;
    }
    public double getSum(){
        return sum;
    }
    public String toString (){
        return this.getSum()+"";
    }

}
