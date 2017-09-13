package myArrayList;

import java.util.Arrays;

import myArrayList.util.MyArrayListComparator;

public class MyArrayList {

	private Integer[] myArray;
	private int currentSize = 50;

	public MyArrayList() {
		myArray = new Integer[currentSize];
	}

	public void insertSorted(int val) {
		if (size() == currentSize) {
			resize();
		}
		myArray[size()] = val;
		Arrays.sort(myArray, new MyArrayListComparator());

	}

	public void removeValue(int val) {
		for (int i = 0; i < myArray.length; i++) {
			if(myArray[i]==null){
				break;
			}
			if (myArray[i] == val) {
				myArray[i] = null;
			}
		}
		Arrays.sort(myArray, new MyArrayListComparator());
	}

	public int indexOf(int value) {

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public int sum() {
		int sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			if(myArray[i] == null){
				break;
			}
			sum += myArray[i];
		}
		return sum;
	}

	private void resize() {
		int newLength = (myArray.length * 3) / 2;
		Integer temp[] = new Integer[newLength];
		for (int i = 0; i < myArray.length; i++) {
			temp[i] = myArray[i];
		}
		myArray = temp;
		currentSize = newLength;
	}

	public int size() {
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == null) {
				return i;
			}
		}
		return currentSize;
	}
	
	public String toString(){
		String s = "";
		for(int i=0; i < myArray.length; i++){
			s += "Element" +i + ":" + myArray[i];
		}
		return s;
		
		}
}
