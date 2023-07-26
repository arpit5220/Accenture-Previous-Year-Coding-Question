import java.util.Scanner;
import java.util.ArrayList;
public class LargeSmallSum {
    
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size");
        int n=sc.nextInt();
        System.out.println("Enter Array Elements");
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        if(n==0 || n<=3)
          System.out.println("0");
          
        else
        {
            ArrayList<Integer> Oddlist=new ArrayList<>();
            ArrayList<Integer> Evenlist=new ArrayList<>();

            for(int i=0;i<n;i++)
            {
                if(i%2==0)
                {
                    Evenlist.add(arr[i]);
                }
                else
                {
                    Oddlist.add(arr[i]);
                }
            }

            int a=0,b=0;
            for(int val:Evenlist)
            {
                if(val>a)
                {
                    b=a;
                    a=val;
                }
                else if(val>b && val<a)
                {
                    b=val;
                }
            }

            int secondlargest=b;

            int a1=Integer.MAX_VALUE,b1=Integer.MAX_VALUE;

            for(int val:Oddlist)
            {
                if(val<a1)
                {
                    b1=a1;
                    a1=val;
                }
                else if(val<b1 && val>a1)
                {
                    b1=val;
                }
            }

            int secondsmallest=b1;

            System.out.println(secondsmallest+secondlargest);

        }
    }
}
