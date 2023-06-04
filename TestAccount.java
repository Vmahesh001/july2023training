class Account
{
int acc_no;
String name;
float amount;
void insert(int a,String n,float amt)
{
acc_no=a;
name=n;
amount=amt;
}
void deposit(float amt)
{
amount=amount+amt;
System.out.println(amt+"deposited");
}
void withdraw(float amt)
{
if (amount<amt)
{
System.out.println("insufficient balance");
}
else
{
amount=amount-amt;
System.out.println(amt+"withdraw");
}
}
void checkBalance()
{
System.out.println("balance is:"+amount);
}
void display()
{
System.out.println(acc_no+" "+name+" "+amount);
} 
}

class TestAccount
{
public static void main(String args[])
{
Account s1=new Account();
s1.insert(123456,"mahesh",10000);
s1.display();
s1.checkBalance();
s1.deposit(3000);
s1.checkBalance();
s1.withdraw(3000);
s1.checkBalance();
}
}
