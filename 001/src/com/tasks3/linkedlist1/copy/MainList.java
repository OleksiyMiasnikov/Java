package com.tasks3.linkedlist1.copy;

public class MainList {

	public static void main(String[] args) {
		LinkedList1 l = new LinkedList1 ();
		Integer d = 1;
		
		l.add(d);
		d = 5;
		l.add(d);
		l.add(32);
		
		System.out.println(l.size());
		l.prlist();
		
		if (!l.delete(3)) System.out.println("Out of list!");
		
		System.out.println(l.size());
		l.prlist();
		
		l.add(345);
		l.add(-345);
		
		System.out.println(l.size());
		l.prlist();
		
		if (!l.delete(4)) System.out.println("Out of list!");
		
		System.out.println(l.size());
		l.prlist();
		LinkedList1 l2 = new LinkedList1 ();
		
		l2.add(2225);
		System.out.println(l2.size());
		l2.prlist();
		l.prlist();
		
		
	}

}
