class Scope
{
public static void main(String args[])
{
int i=100,j;
System.out.println("value of i here is:"+i);
{
j=55;
i=i*j;
System.out.println(i);
System.out.println(j);
}
System.out.println(j);
}
}
