import java.util.Scanner;
class Input1{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int num1;
num1=sc.nextInt();
System.out.print("Enter a number:");
int num2;
num2=sc.nextInt();
System.out.println("num1="+num1+","+"num2="+num2);
int num3,num4,num5,num6;
num3=num1+num2;
num4=num1-num2;
num5=num1*num2;
num6=num1/num2;
System.out.println("addtion of num1 and num2 is "+num3);
System.out.println("sub of num1 and num2 is "+num4);
System.out.println("multiplaction of num1 and num2 is "+num5);
System.out.println("division of num1 and num2 is "+num6);
}
}
