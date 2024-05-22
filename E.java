import java.io.*;
import java.util.*;
public class E{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int u=sc.nextInt();
        double bill=0;
        if(u<=50)
        {
            bill=u*0.5;
        }
        else if(u<=150){
            bill=50*0.5+(u-50)*0.75;
        }
        else if(u<=250){
            bill= 50*0.5+(100*0.75)+(u-150)*1.20;
        }
        else {
            bill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (u - 250) * 1.50;
        }
        double sub=0.2*bill;
        bill+=sub;
        System.out.println("Total amount="+bill);

    }
}