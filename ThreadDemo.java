class ChildThread extends Thread{
public void run() {
System.out.println("child thread");
}
}
public class ThreadDemo {
public static void main(String[] args) {
System.out.println("the current name of thread is: "+Thread.currentThread().getName());
ChildThread t1 = new ChildThread();
t1.start();
System.out.println("the current name of thread is: "+t1.getName());
t1.setName("T_1");
System.out.println("the current name of thread is: "+t1.getName());

ChildThread t2 = new ChildThread();
t2.start();
System.out.println("the current name of thread is: "+t2.getName());
t2.setName("T_2");
System.out.println("the current name of thread is: "+t2.getName());
}
}