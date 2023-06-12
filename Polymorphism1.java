import java.util.Scanner;
class Polymorphism1
{
void print()
{
System.out.println("welcome");
}
void print(String n)
{
System.out.println("welcome "+n);
}
}
class Java
{
public static void main(String args[])
{
Polymorphism1 p=new Polymorphism1();
p.print();
Scanner sc=new Scanner(System.in);
System.out.println("enter ur name:");
String s=sc.nextLine();
p.print(s);
}
}

