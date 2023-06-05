class For
{
public static void main(String args[])
{
int i,j=1;
for(i=1;i<=100000;i++)
{
System.out.print(i);
if (j<=99999)
{
System.out.print(",");
}
j++;
}
}
}