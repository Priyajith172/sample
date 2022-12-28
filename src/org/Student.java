package org;

public class Student implements Runnable{
	
	public void run() {
		
		System.out.println("Student has entered the class");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Student has left the class");
	}
	

}
