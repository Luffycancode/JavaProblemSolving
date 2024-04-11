package Patterns;

import java.util.*;

public class pattern12 {

// 0
// 1 1
// 2 3 5
// 8 13 21 34
// 55 89 144 233 377

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        // int star = n/2+1;
int a=0;
int b=1;
int total=0;
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(a+ " ");
        total = a + b;
        a = b;
        b = total;
    }
    System.out.println();
}

    }
}