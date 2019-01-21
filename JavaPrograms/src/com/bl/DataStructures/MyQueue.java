package com.bl.DataStructures;

public class MyQueue<T> implements QueueList<T> {

	final int capacity = Constants.STACKSIZE;
	private T[] elements = (T[])new Object[capacity];;
	private int front =0;
	private int rear=-1;
	private int size=0;

	public int size() {
		// TODO Auto-generated method stub

		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (size==0)
			return true;
		else
			return false;
	}

	@Override
	public void enqueue(T ele) {
		// TODO Auto-generated method stub
		if (isFull()) 
		{
			System.out.println("Queue is full...Remove some items before enqueuing...!");
			return; 
		}	
		rear = (rear +1) % capacity;
		elements[rear] = ele;
		size++;

	}

	@Override
	public T dequeue() {

		if (isEmpty()) 
		{
			System.out.println("Queue is empty...Enqueue some items before dequeuing it...!");
			System.exit(1);
		}
		T item = elements[front]; 
		front = (front + 1) % capacity; 
		size = size - 1; 
		return item; 
		
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (size==capacity);
	}


}
