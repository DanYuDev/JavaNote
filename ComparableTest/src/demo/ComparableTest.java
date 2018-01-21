package demo;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.print.attribute.HashPrintRequestAttributeSet;

public class ComparableTest {
	public static void main(String[] args) {
		Animal a=new Animal(12, 23.67f);
		Animal b=new Animal(13, 35.3f);
		Animal c=new Animal(5, 16.7f);
		Animal d=new Animal(20, 40);
		
		Set<Animal> animalsSet =new TreeSet<>();
		animalsSet.add(a);
		animalsSet.add(b);
		animalsSet.add(c);
		animalsSet.add(d);
		
		Set<Bus> busSet=new TreeSet<Bus>(new MyComparator());
		busSet.add(new Bus(23, 247, 98));
		busSet.add(new Bus(20, 678, 56));
		busSet.add(new Bus(13, 90, 128));
		busSet.add(new Bus(17, 345, 17));
		
		
		for(Animal animal:animalsSet) {
			System.out.println(animal.toString());
		}
		
		for(Bus bus:busSet) {
			System.out.println(bus.toString());
		}
	}

}
