import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedList;

public class TrainConsistManagementApp {
	/*
	 * MAIN CLASS - UseCase2TrainManagementApp
	 *
 *
 * Use Case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 *
 * At this stage, the application:
 * - Adds bogies in sequence
 * - Inserts bogies at specific positions
 * - Removes bogies from front and rear
 * - Displays updated train structure
 *
 * This maps positional operations using LinkedList.
 *
 * @author Developer
 * @version 4.0
 */

	 
	
	public static void main(String[] args) {
		
		// Display welcome message
		System.out.println("I=========================================I");
		System.out.println("||   UC4 - Maintain Ordered Bogie List   ||");
		System.out.println("I=========================================I");
		
		
		List<String> trainConsist = new LinkedList<>();
		
		System.out.println("Train Initialized Successfully");
		System.out.println("Initial bogie count: " + trainConsist.size());
		// Add Bogies into the LinkedList
		trainConsist.add("Engine");
		trainConsist.add("Sleeper");
		trainConsist.add("AC");
		trainConsist.add("Cargo");
		trainConsist.add("Guard");

		System.out.println("After adding bogies:");
		System.out.println("Passenger Bogies: " + trainConsist.toString());
		
		trainConsist.add(2, "Pantry");
		
		System.out.println("After adding 'Pantry' at index 2:");
		System.out.println("Passenger Bogies: " + trainConsist.toString());
		
		trainConsist.removeFirst();
		trainConsist.removeLast();
		
		System.out.println("After removing first and last bogies:");
		System.out.println("Passenger Bogies: " + trainConsist.toString());
		
		System.out.println("Final Train Passenger Consist:");
		System.out.println(trainConsist.toString());
	}
}
