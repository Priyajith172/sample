package org;

public class TestDriver {
	public static void main(String[] args) {
		
		Student s = new Student();
		
		Thread t = new Thread(s);
		
		t.start();
		
		Employee e = new Employee();
		
		Thread t1 = new Thread(e);
		
		t1.start();
	}

}
