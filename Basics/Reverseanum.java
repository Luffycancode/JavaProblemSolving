import java.util.*;
public class Reverseanum {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();




while(n!=0)
{
int temp=n%10;
n=n/10;
System.out.println(temp);
}

}
}
