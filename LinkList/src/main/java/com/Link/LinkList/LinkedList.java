package com.Link.LinkList;


import java.util.Scanner;


public class LinkedList{
	private int size;
	private Node head;
	
	public LinkedList() {
		size = 0;
		head = null;
	}
	
	public int getSize() {
		return size;
	}

	
	public void setSize(int size) {
		this.size = size;
	}

	
	
	public Node getHead() {
		return head;
	}

	
	public void setHead(Node head) {
		this.head = head;
	}

	
	static class Node<T>{
		private T data;
		private Node next;
		
		
		public T getData() {
			return data;
		}

		
		public void setData(T data) {
			this.data = data;
		}

		
		public Node getNext() {
			return next;
		}

		
		public void setNext(Node next) {
			this.next = next;
		}

		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	
// add node at first	
	public <T> void addNodeAtFirst(T data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
		size++;
	}
	
	
	public <T> void addNodeAtLast(T data) {
		Node n = new Node(data);
		Node t = head;
		if(t == null){
			head = n;
		}
		else {
			while (t.next != null)
				t = t.next;
			t.next = n;
		}
		size++;
	}
// add node at index	
	public <T> void addNodeAtIndex(T data,int index) {
		Node n = new Node(data);
		Node t = head;
		if(index == 0) {
			addNodeAtFirst(data);
			return;
		}
		for(int i=0; i < index-1  && t!=null; i++)
			t = t.next;
		if(t == null)
		{
			System.out.println("the list is not that long, value within the specified range not given");
			return;
		}
		n.next = t.next;
		t.next = n;
		size++;
	}
	

	//  prints the linked list
	 
	public <T> void printList() {
		Node t = head;
		System.out.println("The list is as follows");
		System.out.print("HEAD");
		while(t!=null) {
			System.out.print(" -> " + t.data);
			t = t.next;
		}
		System.out.print(" -> null\n");
	}
	

	//returns the first element of the linked list
	
	public <T> T returnFirst() {
		if(head == null) {
			System.out.println("No elements present");
			return null;
		}
		return (T)head.data;
	}
	
	// deletes the first nodeof the list
	
	public <T> void pop() {
		if(head==null) {
			System.out.println("The list is empty, no elements to remove");
		}
		else {
			head = head.next;
			size--;
		}
	}
	
	public <T> void popLast() {
		if(head==null) {
			System.out.println("The list is empty, no elements to remove");
		}
		else if(size == 1) {
			head = null;
			size--;
		}
		else {
			Node t = head, prev = null;
			while(t.next != null) {
				prev = t;
				t = t.next;
			}
			prev.next = null;
			size--;
		}
	}
}