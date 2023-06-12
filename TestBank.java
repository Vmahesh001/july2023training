abstract class Bank
{
abstract int getRateofInterest();
}
class SBI extends Bank
{
int getRateofInterest()
{
return 7;
}
}
class PNB extends Bank
{
int getRateofInterest()
{
return 8;
}
}
class TestBank
{
public static void main(String args[])
{
Bank b;
b=new SBI();
System.out.println("rate of interest is:"+b.getRateofInterest()+"%");
b=new PNB();
System.out.println("rate of interest is:"+b.getRateofInterest()+"%");
}
}
