package myArrayList.util;

import java.util.Comparator;

public class MyArrayListComparator implements Comparator<Integer> {


	@Override

	/**
	 * compares the integer and returns accordingly.
	 * @return 
	 */
	public int compare(Integer o1, Integer o2) {
		if(o1==null){
			return 1;
		}
		if(o2==null){
			return -1;
		}
		if(o1 < o2){
			return -1;
		}
		if(o1 > o2){
			return 1;
		}
		
		return 0;
	}

}
