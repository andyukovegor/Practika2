package Andy;
import java.util.Arrays;
import java.util.List;
public class Main {

	public static void main(String[] args) {
	Jacket j1 = new Jacket ("Black", 10);
	Jacket j2 = new Jacket ("Brown", 20);
	Down_jacket d1 = new Down_jacket ("White" , 15);
	Down_jacket d2 = new Down_jacket ("Red", 25);
	
	List <Ñlothes>  clothes = Arrays.asList(j1, j2, d1, d2);
	for (Ñlothes i : clothes) {
		i.print();
	}
	
	
	j1.printClass();
	
	}
	
}
