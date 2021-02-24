package com.Link.LinkList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
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
    public void addElementsAtLast_Correct(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(30);
    	linkedList.addNodeAtLast(70);
        assertEquals(3, linkedList.getSize());
        assertEquals(56, linkedList.returnFirst());
    }
    
    @Test
    public void addElementsAtLast_InCorrect(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(30);
    	linkedList.addNodeAtLast(70);
        assertEquals(3, linkedList.getSize());
        assertNotEquals(70, linkedList.returnFirst());
    }
}