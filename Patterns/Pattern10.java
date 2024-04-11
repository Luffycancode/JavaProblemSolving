package Patterns;

import java.util.*;

public class Pattern10 {
//       *
//     *   *
//   *       *
// *           *
//   *       *
//     *   *
//       *
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        // int star = n/2+1;

int space=n/2;
int space2=-1;
int star=1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }

            for(int k=1;k<=star;k++)
            {
                System.out.print("* ");
            }

            for (int l = 1; l <= space2; l++) {
                System.out.print("  ");
            }

            if(i>1 && i<n )
            {
                System.out.print("* ");
            }
            System.out.println();
if(i>n/2)
{
    space++;
}
else{
    space--;
}

if(i<=n/2)
{
space2+=2;
}
else{
space2-=2;
}



        }
    }
}