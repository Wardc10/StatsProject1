import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person {

	public Person() {
		
	}

	Random rand = new Random();
	public double birthday(int n) {
		
		List<Integer> l = new ArrayList<Integer>();
		int shared = 0;
		for(int i=0; i<n; i++) {
			int r = rand.nextInt(365);
			l.add(r);
		}
		for(int i=0; i<n; i++) {
			for(int j=1; j<n-1; j++) {
				if(l.get(i) == l.get(j)) {
					shared = 1;
					break;
				}
			}
		}
		return shared/n;
	}
	
	
}
