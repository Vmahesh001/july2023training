//
import java.util.Scanner;
class Example1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float i=sc.nextFloat();
float j=sc.nextFloat();
if (j==0)
{
System.out.println("division by error");
}
else{

System.out.println(i+" is divided by "+j+" is "+(i/j));
i=i+j;
}
}
}