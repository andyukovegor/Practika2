package Andy;
public class Jacket extends �lothes implements Inter {
	int cout_long = 100;
	@Override
	public void material() {
		System.out.println ("Cotton");
	}
	public Jacket(String color, int size) {
		super (color,size);
	}
	
	 public void printClass() {
		   System.out.println("You are in class Jacket");
	   }
}
