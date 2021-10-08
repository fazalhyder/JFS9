class runn extends Thread{
	public void run(){
			for(int i=0;i<=10;i++){
		System.out.println("child thread executing");
	}
	}
}
public class rdm {
	public static void main (String [] args ){
	runn r = new runn();
r.start();
for ( int i =0;i<10;i++){
	System.out.println("Main thread executing ");
}
}
}