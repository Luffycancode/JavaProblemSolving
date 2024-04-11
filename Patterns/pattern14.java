package Patterns;

import java.util.*;

public class pattern14 {

// 2 * 1 = 2
// 2 * 2 = 4
// 2 * 3 = 6
// 2 * 4 = 8
// 2 * 5 = 10
// 2 * 6 = 12
// 2 * 7 = 14
// 2 * 8 = 16
// 2 * 9 = 18
// 2 * 10 = 20

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        // int star = n/2+1;
for(int i=1;i<=10;i++)
{
    System.out.print(n + " * " + i + " = "+ n*i );
    System.out.println();
}

    }
}