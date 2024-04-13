package Patterns;

import java.util.*;

public class pattern20 {

// *               *
// *               *
// *               *
// *               *
// *       *       *
// *     *   *     *
// *   *       *   *
// * *           * *
// *               *
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

    for(int i=1;i<=n;i++)
    {

        for(int j=1;j<=n;j++)
        {

         if(j==1 || j==n || i+j==n+1 && i>n/2 || i==j && i>n/2)
         {
            System.out.print("* ");
         }
         else
         {
    
            System.out.print("  ");
         }


        }
        System.out.println();
    }

    }

}
