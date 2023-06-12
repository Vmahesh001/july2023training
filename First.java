class First

{
public static void main(String args[])throws Exception
{
Thread t=Thread.currentThread();
System.out.println("current thread="+t);
t.setName("New thread by mahesh");
t.setPriority(t.getPriority()-1);
System.out.println("currentthread="+t);
System.out.println("name="+t.getName());
}
}