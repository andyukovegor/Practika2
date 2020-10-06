package Andy;

public class Down_jacket extends Clothes implements Inter {
	int count_long = 70;
	
	
	@Override
	public void material() {
		System.out.println("Faux fur");
	}
	public Down_jacket(String color, int size) {
		super (color,size);
	}
	
	 public void printClass() {
		   System.out.println("You are in class Down_jacket");
	   }
	
}
