package Patterns;

import java.util.*;

public class pattern18 {

// * * * * * * * * * * *
//   *               *
//     *           *
//       *       *
//         *   *
//           * 
//         * * *
//       * * * * *
//     * * * * * * *
//   * * * * * * * * *
// * * * * * * * * * * *
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

    int space=0;
    int star=n;
    for(int i=1;i<=n;i++)
    {
       for(int j=1;j<=space;j++)
       {
        System.out.print("  ");
       }
       for(int k=1;k<=star;k++)
       {
        if(i>1 && i<n/2+1 && k>1 && k<star)
        {
            System.out.print("  ");
        }
        else{
            System.out.print("* ");
        }
        
       }
       System.out.println();

if(i<n/2+1)
{
    space++;
    star-=2;
}
else
{
    space--;
    star+=2;
}

    }

    }
}