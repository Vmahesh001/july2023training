class Author
{
String authorName;
int age;
String place;
Author(String name,int age,String place)
{
this.authorName=name;
this.age=age;
this.place=place;
}
}
class Book
{
String name;
int price;
Author auther;
Book(String n,int p,Author auther)
{
this.name=n;
this.price=p;
this.auther=auther;
}
public static void main(String args[]){

Author auther=new Author("john",42,"usa");
Book b=new Book("java for begginer",800,auther);
System.out.println("Book name:"+b.name);
System.out.println("Book price:"+b.price);
System.out.println("__________Auther Details__________");
System.out.println("Auther name:"+b.auther.authorName);
System.out.println("Auther age:"+b.auther.age);
System.out.println("Auther place:"+b.auther.place);
}
}

