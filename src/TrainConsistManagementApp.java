import java.util.Set;
import java.util.HashSet;

public class TrainConsistManagementApp {
	/*
	 * MAIN CLASS - UseCase2TrainManagementApp
	 *
	 * Use Case 3: Track Unique Bogie IDs
	 *
	 * Description:
	 * This class ensures that duplicate bogie IDs are not
	 * added into the train formation using HashSet.
	 *
	 * At this stage, the application:
	 * - Stores bogie IDs
	 * - Prevents duplicates automatically
	 * - Displays unique bogie identifiers
	 *
	 * This maps uniqueness validation using Set.
	 *
	 * @author Developer
	 * @version 3.0
	 */
	 
	
	public static void main(String[] args) {
		
		// Display welcome message
		System.out.println("I====================================I");
		System.out.println("||   UC3 - Track Unique Bogie IDs   ||");
		System.out.println("I====================================I");
		
		
		Set<String> trainConsist = new HashSet<>();
		
		System.out.println("Train Initialized Successfully");
		System.out.println("Initial bogie count: " + trainConsist.size());
		// Add IDs into the set
		trainConsist.add("B1");
		trainConsist.add("B2");
		trainConsist.add("B3");
		// Duplicates too
		trainConsist.add("B2");
		System.out.println("After adding bogies:");
		System.out.println("Passenger Bogies: " + trainConsist.toString());
		
		trainConsist.remove("B2");
		
		System.out.println("Final Train Passenger Consist:");
		System.out.println(trainConsist.toString());
	}
}
