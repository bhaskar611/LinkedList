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
	
	public <T> void addNodeAtIndex(T data) {
		Node n = new Node(data);
		Node t = head;
		System.out.println("Enter the index in [0," + (size) +"] at which you want to add element");
		Scanner sc = new Scanner(System.in);
		int val = sc .nextInt();
		sc.nextLine();
		if(val == 0) {
			addNodeAtFirst(data);
			return;
		}
		for(int i=0; i < val-1  && t!=null; i++)
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
	
	
	public <T> void printList() {
		Node t = head;
		System.out.print("HEAD");
		while(t!=null) {
			System.out.print(" -> " + t.data);
			t = t.next;
		}
		System.out.print(" -> null\n");
	}
	
	
	public <T> T returnFirst() {
		if(head == null) {
			System.out.println("No elements present");
			return null;
		}
		return (T)head.data;
	}
}