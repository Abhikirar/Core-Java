package Com.rays.thread;

public class TestRunable {
public static void main(String[] args) {

	 Thread t1 = new Thread(new HelloRunable("Abhi"));
	 Thread t2 = new Thread(new HelloRunable("ravi"));
	 Thread t3 = new Thread(new HelloRunable("nitin"));
	 
	 t1.start();
     t2.start(); 
     t3.start();
}
}
