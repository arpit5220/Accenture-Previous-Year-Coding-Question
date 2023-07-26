import java.util.*;
public class DectoNbase {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int num=sc.nextInt();
        String str="";
        while(num>0)
        {
            int rem=num%n;
            if(rem<10)
            {
                str+=rem+"";
            }
            else
            {
                str=str+ (char)(rem-9+64);
            }
            num=num/n;
        }

        System.out.println("The number is");
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());

    }
}
