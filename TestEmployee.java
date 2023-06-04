class Employee
{
int id;
String name;
float salary;
void insert(int r,String n,float s)
{
id=r;
name=n;
salary=s;
}
void display()
{
System.out.println(id+" "+name+" "+salary);
}
}
class TestEmployee
{
public static void main(String args[])
{
Employee s1=new Employee();
Employee s2=new Employee();
Employee s3=new Employee();
s1.insert(111,"mahesh",24000);
s2.insert(333,"dhoni",34000000);
s3.insert(222,"rohit",34000000);
s1.display();
s2.display();
s3.display();
}
}