package com.tasks3.linkedlist;

public class MainList {

	public static void main(String[] args) {
		LinkedList l = new LinkedList ();
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
		LinkedList l2 = new LinkedList ();
		
		l2.add(2225);
		System.out.println(l2.size());
		l2.prlist();
		l.prlist();
		
		
	}

}
