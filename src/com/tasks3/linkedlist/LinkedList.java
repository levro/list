package com.tasks3.linkedlist;

public class LinkedList {
	public LinkedList() {

	}

	public void add(Integer data) {
		
//		while (Next != null){
			
		}
                //PUT YOUR CODE HERE
                //PUT YOUR CODE HERE
	}

	public Integer get(int index) {
                //PUT YOUR CODE HERE
                //PUT YOUR CODE HERE
		return 1;
	}

	public boolean delete(int index) {
                //PUT YOUR CODE HERE
                //PUT YOUR CODE HERE
		boolean a = true;
		return a;
	}

	public int size() {
		Node tmp = new Node();
		
                //PUT YOUR CODE HERE
                //PUT YOUR CODE HERE
		return 1;
	}
	
	public static void main(String[] args) {
			
		
		Node c = new Node();
		c.setData(63);
		c.setNext(null);

		Node b = new Node();
		b.setData(10);
		b.setNext(c);
		
		Node a = new Node();
		a.setData(1);
		a.setNext(b);
		
		System.out.println(a.getData());	
		System.out.println(a.getNext());
		System.out.println(b.getData());
		System.out.println(b.getNext());
		System.out.println(c.getData());
		System.out.println(c.getNext());
		System.out.println(a.getNext().getData());
	}
}   