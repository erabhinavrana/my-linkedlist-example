/**
 * 
 */
package com.abhi.nodes;

/**
 * @author abhinav
 *
 */
public class DoubleRefNode {
	private int value;
	private DoubleRefNode next;
	private DoubleRefNode prev;
	
	/**
	 * @param value
	 * @param next
	 */
	public DoubleRefNode(int value) {
		super();
		this.value = value;
		this.next = null;
		this.prev = null;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/**
	 * @return the next
	 */
	public DoubleRefNode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(DoubleRefNode next) {
		this.next = next;
	}
	/**
	 * @return the prev
	 */
	public DoubleRefNode getPrev() {
		return prev;
	}
	/**
	 * @param prev the prev to set
	 */
	public void setPrev(DoubleRefNode prev) {
		this.prev = prev;
	}
	
	
}
