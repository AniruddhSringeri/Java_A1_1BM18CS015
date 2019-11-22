import java.util.*;

class Thread1 implements Runnable {
	Thread t;
	Thread2 ob2;
	Thread1() {
		t = new Thread(this, "1");
		ob2 = new Thread2();
		t.start();
	}
	
	public void run() {
		try {
			ob2.t.join();
		}
		catch(InterruptedException e) {
			System.out.println("Thread 1 error");
		}
		System.out.println("Hello from thread 1");
	}
}
			
class Thread2 implements Runnable {
	Thread t;
	Thread3 ob3;
	Thread2() {
		t = new Thread(this, "2");
		ob3 = new Thread3();
		t.start();
	}
	
	public void run() {
		try {
			ob3.t.join();
		}
		catch(InterruptedException e) {
			System.out.println("Thread 2 error");
		}
		System.out.println("Hello from thread 2");
	}
}
	
class Thread3 implements Runnable {
	Thread t;
	Thread4 ob4;
	Thread3() {
		t = new Thread(this, "3");
		ob4 = new Thread4();
		t.start();
	}
	
	public void run() {
		try {
			ob4.t.join();
		}
		catch(InterruptedException e) {
			System.out.println("Thread 3 error");
		}
		System.out.println("Hello from thread 3");
	}
}

class Thread4 implements Runnable {
	Thread t;
	Thread5 ob5;
	Thread4() {
		t = new Thread(this, "4");
		ob5 = new Thread5();
		t.start();
	}
	
	public void run() {
		try {
			ob5.t.join();
		}
		catch(InterruptedException e) {
			System.out.println("Thread 4 error");
		}
		System.out.println("Hello from thread 4");
	}
}

class Thread5 implements Runnable {
	Thread t;
	Thread5() {
		t = new Thread(this, "5");
		t.start();
	}
	
	public void run() {
		System.out.println("Hello from thread 5");
	}
}
	
class PentaThread {
	public static void main(String args[]) {
		new Thread1();
	}
}		
			
					
