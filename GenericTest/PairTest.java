import java.util.*;
import java.time.*;
public class PairTest{
	public static void main(String[] args){
		Pair<String> pair=new Pair<>("Hello","World");
		System.out.println(pair.getFirst()+pair.getSecond());
		
		Pair<LocalDate> timePair=new Pair<>(LocalDate.parse("1991-11-23"),
				LocalDate.parse("1997-12-21"));
		System.out.println(timePair.getFirst()+"  "+timePair.getSecond());
		
		LocalDate date1=LocalDate.parse("1996-12-23");
		LocalDate date2=LocalDate.parse("1989-12-23");
		LocalDate date3=LocalDate.parse("1998-12-23");
		LocalDate date4=LocalDate.parse("1991-12-23");
		LocalDate date5=LocalDate.parse("1995-12-23");
		
		LocalDate[] a={date1,date2,date3,date4,date5};
		System.out.println(date1 instanceof Comparable); //true
		System.out.println("Min Localdate is :"+ArrayAlg.min(a));
	}
	
}