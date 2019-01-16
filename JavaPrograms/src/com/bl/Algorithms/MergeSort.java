package com.bl.Algorithms;

public class MergeSort {

	int[] array;
	int[] tempMergeArr;
	int length;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] InputArray = {52,54,17,55,95,6,1,9,4};
		MergeSort s = new MergeSort();
		s.sort(InputArray);
		
		for(int i : InputArray)
		{
			System.out.print(i+" ");
		}
		
	}
	
	public void sort(int[] InputArray)
	{
		this.array=InputArray;
		this.length=InputArray.length;
		tempMergeArr=new int[length];
		divideArray(0,length-1);
	}
	
	public void divideArray(int lowerIndex,int higherIndex)
	{
		if(lowerIndex<higherIndex)
		{
			int middle = lowerIndex+(higherIndex-lowerIndex)/2;
			// to sort left side
			divideArray(lowerIndex,middle);
			
			//to sort right side
			divideArray(middle+1, higherIndex);
			
			//merge array
			mergeArray(lowerIndex,middle,higherIndex);
		}
	}
	
	public void mergeArray(int lowerIndex,int middle,int higherIndex)
	{
		for(int i= lowerIndex;i<=higherIndex;i++)
		{
			tempMergeArr[i]=array[i];
		}
		
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		while(i<=middle && j<=higherIndex)
		{
			if(tempMergeArr[i] <= tempMergeArr[j])
			{
				array[k]=tempMergeArr[i];
				i++;
			}
			else
			{
				array[k]=tempMergeArr[j];
				j++;
		}
		k++;
		}
		
		while(i<=middle)
		{
			 array[k]=tempMergeArr[i];
			 k++;
			 i++;
		}
		
	}
}

