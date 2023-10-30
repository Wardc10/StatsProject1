public class Person {

	public Person() {
		
	}

		public double birthday(int n) {
			double shared_bday = 0;
			double days = 365;
			double count = 0;
			for(int i=0; i<n; i++) {
				shared_bday = shared_bday + (1/(days-count));
				count++;
			}
			return shared_bday;
		}
	
	
}
