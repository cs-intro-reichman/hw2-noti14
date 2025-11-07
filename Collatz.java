// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	   
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int currentNum = 0;
		int count = 0;
		
		if (mode.equals("v")) {
			
			for (int i = 1; i <= seed; i++) {

				System.out.print(i + " ");
				count ++;
				if (i % 2 == 0) {

					currentNum = i / 2;

					System.out.print(currentNum + " ");
					count ++;

				} else {

					currentNum = (i * 3) + 1;
					System.out.print(currentNum + " ");
					count ++;

				}
				while (currentNum != 1) {

					if ( currentNum % 2 == 0) {

						currentNum = currentNum / 2;

						System.out.print(currentNum + " ");
						count ++;

					} else {

						currentNum = (currentNum * 3) + 1;
						System.out.print(currentNum + " ");
						count ++;

					}
					
				}

				System.out.print("(" + (count) + ")\n");
				
				count = 0;

			}

			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1." );

		} else {

			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1." );

		}
		
	}
}


/*
 	int currentNum = 1;
				while (isOne != 1) {
					if (currentNum / 2 == 0) {
						
					} else {

					}
				}
 */