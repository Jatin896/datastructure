package com.test;

public class LinkedListTest {
	static Node head;
	public static void main(String args[]) {
		Node first = new Node();
		first.setData(1);
		Node second = new Node();
		first.setNext(second);
		second.setData(2);
		Node third = new Node();
		second.setNext(third);
		third.setData(3);
		Node fourth = new Node();
		Node fifth = new Node();
		fourth.setNext(fifth);
		fourth.setData(4);
		fifth.setData(5);
		fifth.setNext(null);
		head = first;
		Node temp = head;
	    Node reverseList= reverseLinkedList(temp);
	    System.out.println(reverseList.getData());
	    
	   
	}
	private static Node reverseLinkedList(Node temp) {
		// TODO Auto-generated method stub
		if(null == temp)
		 return null;
		if(null == temp.getNext())
			return temp;
		else {
			Node tempNode = reverseLinkedList(temp.getNext());
			if(head == tempNode) {
				tempNode.setNext(null);
				return tempNode;
			}
			else {
				tempNode.setNext(temp);
				return temp;
			}
		}
	}

}
