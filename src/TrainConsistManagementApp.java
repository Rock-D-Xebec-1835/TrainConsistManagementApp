
import java.util.*;
import java.util.stream.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Use Case 20: Exception Handling during Search Operations
 *
 * Description:
 * This class prevents searching when no bogies
 * exist by applying fail-fast validarion
 * using exceptions
 *
 * At this stage, the application:
 * - Creates bogie collection
 * - Validates system state
 * - Throws exception if empty
 * - Stops invalid search operation
 * - Displays meaningful message
 *
 * This maps defendive programmingusing runtime exception
 ****
 *
 * @author Developer
 * @version 20.0
 */

public class TrainConsistManagementApp {
	
	static class Bogie { 
		String name;
		int capacity;

		Bogie(String name, int capacity) {
			this.name = name;
			this.capacity = capacity;
		}

		@Override
		public String toString() {
			return name + " -> " + capacity;
		}
	}
	
	public static void main(String[] args) {
		// Display welcome banner
		System.out.println("==========================================");
		System.out.println(" === Train Consist Management App === ");
		System.out.println("==========================================\n");

		System.out.println("================================================");
		System.out.println("   UC20 - Exception Handling During Search   ");
		System.out.println("================================================\n");

		// Initialize an array of passenger bogie capacities
		List<String> trainConsist = new ArrayList<>();
		trainConsist.add("B101");
		trainConsist.add("B102");
		trainConsist.add("B103");
		trainConsist.add("B104");
		trainConsist.add("B105");
		
		if(trainConsist.size() == 0) throw new IllegalStateException("Train has no bogies");
				
		// Before searching
		System.out.println("Available Bogie IDs: ");
		System.out.print("[ ");
		for(int i = 0; i < trainConsist.size() - 1; i++) {
			System.out.print(trainConsist.get(i) + ", ");
		}
		System.out.println(trainConsist.get(trainConsist.size() - 1) + " ]");
		// Required Bogie ID
		String requiredBogieID = "B103";
		//String requiredBogieID = "B109";
		// Search logic
		boolean found = false;
		for(String s : trainConsist) {
			if(requiredBogieID.equals(s)) {
				found = true;
				break;
			}
		}
		
		System.out.println(found ? "Bogie " + requiredBogieID + " FOUND in train consist." : "Bogie " + requiredBogieID + " NOT FOUND in train consist.");
		System.out.println("UC20 search with safety completed...");
	}
}