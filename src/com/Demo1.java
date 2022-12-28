package com;

public class Demo1 {
	public static void main(String[] args) {
		
		Thread t = new Thread();
		
		System.out.println("Thread ID: " +t.getId());
		System.out.println("Thread Name: "+t.getName());
		System.out.println("Thread Priority: "+t.getPriority());
		
		System.out.println("-------------------------");
		
		t.setName("Dingi thread");
		t.setPriority(9);
		
		System.out.println("Thread ID: " +t.getId());
		System.out.println("Thread Name: "+t.getName());
		System.out.println("Thread Priority: "+t.getPriority());
		
		System.out.println("-------------------------");
		
		Thread t1 = new Thread("Dinga Thread");
		t1.setPriority(3);
		
		System.out.println("Thread ID: " +t1.getId());
		System.out.println("Thread Name: "+t1.getName());
		System.out.println("Thread Priority: "+t1.getPriority());
		
		
		

	
	}

}
