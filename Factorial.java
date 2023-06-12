class Factorial
{
public static long factorial(long n)
{
if (n==0)
{
return 1;
}
else
{
return n*factorial(n-1);
}
}
public static void main(String args[])
{
long m=3;
System.out.println("factorial is:"+factorial(m));
}
}
