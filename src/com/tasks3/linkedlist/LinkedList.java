package com.tasks3.linkedlist;

public class LinkedList {
	private Node first;
	private Node last;
	private int size = 0;
	
	public LinkedList() {		
	}
	
	public LinkedList(int data) {
		Node node = new Node();
		first = node;
		last = node;
		first.setData(data);
		size++;
	}

	public void add(Integer data) {
		Node node = new Node();
		node.setData(data);
		if (this.size == 0){			
			first = node;
			last = node;			
		}
		else{
			last.setNext(node);
			last = node;
		}	
		this.size++;
	}

	public Integer get(int index) {
		if (index >= size || index < 0 || size == 0){
			return null;
		}
		else{
			Node tmp = first;
			for (int i = 0; i <= index-1; i++){
				tmp = tmp.getNext();
			}
			return tmp.getData();			
		}
	}

	public boolean delete(int index) {
		if (index >= size || index < 0 || size == 0){
			return false;
		}
		else if (index == 0){
			first = first.getNext();
			size--;
			return true;
		}			
		else if (index == size -1){
			Node tmp = first;
			for (int i = 0; i < index-1; i++){
				tmp = tmp.getNext();
			}
			tmp.setNext(null);
			last = tmp;
			size--;
			return true;
		}
		else {
			Node tmp = first;
			for (int i = 0; i < index-1; i++){
				tmp = tmp.getNext();
			}
			tmp.setNext(tmp.getNext().getNext());
			size--;
			return true;			
		}
	}

	public int size() {
		return size;
	}
	
	public void prn() {
		if (size > 0){
			Node tmp = first;
			
			for (int i = 0; i < size; i++){
			System.out.print(tmp.getData() + "; ");
			tmp = tmp.getNext();			
			}			
			System.out.println("First - " + first.getData() + ", last " + last.getData() + ", size - " + size + ".");
		}
		else System.out.println("List is empty");
	}
	
	public static void main(String[] args) {
		
		LinkedList lst = new LinkedList();
		//LinkedList lst = new LinkedList(1001);

		System.out.println("size - " + lst.size);
		System.out.println("first - " + lst.first);
		System.out.println("last - " + lst.last);
		System.out.println("----------1----------");
		lst.add(1000);
		lst.add(1001);
		
		lst.add(1002);
		System.out.println("size - " + lst.size);
		System.out.println("first - " + lst.first);
		System.out.println("last - " + lst.last);
		System.out.println("firstData - " + lst.first.getData());
		System.out.println("firstNext - " + lst.first.getNext());
		
		System.out.println("----------2----------");

		lst.add(1003);
		lst.add(1004);
		
		System.out.println("size - " + lst.size);
		System.out.println("first - " + lst.first);
		System.out.println("last - " + lst.last);
		System.out.println("secondData - " + lst.first.getNext().getData());
		System.out.println("thirdData - " + lst.first.getNext().getNext().getData());
		System.out.println("fourthData - " + lst.first.getNext().getNext().getNext().getData());
		lst.add(1005);
		lst.add(1006);
		lst.add(1007);
		lst.add(1008);
		lst.prn();
		//System.out.println(lst.get(8));
		lst.delete(8);
		lst.delete(0);
		lst.delete(3);
		lst.delete(0);
		lst.delete(0);
		lst.delete(0);
		lst.delete(0);
		lst.delete(0);
		lst.delete(0);
		lst.add(999);
		lst.prn();
		//System.out.println(lst.first.getNext().getNext());
				
		
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