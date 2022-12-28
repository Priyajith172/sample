package org;

public class Demo extends Thread{
	
	public void run() {
		
		for(int i=1; i<=5; i++) {
			System.out.println("i= "+i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
