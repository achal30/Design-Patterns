package myArrayList;

import java.util.Arrays;

import myArrayList.util.MyArrayListComparator;

/**
 * 
 * @author Achal
 *
 */
public class MyArrayList {

	private Integer[] myArray;
	private int currentSize = 50;

	
	/**
	 * constructor
	 */
	public MyArrayList() {
		myArray = new Integer[currentSize];
	}

	/**
	 * inserts the element and sorts in the ascending order.
	 * @param val
	 */
	public void insertSorted(int val) {
		if (size() == currentSize) {
			resize();
		}
		myArray[size()] = val;
		Arrays.sort(myArray, new MyArrayListComparator());

	}

	/**
	 * removes all the instances of the given value
	 * @param val
	 */
	public void removeValue(int val) {
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == null) {
				break;
			}
			if (myArray[i] == val) {
				myArray[i] = null;
			}
		}
		Arrays.sort(myArray, new MyArrayListComparator());
	}

	
	/**
	 * gives the index of first occurence of the element.
	 * @param value
	 * @return
	 */
	public int indexOf(int value) {

		for (int i = 0; i < myArray.length; i++) {
			if(myArray[i] == null){
				break;
			}
			if (myArray[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	
	/**
	 * calculates the sum of elements of the array.
	 * @return
	 */
	public int sum() {
		int sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == null) {
				break;
			}
			sum += myArray[i];
		}
		return sum;
	}
	
	/**
	 * increases the size of array by 50%.
	 */
	private void resize() {
		int newLength = (myArray.length * 3) / 2;
		Integer temp[] = new Integer[newLength];
		for (int i = 0; i < myArray.length; i++) {
			temp[i] = myArray[i];
		}
		myArray = temp;
		currentSize = newLength;
		//System.out.println("new size: " + myArray.length);
	}

	/**
	 * gives the size of array.
	 * @return
	 */
	public int size() {
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == null) {
				return i;
			}
		}
		return currentSize;
	}
	/**
	 * helper method for testCase.
	 */
	public int actualSize(){
		return currentSize;
	}

	/**
	 * method to print the elements of array in a pretty manner.
	 */
	public String toString() {
		String s = "";
		for (int i = 0; i < myArray.length; i++) {
			if(myArray[i] == null){
				break;
			}
			s += "Element " + i + " : " + myArray[i] + "\n";
		}
		return s;

	}
}
