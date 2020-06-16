/**
 * 
 */
package com.abhi.linkedlist;

import com.abhi.nodes.DoubleRefNode;

/**
 * @author abhinav
 *
 */
public class DoubleLinkedList {

	private DoubleRefNode head;
	private DoubleRefNode tail;
	private int index;
	
	public DoubleLinkedList() {
		this.head = null;
		this.tail = null;
		this.index = -1;
	}
	
	public void insert(final int value, final int location) {
		DoubleRefNode node = new DoubleRefNode(value);
		if(null!= this.head) {
			if(location < 1) {
				node.setNext(this.head);
				this.head.setPrev(node);
				this.head = node;
			}else if(location > this.index) {
				node.setPrev(this.tail);
				this.tail.setNext(node);
				this.tail = node;
			}else {
				DoubleRefNode tempNode = this.head;
				int count = 0;
				while(count < location-1) {
					tempNode = tempNode.getNext();
					count++;
				}
				node.setNext(tempNode.getNext());
				node.setPrev(tempNode);
				tempNode.getNext().setPrev(node);
				tempNode.setNext(node);
			}			
		}else {
			this.head = node;
			this.tail = node;
		}
		this.index++;
	}
	
	public void traverse() {
		if(null != this.head) {
			DoubleRefNode tempNode = this.head;
			int count = 0;
			while(tempNode != null) {
				System.out.println("The value of Node-"+count++ +":: "+tempNode.getValue());
				tempNode = tempNode.getNext();
			}			
		}else {
			System.out.println("List is empty!!");
		}
	}
	
	public void reverse() {
		if(null != this.tail) {
			DoubleRefNode tempNode = this.tail;
			int count = this.index;
			while(tempNode != null) {
				System.out.println("The value of Node-"+count-- +":: "+tempNode.getValue());
				tempNode = tempNode.getPrev();
			}			
		}else {
			System.out.println("List is empty!!");
		}		
	}
	
	public void delete(final int location) {
		if(null != this.head) {
			if(this.head == this.tail) {
				this.head = this.tail = null;
			}else if(location < 1) {
				this.head = this.head.getNext();
				this.head.setPrev(null);
			}else if(location >= this.index) {
				this.tail = this.tail.getPrev();
				this.tail.setNext(null);
			}else {
				DoubleRefNode tempNode = this.head;
				int count = 0;
				while(count < location-1) {
					tempNode = tempNode.getNext();
					count++;
				}
				tempNode.setNext(tempNode.getNext().getNext());				
				tempNode.getNext().setPrev(tempNode);
			}
		this.index--;
		}else {
			System.out.println("List is empty!!");
		}
	}
	
	public void deleteAll() {
		if(null != this.head) {
			while(this.head != this.tail) {
				this.head = this.head.getNext();
				this.head.setPrev(null);
			}
			this.head = this.tail = null;
			this.index = -1;
		}else {
			System.out.println("List is empty!!");
		}

	}
}
