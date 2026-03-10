import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class TrainConsistManagementApp {
	/*
	 * MAIN CLASS - UseCase6TrainManagementApp
	 *
 *
 * Use Case 6: Map Bogie to capacity
 *
 * Description:
 * This class associates each bogie with its seating or load capacity
 * using a key-value mapping structure.
 *
 * At this stage, the application:
 * - Creates a HashMap for bogie-capacity mapping
 * - Inserts a capacity value for each bogie
 * - Iterates through map entries
 * - Displays bogie and capacity information
 *
 * This maps look-up based access using HashMap.
 *
 * @author Developer
 * @version 6.0
 */

	 
	
	public static void main(String[] args) {
		
		// Display welcome message
		System.out.println("I================================================I");
		System.out.println("||   UC6 - Map Bogie to Capacity(HashMap)       ||");
		System.out.println("I================================================I");
		
		
		Map<String, Integer> trainConsist = new HashMap<>();
		
		// Add Bogies and Capacities into the HashMap
		trainConsist.put("First Class", 40);
		trainConsist.put("Sleeper", 500);
		trainConsist.put("AC", 100);
		trainConsist.put("Cargo", 200);

		System.out.println("After adding bogies:");
		System.out.println("Bogie Capacities details: \n" + trainConsist.toString());

	}
}
