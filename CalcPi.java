// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    
		int amountOfTerms = Integer.parseInt(args[0]);
		double sum = 1;
		int divider = 3;
		char action = '-';
		

		for(int i = 1; i < amountOfTerms; i++) {

			switch (action) {
				case '-':

					sum = sum - ((double)1 / divider);
					divider = divider + 2;
					action = '+';
					
					break;
			
				case '+':

					sum = sum + ((double)1 / divider);
					divider = divider + 2;
					action = '-';
					break;
			}

		}
		

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum * 4);

	}
}
