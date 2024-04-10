
import java.util.*;
public class pytriplet {

public static void main(String[] args) {
Scanner scan=new Scanner(System.in);

int a=scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();


if(a*a + b*b== c*c || b*b + c*c== a*a || a*a + c*c== b*b)
{
System.out.println("Yes a pythagoras Triplet ");
}
else{
    System.out.println("false");
}





}


}
