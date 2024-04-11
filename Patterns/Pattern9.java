package Patterns;

import java.util.*;

public class Pattern9 {

// *           *
//   *       *
//     *   *
//       *
//     *   *
//   *       *
// *           *
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        // int star = n/2+1;
        for (int i = 1; i <= n; i++) {

          

            for (int j = 1; j<=n; j++) {

if(i==j || i+j==n+1 )
{
    System.out.print("* ");
}
else{
    System.out.print("  ");
}



                
            }
            System.out.println();
            
        }
    }
}