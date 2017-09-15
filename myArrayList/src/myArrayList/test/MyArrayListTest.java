package myArrayList.test;

import java.io.IOException;
import myArrayList.MyArrayList;
import myArrayList.util.Results;


/**
 * 
 * @author Achal
 *
 */
public class MyArrayListTest {
	private MyArrayList list;

	/**
	 * 
	 * @param listIn
	 * @param result
	 * @throws IOException
	 */
	public void testMe(MyArrayList listIn, Results result) throws IOException {
		list = listIn;
		result.storeNewResult("assert resize", assertResize());
		result.storeNewResult("assert sum", assertSum());
		result.storeNewResult("assert index", assertIndex());
		result.storeNewResult("assert single removal", assertRemoval());
		result.storeNewResult("assert multiple removal", assertMultiRemoval());
		result.storeNewResult("assert initialization", assertInitialization());
		result.storeNewResult("assert is sorted", assertIsSorted());
		result.storeNewResult("assert size", assertSize());
		result.storeNewResult("assert first index", assertMultiIndex());
		result.storeNewResult("assert to string", assertToString());
	}

	/**
	 * testcase that checks whether the array size increases by 50% or not.
	 * @return
	 */
	public boolean assertResize() {
		for (int i = 0; i < 51; i++) {
			list.insertSorted(i);
		}
		if (list.actualSize() == 75) {
			return true;
		}
		return false;
	}

	/**
	 * checks for the sum of the elements of the array.
	 * @return
	 */
	public boolean assertSum() {
		list = new MyArrayList();
		for (int i = 0; i < 10; i++) {
			list.insertSorted(100);
		}
		if (list.sum() == 1000) {
			return true;
		}
		return false;
	}

	/**
	 * checks if the correct index of the element is returned.
	 * @return
	 */
	public boolean assertIndex() {
		list = new MyArrayList();
		list.insertSorted(100);
		if (list.indexOf(100) == 0) {
			return true;
		}
		return false;
	}

	/**
	 * checks if it returns the first occurence of index of repeating elements.
	 * @return
	 */
	public boolean assertMultiIndex() {
		list = new MyArrayList();
		list.insertSorted(100);
		list.insertSorted(100);
		if (list.indexOf(100) == 0) {
			return true;
		}
		return false;
	}

	/**
	 * checks if the element is removed.
	 * @return
	 */
	public boolean assertRemoval() {
		list = new MyArrayList();
		list.insertSorted(100);
		list.removeValue(100);
		if (list.indexOf(100) == -1) {
			return true;
		}
		return false;
	}

	/**
	 * checks if all the occurences of given value is removed.
	 * @return
	 */
	public boolean assertMultiRemoval() {
		list = new MyArrayList();
		list.insertSorted(100);
		list.insertSorted(100);
		list.insertSorted(100);

		list.removeValue(100);
		if (list.indexOf(100) == -1) {
			return true;
		}
		return false;
	}

	/**
	 * checks for the initialization of size of array.
	 * @return
	 */
	public boolean assertInitialization() {
		list = new MyArrayList();
		if (list.actualSize() == 50) {
			return true;
		}
		return false;
	}

	/**
	 * checks if the list is sorted in ascending order or not.
	 * @return
	 */
	public boolean assertIsSorted() {
		list = new MyArrayList();
		list.insertSorted(10);
		list.insertSorted(7);
		list.insertSorted(5);

		if (list.indexOf(5) == 0 && list.indexOf(7) == 1 && list.indexOf(10) == 2) {
			return true;
		}

		return false;
	}

	/**
	 * checks for the size of array
	 * @return
	 */
	public boolean assertSize() {
		list = new MyArrayList();
		for (int i = 0; i < 10; i++) {
			list.insertSorted(i);
		}

		if (list.size() == 10) {
			return true;
		}
		return false;
	}

	/**
	 * checks if the toString method outputs the string.
	 * @return
	 */
	public boolean assertToString() {
		list = new MyArrayList();
		list.insertSorted(100);
		//System.out.println(list.toString());
		if (list.toString().equals("Element 0 : 100\n")) {
			return true;
		}
		return false;
	}
}
