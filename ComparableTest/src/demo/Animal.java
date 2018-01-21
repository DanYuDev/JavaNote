package demo;

public class Animal implements Comparable<Animal>{
	private int age;
	private float weight;
	
	public Animal(int age,float weight) {
		this.age=age;
		this.weight=weight;
	}
	
	@Override
	public int compareTo(Animal animal) {
		if(this.weight>animal.weight)
			return 1;
		else
			return -1;
	}
	
	public float getWeight() {
		return this.weight;
	}
	
	public String toString() {
		return getClass().getSimpleName()+":["+"age:"+age+",weight :"+weight+"]";
	}
}
