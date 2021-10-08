class SampleThread extends Thread{
public void run() {
System.out.println("Thread Started");
for(int i=1; i <= 10; i++) {
System.out.println("hello !");
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
System.out.println("Thread Ended");
}
}
public class SleepMethodDemo {
public static void main(String[] args) {
SampleThread t = new SampleThread();
t.start();
}
}