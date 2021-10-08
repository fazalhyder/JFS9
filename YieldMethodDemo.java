class mythread extends Thread{
public void run() {
for(int i=1; i <= 5; i++) {
Thread.yield();
System.out.println("0- Thread");
}
}
}
public class YieldMethodDemo {
public static void main(String[] args) {
mythread t = new mythread();
t.start();
for(int i=1; i <= 5; i++) {
System.out.println("Main Thread");
}
}
}