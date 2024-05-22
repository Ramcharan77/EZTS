import java.io.*;
import java.util.*;
class S{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary=");
        double s=sc.nextDouble();
        double da,ta;
        if(s>=10000)
        {
            da=0.4 * s;
            ta=0.3 * s;
        }
        else{
            da=0.3 * s;
            ta=0.2 * s;
        }
        System.out.println("Gross salary="+ (s+da+ta));
    }

}