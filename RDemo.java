class MR implements Runnable {
	
	public void run(){
	for(int i=0;i<=10;i++){
		System.out.println("child thread executing");
	}
	}
	
}
public class RDemo{
public static void main (String [] args)
{MR r = new MR();
Thread t = new Thread(r);
t.start();
for ( int i =0;i<10;i++){
	System.out.println("Main thread executing ");
}
}
}
