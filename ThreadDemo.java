/*Write a program which creates two threads, one thread displaying “BMS College of
Engineering” once every ten seconds and another displaying “CSE” once every two
seconds.*/

import java.util.*;

class A implements Runnable {
	Thread t;
	public A() {
		t = new Thread(this, "T1");
		t.start();
	}

	public void run() {
		while(true) {
			System.out.println("BMS College of Engineering");
			try {
				Thread.sleep(10000);
			}
			catch(InterruptedException e) {
				System.out.println("BMS thread interrupted");
			}
		}
	}
}

class B implements Runnable {
	Thread t;
	public B() {
		t = new Thread(this, "T2");
		t.start();
	}
	
	public void run() {
		while(true) {
			System.out.println("CSE");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println("CSE thread interrupted");
			}
		}
	}
}

class ThreadDemo {
	public static void main(String args[]) {
		new A();
		new B();
	}
}
