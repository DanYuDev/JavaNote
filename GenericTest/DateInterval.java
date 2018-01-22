import java.time.*;
import java.util.*;
public class DateInterval extends Pair<Date>{
	public DateInterval(Date first,Date second){
		super(first,second);
	}
	
	@Override
	public void setSecond(Date second){
		super.setSecond(second);
	}
	
	@Override
	public Date getSecond(){
		return super.getSecond();
	}
	
	public static void main(String[] args){
		DateInterval interval = new DateInterval(new Date(),new Date());
		Pair<Date> pair = interval;
		Date date=new Date(2000,1,1);
		System.out.println("原来的日期："+pair.getSecond());
		System.out.println("set 新日期："+date);
		pair.setSecond(date);
		System.out.println("pair.setSecond(date):"+pair.getSecond());
		
		if(pair instanceof Pair<T>)
			System.out.println("Yes,it is a Pair<Date>");
	}
}