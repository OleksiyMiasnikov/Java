package com.tasks3.linkedlist;

public class LinkedList {
	
	//PUT YOUR CODE HERE
	private Node first;
	private int length;
	//PUT YOUR CODE HERE	
		
	public LinkedList() {
		//PUT YOUR CODE HERE
		
		first = null;
		length = 0;
		
		//PUT YOUR CODE HERE
	}

	public void add(Integer data) {
        //PUT YOUR CODE HERE
		
		Node newNode = new Node ();
		newNode.setData(data);
		Node curNode = first;
		
		if (curNode == null) {
			first = newNode;
			
		} else {			
			while (curNode.getNext() != null) {
				curNode = curNode.getNext();			
			}
			curNode.setNext(newNode);
		}
		length ++;
		
		//PUT YOUR CODE HERE
	}

	public Integer get(int index) {
        //PUT YOUR CODE HERE
                       
        int  n;
        Node curNode = first;
        
        if (index < 0 || index >= length || first == null) {
        	return null;
        }
        
        for (n = 0; n < index; n ++) {
        	curNode = curNode.getNext();
        }
		return curNode.getData();
		
		//PUT YOUR CODE HERE
	}

	public boolean delete(int index) {
        //PUT YOUR CODE HERE
		int  n;
		Node b, pb;
        
		if (index < 0 || index >= length) {
	        return false;
	    }
		
        if (index == 0) {
        	first = first.getNext();
        } else {
        		pb = first;
        		b = pb.getNext();
        		for (n = 1; (n < index && b.getNext()!=null ); n ++) {
        			pb = b;
        			b = b.getNext();
        		}
        		if (b.getNext()==null || index < 0) return false;
        		pb.setNext(b.getNext());
        }	
        length --;
        return true;
		
        //PUT YOUR CODE HERE
	}

	public int size() {
        //PUT YOUR CODE HERE
				
        return length;
		
        //PUT YOUR CODE HERE
	}
	
	public void prlist() {
		int f = 0;
		Node b = first;
		while (b.getNext() != null) {
			System.out.println(f + ": " + b.getData());
			b = b.getNext();
			f++;
		}
	}
			
}
