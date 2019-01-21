package com.bl.DataStructures;

public interface QueueList<T> {

	public int size();
	public boolean isEmpty();
	public void enqueue( T ele);
	public T dequeue();
	public boolean isFull();	
	
	
}
