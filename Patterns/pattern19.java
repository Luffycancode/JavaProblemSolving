package Patterns;

import java.util.*;

public class pattern19 {

// * * * * *       *
//         *       *
//         *       *
//         *       *
// * * * * * * * * * 
// *       *
// *       *
// *       *
// *       * * * * * 
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

for(int i=1;i<=n;i++)
{
    for(int j=1;j<=n;j++)
    {

       if(i==1 && j>n/2+1 && j<n || i==n && j>1 && j<n/2+1)
       {
          System.out.print("  ");
       }

       else if(i>1 && i<n/2+1 && j!=n/2+1 && j!=n || i<n && i>n/2+1 && j!=1 && j!=n/2+1)
       {
        System.out.print("  ");
       }




       else
       {
        System.out.print("* ");
       }
    }
       System.out.println();

}

}

    }
