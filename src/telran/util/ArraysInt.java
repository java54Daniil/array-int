package telran.util;

import java.util.Arrays;

public class ArraysInt {

	public static int[] addNumber(int[] array, int number) {
		//TODO
		//apply method copyOf of class Arrays
		int [] copyArray =Arrays.copyOf(array, array.length+1);
		copyArray[copyArray.length - 1] = number;
		return copyArray;
	}

	public static int[] insertNumber(int[] array, int index, int number) {
		// TODO
		int[] copyArray = Arrays.copyOf(array, array.length + 1);
		System.arraycopy(array, index, copyArray, index+1, array.length-index);
		copyArray[index] = number;
		return copyArray;
	}

	public static int[] removeNumber(int[] array, int index) {
		//TODO
		//apply method arrayCopy of class System
		int[] newArray = new int[array.length - 1];
	    System.arraycopy(array, 0, newArray, 0, index);
	    System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
		return newArray;
	}
	public static int[] insertSorted(int[] sortedArray,int number) {
		//TODO
		//insert number into sorted array with keeping the sorted order
		//apply method binarySerarch of the class Arrays
		 int index = Arrays.binarySearch(sortedArray, number);
		 System.out.println(index);
	        if (index < 0) {
	            index = -(index + 1); 
	        }
	        int[] newArray = new int[sortedArray.length + 1];
	        System.arraycopy(sortedArray, 0, newArray, 0, index);
	        newArray[index] = number;
	        System.arraycopy(sortedArray, index, newArray, index + 1, sortedArray.length - index);
	        

		return newArray;
	}
}
