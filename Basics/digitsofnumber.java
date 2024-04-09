import java.util.*;
public class digitsofnumber
{
    public static void main(String[] args) {
    
Scanner scan=new Scanner(System.in);


int num=scan.nextInt();

int temp=num;
int count=0;
int temp2=num;
while(temp!=0)
{
temp=temp/10;
count++;
}
int div =(int)Math.pow(10, count - 1);
while(count!=0)
{

Revise count number of digits and numbers in digits

temp2=temp2/div;
System.out.println(temp);
temp2=num%10;
div=div/10;
count--;
}

    }
}