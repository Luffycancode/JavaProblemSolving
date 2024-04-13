package Patterns;

import java.util.*;

public class pattern17 {

//           *
//           * *
//           * * *
//           * * * *
//           * * * * *
// * * * * * * * * * * *
//           * * * * *
//           * * * * 
//           * * *
//           * *
//           *

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
int n=scan.nextInt();

int space=n/2;
int star=1;


// for(int i=1;i<=n;i++)
// {
// for(int j=1;j<=space;j++)
// {
// System.out.print("  ");
// }
// for(int k=1;k<=star;k++)
// {

//     if(i>1 && i<n/2+1 && k<star/2+1 || i<n && i>n/2+1 && k<star/2+1)
//     {
// System.out.print("  ");
//     }
//     else{
// System.out.print("* ");
//     }
// }

// if(i<n/2+1)
// {
//     space--;
//     star+=2;
// }
// else{

//     space++;
//     star-=2;
// }


//     System.out.println();
// }

// Better logic


for(int i=1;i<=n;i++)
{

for(int j=1;j<=space;j++)
{
if(i==n/2+1)
{
    System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
for(int k=1;k<=star;k++)
{
System.out.print("* ");
}
System.out.println();

if(i<n/2+1)
{
    star++;
}
else{
    star--;
}






    }
}
}