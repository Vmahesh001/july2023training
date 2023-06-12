class Person
{
int id;
String name;
void person(int id,String name)
{
this.id=id;
this.name=name;
}
}
class Emp extends Person
{
float salary;
Emp(int id,String name,float salary)
{
super (id,name);
this.salary=salary;
}
void display()
{
System.out.println(id+" "+name+" "+salary);
}
class Name
{
public static void main(String args[])
{
Emp e=new Emp(111,"mahesh",20000);
e.display();
}
}
}
