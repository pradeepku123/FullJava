package com.Collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Integer objOne=(Integer)o1;
		Integer objTwo=(Integer)o2;
		return -objOne.compareTo(objTwo);
	}
	
	
}
