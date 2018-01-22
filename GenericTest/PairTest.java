import java.util.*;
import java.time.*;
public class PairTest{
	public static void main(String[] args){
		Pair<String> pair=new Pair<>("Hello","World");
		System.out.println(pair.getFirst()+pair.getSecond());
		
		Pair<LocalDate> timePair=new Pair<>(LocalDate.parse("1991-11-23"),
				LocalDate.parse("1997-12-21"));
		System.out.println(timePair.getFirst()+"  "+timePair.getSecond());
	}
}