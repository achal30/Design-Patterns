package myArrayList.driver;

import myArrayList.MyArrayList;

public class Driver {
	public static void main(String args[])
	{
		MyArrayList list = new MyArrayList();
		
		list.insertSorted(10);
		list.insertSorted(20);
		list.insertSorted(5);
		list.insertSorted(35);
		list.insertSorted(8);
		list.insertSorted(23);
		list.insertSorted(10);
		list.insertSorted(10);
		list.insertSorted(15);
		list.insertSorted(50);
		list.insertSorted(1000);
		//list.removeValue(23);
		System.out.println(list.size());
		System.out.println(list.sum());
		
	}
}
