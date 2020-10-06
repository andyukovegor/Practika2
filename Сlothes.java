package Andy;

public abstract class Clothes implements Inter {

	
	   private String brand;
	   private int size;
	   public abstract void material ();


	   public Clothes() {
		   this.size = 0;
		   this.brand = "BRAND";
	   }
	   
	   public Clothes(String color, int size) {
		   this.size = size;
		   this.brand = color;
	   }
	   
	   public void print() {
		   System.out.println(brand + "" + size);
	   }
	   public void printClass() {
		   System.out.println("You are in class Ñlothes");
	   }
	   
	   public final void NOprint_Data () {
		   System.out.println("06.10.2020");
	   }
	}
