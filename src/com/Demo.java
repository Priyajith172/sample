package com;

public class Demo {
	public static void main(String[] args) {
		
		Thread t = new Thread();
		
		//getId() is used to return the ID of a thread
		System.out.println(t.getId());
		
		
		//getName() is used to return the name of a thread
		System.out.println(t.getName());
		
		//getpriority() is used to return the priority of a thread
		System.out.println(t.getPriority());
		
		System.out.println("--------------");
		
		//
		t.setName("Dinga");
		
		//
		t.setPriority(8);
		
		System.out.println("Thread ID: " +t.getId());
		System.out.println("Thread Name: "+t.getName());
		System.out.println("Thread Priority: "+t.getPriority());
	}

}
