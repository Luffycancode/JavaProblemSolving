import java.util.*;
public class digitsofnumber
{
    public static void main(String[] args) {
    
Scanner scan=new Scanner(System.in);


int num=scan.nextInt();

int temp=num;
int count=0;
while(temp!=0)
{
    temp=temp/10;
    count++;
}


int div=(int)Math.pow(10, count-1);

while(num!=0)
{
    int op=num/div;
    num=num%div;
    System.out.println(op);
    div=div/10;
}


    }
}