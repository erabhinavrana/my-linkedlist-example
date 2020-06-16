/**
 * 
 */
package com.abhi.linkedlist;

import com.abhi.nodes.Node;

/**
 * @author abhinav
 *
 */
public class SingleLinkedList {
	private Node head;
	private Node tail;
	private int index;

	/**
	 * 
	 */
	public SingleLinkedList(final Node node) {
		super();
		this.head = node;
		this.tail = node;
		this.index = 0;
	}

	/**
	 * @return the head
	 */
	public Node getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(Node head) {
		this.head = head;
	}

	/**
	 * @return the tail
	 */
	public Node getTail() {
		return tail;
	}

	/**
	 * @param tail the tail to set
	 */
	public void setTail(Node tail) {
		this.tail = tail;
	}

	public void insertion(final Node node, int location) {
		if (null != this.head || null != this.tail) {
			if (null != node) {
				if (location < 1) {
					node.setNext(this.head);
					this.head = node;
				} else if (location > index) {
					this.tail.setNext(node);
					this.tail = node;
				} else {
					Node tempNode = this.head;
					int count = 0;
					while (count < location - 1) {
						tempNode = tempNode.getNext();
						count++;
					}
					node.setNext(tempNode.getNext());
					tempNode.setNext(node);
				}
				this.index++;
			} else {
				System.out.println("Error while inserting the null node!! \n");
			}
		} else {
			System.out.println("Error while inserting the node :: List doesn't exist!! \n");
		}
	}

	public void traverse() {
		if (null != head) {
			Node tempNode = this.head;
			int count = 0;
			while (tempNode != null) {
				System.out.println("The value of Node" + count++ + " = " + tempNode.getValue());
				tempNode = tempNode.getNext();
			}
			System.out.println("");
		} else {
			System.out.println("Error while traversing :: List doesn't exist!! \n");
		}
	}

	public void delete(final int location) {
		if (null != this.head || null != this.tail) {
			if (location < 1) {
				this.head = this.head.getNext();
				if (index == 0) {
					this.tail = this.head;
				}
			} else if (location >= this.index) {
				if (index == 0) {
					this.tail = this.tail.getNext();
					this.head = this.tail;
				} else {
					Node tempNode = this.head;
					int count = 0;
					while (count < index - 1) {
						tempNode = tempNode.getNext();
						count++;
					}
					tempNode.setNext(tempNode.getNext().getNext());
					this.tail = tempNode;
				}
			} else {
				Node tempNode = this.head;
				int count = 0;
				while (count < location - 1) {
					tempNode = tempNode.getNext();
					count++;
				}
				tempNode.setNext(tempNode.getNext().getNext());
			}
			this.index--;
			System.out.println("Node deleted!!");
		} else {
			System.out.println("Error while deleting :: List doesn't exist!!");
		}
	}
}
