import java.io.*;
import java.util.*;
public class C 
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        char s=sc.next().charAt(0);
        switch (s) {
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            if (a>b){
            System.out.println(a-b);}
            else{
            System.out.println(b-a);
            }
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            case '%':
            System.out.println(a%b);
            break;   
            default:
                break;
        }

    }
    
}
