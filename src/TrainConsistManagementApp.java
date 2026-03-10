import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class TrainConsistManagementApp {
	/*
	 * MAIN CLASS - UseCase5TrainManagementApp
	 *
 *
 * Use Case 4: Preserve Insertion Order of Bogies
 *
 * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using HashSet.
 *
 * At this stage, the application:
 * - Attaches bogies in order
 * - Preserves insertion sequence
 * - Avoids duplicate bogies
 * - Displays final train formation
 *
 * This maps ordered uniqueness using LinkedHashSet.
 *
 * @author Developer
 * @version 5.0
 */

	 
	
	public static void main(String[] args) {
		
		// Display welcome message
		System.out.println("I================================================I");
		System.out.println("||   UC5 - Preserve INsertion Order of Bogies   ||");
		System.out.println("I================================================I");
		
		
		Set<String> trainConsist = new LinkedHashSet<>();
		
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
		
		
		System.out.println("Final Train Passenger Consist:");
		System.out.println(trainConsist.toString());
	}
}
