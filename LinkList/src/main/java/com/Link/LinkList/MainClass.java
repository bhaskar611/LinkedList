package com.Link.LinkList;

public class MainClass 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Linked List problem" );
        LinkedList linkedList = new LinkedList();
        linkedList.addNodeAtLast(56);
        linkedList.addNodeAtLast(70);
        linkedList.addNodeAtIndex(30);
        linkedList.printList();
    }
}