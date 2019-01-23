package com.bl.DataStructures;

import java.util.Arrays;

public class MyDqueueImpl<T> //implements  DqueueList<T>
{
	int size;	//size of the DEQUE
	Object s[];		//create object array 
	int front,rear = -1;
	private int length;


	/**
	 * dqueue follows insert from both end
	 * to add element from FRONT end 
	 * @param o
	 * @return : object
	 */
	public boolean insertFront(Object o)
	{
		if(front-1>=0)   //as arr start index is----0 , so front should not exceed 0
		{
			s[front-1]= o;

			front--;     
			return true;
		}

		return false;
	}

	/**
	 * dqueue follows removal from both end 
	 * so to remove element from the Front end 
	 * @return  :  object
	 */
	public Object deleteFront() //remove element from front 
	{   
		if(front==-1)
		{
			System.out.println("Queue is underflow ");
		} 

		Object e= s[front];

		front++;
		return e;
	}

	/** 
	 * to check if the array(dqueue ) is empty
	 * @return  : boolean
	 */
	public	boolean isempty()
	{
		if(rear==-1 && front==-1)
		{
			return true;			
		}	
		else 
			return false;	
	}
	/**
	 * dqueue follows insertion from both end
	 * to add element from REAR side
	 * @param o: Object passed
	 * @return : object
	 */
	public	boolean insertRear(Object o)
	{
		if(rear==size-1)
		{
			System.out.println("Stack OVERflow");
			return false;
		}

		s[++rear]= o;

		return true;
	}

	/**
	 * dqueue follows removal from both end 
	 * so to remove element from the rear end 
	 * @return  :  object
	 */
	public Object deleteRear() 
	{   
		if(rear==-1)
		{
			System.out.println("Queue is underflow ");
		} 

		Object e= s[rear];

		rear--;

		return e;
		
		
	}

	/**
	 * print the DEQUEUE 
	 * @return : String
	 *  
	 */
	public String toString()
	{
		return "Myqueue [size=" + size + ", s=" + Arrays.toString(s) + ", front=" + front + ", rear=" + rear + "]";
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
}