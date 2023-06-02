import java.util.Scanner;
class Input3{
public static double div(Double a,Double b)
{
Double e=a/b;
return e;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
Double num1;
num1=sc.nextDouble();
System.out.print("Enter a number:");
Double num2;
num2=sc.nextDouble();
System.out.println("num1="+num1+","+"num2="+num2);
System.out.println(num1+"/"+num2+"="+div(num1,num2));
}
}