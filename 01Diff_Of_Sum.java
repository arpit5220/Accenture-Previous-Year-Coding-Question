import java.util.*;

class 01Diff_Of_Sum
{
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and m");
        int n=sc.nextInt(); 
        int m=sc.nextInt();

        int s1=0,s2=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                s1+=i;
            }
            else
            {
                s2+=i;
            }
        }

        System.out.println(s2-s1);
    }
}