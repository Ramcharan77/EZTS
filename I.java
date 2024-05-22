import java.io.*;
import java.util.*;
public class I 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        double tax=sc.nextDouble();
        int age=sc.nextInt();
        
        if (age>60) {
                if (tax <= 300000) {
                    tax = 0;
                } else if (tax <= 500000) {
                    tax = (tax - 300000) * 0.05;
                } else if (tax <= 2000000) {
                    tax = (200000 * 0.05) + (tax - 500000) * 0.10;
                } else {
                    tax = (200000 * 0.05) + (1500000 * 0.10) + (tax - 2000000) * 0.20;
                }
            } 
            else {
                if (tax <= 250000) {
                    tax = 0;
                } else if (tax <= 500000) {
                    tax = (tax - 250000) * 0.05;
                } else if (tax <= 1000000) {
                    tax = (250000 * 0.05) + (tax - 500000) * 0.10;
                } else if (tax <= 3000000) {
                    tax = (250000 * 0.05) + (500000 * 0.10) + (tax - 1000000) * 0.20;
                } else {
                    tax = (250000 * 0.05) + (500000 * 0.10) + (2000000 * 0.20) + (tax - 3000000) * 0.30;
                }
            }
            System.out.println(tax);
        }
        
    }  
