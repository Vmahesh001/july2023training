class Animal
{
public void move()
{
System.out.println("animal");
}
}class Dog extends Animal
{
public void move()
{
System.out.println("dog");
}
}
class Pet extends Animal
{
public void move()
{
System.out.println("pet");
}
}
class TestIt
{
public static void main(String args[])
{
Animal a1=new Animal();
Animal a2=new Dog();
Animal a3=new Pet();
a1.move();
a2.move();
a3.move();
}
}