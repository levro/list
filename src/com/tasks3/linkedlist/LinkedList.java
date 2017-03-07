package com.tasks3.linkedlist;

public class LinkedList {
	private Node first;
//	private Node last;
	private int size = 0;
	
	public LinkedList(int data) {
		this.first = new Node();
		this.first.setData(data);
		this.size++;
	}

	public void add(Integer data) {
		Node node = new Node();
		this.size++;
		if (this.size == 0){
			node = new Node();
			node.setNext(node);
			node.setData(data);
		}
		else{
			while (node.getNext() != null)
				node = node.getNext();
			node.setNext(new Node());
			node.getNext().setData(data);
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
		return true;
	}

	public int size() {
		
                //PUT YOUR CODE HERE
                //PUT YOUR CODE HERE
		return 1;
	}
	
	public static void main(String[] args) {
			
		LinkedList lst = new LinkedList(30);
		System.out.println(lst.size);
		System.out.println(lst.first);
		System.out.println(lst.first.getData());
		System.out.println(lst.first.getNext());
		
		lst.add(100);
		
		System.out.println(lst.size);
		System.out.println(lst.first);
		System.out.println(lst.first.getData());
		System.out.println(lst.first.getNext());
		
		
		/*
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
		System.out.println(a.getNext().getData());*/
	}
}   