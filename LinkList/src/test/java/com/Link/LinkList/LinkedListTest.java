package com.Link.LinkList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class LinkedListTest 
{
	LinkedList linkedList; 
    
	
	@Before
	public void init() {
		linkedList = new LinkedList();
	}
	
	
    @Test
    public void addElementsAtFirst(){
    	linkedList.addNodeAtFirst(70);
    	linkedList.addNodeAtFirst(30);
    	linkedList.addNodeAtFirst(56);
        assertEquals(3, linkedList.size);
        assertEquals(56, linkedList.returnFirst());
    }
}