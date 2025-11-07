//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    
                String chantingName = args[0];
                chantingName = chantingName.toUpperCase();
                int numberOfChants = Integer.parseInt(args[1]);

                for( int i = 0; i < args[0].length(); i++) {

                        char currentLetter = chantingName.charAt(i);

                        switch (currentLetter) {
                                case 'A':
                                case 'E':
                                case 'F':
                                case 'H':
                                case 'I':
                                case 'L':
                                case 'N':
                                case 'M':
                                case 'O':
                                case 'R':
                                case 'S':
                                case 'X':
                                        
                                        System.out.println("Give me an " + currentLetter + ": " + currentLetter + "!" );
                                        break;
                        
                                default:
                                        System.out.println("Give me a  " + currentLetter + ": " + currentLetter + "!" );
                                        break;
                        }
                        

                }

                System.out.println("What does that spell?");

                
                for( int i = 0; i < numberOfChants; i++) {

                        System.out.println(chantingName + "!!!");

                }

                

        }
}
