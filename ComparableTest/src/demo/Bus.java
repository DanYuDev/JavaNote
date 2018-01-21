package demo;

public class Bus {
	public float len;
	public float milles;
	public float price;
	
	public Bus(float len,float milles,float price) {
		this.len=len;
		this.milles=milles;
		this.price=price;
	}
	
	public String toString() {
		return 
				getClass().getSimpleName()+":["
				+"len:"+len
				+",milles:"+milles
				+",price:"+price
				+"]";
	}
}
