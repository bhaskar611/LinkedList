package com.Link.LinkList;

public class MainClass 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Linked List Problem" );
        LinkedList linkedList = new LinkedList();
        linkedList.addNodeAtFirst(70);
        linkedList.addNodeAtFirst(30);
        linkedList.addNodeAtFirst(56);
        linkedList.printList();
    }
}