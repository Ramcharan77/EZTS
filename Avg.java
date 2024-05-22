import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr;
        arr=new int[10];
        int i,s=0;
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
            s+=arr[i];
        }
        System.out.println("Avg="+s/10);

        

        
    }
    
}
