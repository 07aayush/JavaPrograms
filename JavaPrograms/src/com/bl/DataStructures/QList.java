package com.bl.DataStructures;

public interface QList<E>
{

	public void enqueue(E element) ;
	public E dequeue();
	public boolean isEmpty();
	public int size();

}
