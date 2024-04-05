import java.util.*;
public class Prime {
public static void main(String[] args) {


Scanner scan=new Scanner(System.in);

// Brute force method i applied here. Not the most effective way to solve this.As this exceeds the time limit
// int t=scan.nextInt();
// for(int i=1;i<=t;i++)
// {
//     int a = 1;
// int num=scan.nextInt();
// for(int j=2;j<num;j++)
// {
// if(num%j==0)
// {
// a=0;
// break;
// }
// }
// if(a==1)
// {
// System.out.println("Number is prime");
// }
// else
// {
//     System.out.println("Number is Not prime");
// }

// }





// More effective way to solve this logic. No number can divide it if its greater than its factorial. 

int a= scan.nextInt();
for(int i=1;i<=a;i++)
{
int count=0;
int b=scan.nextInt();
for(int j=2;j*j<=b;j++)
{
if(b%j==0)
{
count++;
break;
}
}

if(count==1)
{
System.out.println("Number is not prime");
}
else
{
    System.out.println("Number is prime");
}

}


}
}
