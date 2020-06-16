/**
 * 
 */
package com.abhi.linkedlist;

import com.abhi.nodes.DoubleRefNode;

/**
 * @author abhinav
 *
 */
public class CircularDoubleLinkedList {
	private DoubleRefNode head;
	private DoubleRefNode tail;
	private int index;

	public CircularDoubleLinkedList() {
		this.head = null;
		this.tail = null;
		this.index = -1;
	}

	public void insert(final int value, final int location) {
		DoubleRefNode node = new DoubleRefNode(value);
		if (null != this.head) {
			if (location < 1) {
				node.setNext(this.head);
				node.setPrev(this.tail);
				this.head.setPrev(node);
				this.tail.setNext(node);
				this.head = node;
			} else if (location > this.index) {
				node.setNext(this.head);
				node.setPrev(this.tail);
				this.head.setPrev(node);
				this.tail.setNext(node);
				this.tail = node;
			} else {
				int count = 0;
				DoubleRefNode tempNode = this.head;
				while (count < location - 1) {
					tempNode = tempNode.getNext();
					count++;
				}
				node.setNext(tempNode.getNext());
				node.setPrev(tempNode);
				tempNode.getNext().setPrev(node);
				tempNode.setNext(node);
			}
		} else {
			this.head = node;
			this.tail = node;
			node.setNext(this.head);
			node.setPrev(this.tail);
		}
		this.index++;
	}

	public void delete(final int location) {
		if (null != this.head) {
			if (this.head == this.tail) {
				this.head.setNext(null);
				this.head.setPrev(null);
				this.head = this.tail = null;
			} else if (location < 1) {
				this.head = this.head.getNext();
				this.head.setPrev(this.tail);
				this.tail.setNext(this.head);
			} else if (location >= this.index) {
				this.tail = this.tail.getPrev();
				this.tail.setNext(this.head);
				this.head.setPrev(this.tail);
			} else {
				DoubleRefNode tempNode = this.head;
				int count = 0;
				while (count < location - 1) {
					tempNode = tempNode.getNext();
					count++;
				}
				tempNode.setNext(tempNode.getNext().getNext());
				tempNode.getNext().setPrev(tempNode);
			}
			this.index--;
		} else {
			System.out.println("The list is empty!!");
		}
	}

	public void deleteAll() {
		if (null != this.head) {			
			this.head.setPrev(null);
			while (this.head != this.tail) {
				this.head = this.head.getNext();
				this.head.setPrev(null);
			}
			this.tail.setNext(null);
			this.head = this.tail = null;
			this.index = -1;
		} else {
			System.out.println("The list is empty!!");
		}
	}
	
	public void traverse() {
		if(null != this.head) {
			DoubleRefNode tempNode = this.head;
			int count = 0;
			do {
				System.out.println("The value of Node-"+count++ +":: "+tempNode.getValue());
				tempNode = tempNode.getNext();
			}while(tempNode != this.head);			
		}else {
			System.out.println("List is empty!!");
		}
	}
	
	public void reverse() {
		if(null != this.tail) {
			DoubleRefNode tempNode = this.tail;
			int count = this.index;
			do {
				System.out.println("The value of Node-"+count-- +":: "+tempNode.getValue());
				tempNode = tempNode.getPrev();
			}while(tempNode != this.tail);			
		}else {
			System.out.println("List is empty!!");
		}		
	}

}
