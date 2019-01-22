package com.bl.DataStructures;

public interface DqueueList<T> {

	public boolean addFront(T element);
	public boolean addRear(T element);
	public boolean removeFront();
	public boolean removeRear();
	public int size();
	boolean isEmpty();

}
