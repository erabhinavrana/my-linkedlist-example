/**
 * 
 */
package com.abhi;

import com.abhi.linkedlist.CircularDoubleLinkedList;
import com.abhi.linkedlist.CircularSingleLinkedList;
import com.abhi.linkedlist.DoubleLinkedList;
import com.abhi.linkedlist.SingleLinkedList;
import com.abhi.nodes.Node;

/**
 * @author abhinav
 *
 */
public class LinkedListMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		performSingleLinkedListOperations();
//		performCicularSingleLinkedListOperations();
//		performDoubleLinkedListOperation();
		performCircularDoubleLinkedListOperation();
	}

	private static void performSingleLinkedListOperations() {
		System.out.println("Perform Single Linked List operations....");
		Node node = new Node(25);
		SingleLinkedList linkedList = new SingleLinkedList(node);
		linkedList.delete(-1);
		linkedList.insertion(new Node(10), 0);

		linkedList = new SingleLinkedList(node);	
		linkedList.insertion(new Node(10), 0);
		linkedList.insertion(new Node(15), 1);
		linkedList.insertion(new Node(20), 2);
		linkedList.insertion(new Node(30), 4);
		linkedList.insertion(new Node(05), 0);
		linkedList.traverse();	
		
		linkedList.delete(4);		
		linkedList.traverse();	

		linkedList.delete(0);
		linkedList.traverse();
	}

	private static void performCicularSingleLinkedListOperations() {
		System.out.println("Perform Circular Single Linked List operations....");
		Node node = new Node(25);
		CircularSingleLinkedList linkedList = new CircularSingleLinkedList(node);
		linkedList.delete(-1);
		linkedList.insertion(new Node(10), 0);

		linkedList = new CircularSingleLinkedList(node);	
		linkedList.insertion(new Node(10), 0);
		linkedList.insertion(new Node(15), 1);
		linkedList.insertion(new Node(20), 2);
		linkedList.insertion(new Node(30), 4);
		linkedList.insertion(new Node(05), 0);
		linkedList.traverse();	
		
		linkedList.delete(4);		
		linkedList.traverse();	

		linkedList.delete(0);
		linkedList.traverse();
	}
	
	
	private static void performDoubleLinkedListOperation() {
		System.out.println("Perform Double Linked List operations....");

		DoubleLinkedList list = new DoubleLinkedList();
		list.insert(25, 2);
		list.traverse();
		System.out.println("\n");
		list.insert(15, 1);
		list.traverse();
		System.out.println("\n");
		list.insert(5, 0);
		list.traverse();
		System.out.println("\n");
		list.insert(35, 3);
		list.traverse();
		System.out.println("\n");
		list.insert(30, 3);		
		list.traverse();
		System.out.println("\n");

		//list.reverse();
		
		list.delete(2);
		list.traverse();
		System.out.println("\n");
		list.delete(-1);
		list.traverse();
		System.out.println("\n");
		list.delete(3);
		list.traverse();
		System.out.println("\n");
		list.delete(0);
		list.traverse();
		System.out.println("\n");

		list.delete(3);
		list.traverse();
		System.out.println("\n");
		
	}

	private static void performCircularDoubleLinkedListOperation() {
		System.out.println("Perform Circular Double Linked List operations....");

		CircularDoubleLinkedList list = new CircularDoubleLinkedList();
		list.insert(25, 2);
		list.traverse();
		System.out.println("\n");
		list.insert(15, 1);
		list.traverse();
		System.out.println("\n");
		list.insert(5, 0);
		list.traverse();
		System.out.println("\n");
		list.insert(35, 3);
		list.traverse();
		System.out.println("\n");
		list.insert(30, 3);		
		list.traverse();
		System.out.println("\n");

		//list.reverse();
		
		list.delete(2);
		list.traverse();
		System.out.println("\n");
		list.delete(-1);
		list.traverse();
		System.out.println("\n");
		list.delete(3);
		list.traverse();
		System.out.println("\n");
		list.delete(0);
		list.traverse();
		System.out.println("\n");

		list.delete(3);
		list.traverse();
		System.out.println("\n");
		
	}

}
