import java.util.*;
public class Primefactorize {

public static void main(String[] args) {
    
Scanner scan=new Scanner(System.in);

int num=scan.nextInt();


int i=2;
while(num!=1)
{
    if(num%i==0)
    {
        num=num/i;
        System.out.println(i);
    }
    else{
        i++;
    }
}













}
}
