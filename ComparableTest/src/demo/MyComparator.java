package demo;

import java.util.Comparator;

public class MyComparator implements Comparator<Bus> {
	@Override
	public int compare(Bus a,Bus b) {
		if((a.price-b.price)>0) 
			return 1;
		else return -1;
	}
}
