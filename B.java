class A{
String name;
public A(String s){
name=s;
}
public String getName(){
return name;
}
}
class B extends A implements Runnable{
public B(String s){
super(s);
}
public void run(){
for(int i=0;i<10;i++)
	System.out.println(getName()+" - "+Thread.currentThread().getName());
}
public static void main(String[] args){
B f1=new B("AAA");
Thread t1=new Thread(f1);
f1.start();
B f2=new B("BBB");
Thread t2=new Thread(f2);
t2.start();
}
}