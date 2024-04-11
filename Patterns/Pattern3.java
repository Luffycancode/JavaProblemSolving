package Patterns;
import java.util.*;
public class Pattern3 {



    public static void main(String[] args) {

        //     *
        //    **
        //   *** 
        //  ****
        // *****

        Scanner scan=new Scanner(System.in);

int n=scan.nextInt();
int space=n-1;
int star=1;
for(int i=1;i<=n;i++)
{
    
for(int j=1;j<=space;j++)
{
System.out.print("  ");
}
for(int k=1;k<=star;k++)
{
    System.out.print("* ");
}
System.out.println();
space--;
star++;
}


    }
}
