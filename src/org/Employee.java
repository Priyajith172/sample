package org;

public class Employee implements Runnable{
	
	public void run() {
		
		System.out.println("Employee has entered the company");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Employee has left the company");
	}

}
