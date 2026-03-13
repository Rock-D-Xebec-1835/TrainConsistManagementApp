
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Use Case 18: Linear Search for Bogie ID
 *
 * Description:
 * This class demonstrates searching for a specific bogie ID using a simple Linear Search algorithm
 *
 * At this stage, the application:
 * - Creates an array of bogie IDs
 * - Accepts a search key
 * - Traverses array sequentially
 * - Stops when match is found
 * - Displays search result
 *
 * This maps basic search logic using sequential travel
 *
 * @author Developer
 * @version 18.0
 */

public class TrainConsistManagementApp {
	
	public static void main(String[] args) {
		// Display welcome banner
		System.out.println("==========================================");
		System.out.println(" === Train Consist Management App === ");
		System.out.println("==========================================\n");

		System.out.println("================================================");
		System.out.println("   UC19 - Binary Search for Bogie ID   ");
		System.out.println("================================================\n");

		// Initialize an array of passenger bogie capacities
		String[] bogieIds = {"B101", "B102", "B103", "B104", "B105"};
		// Available Bogies
		System.out.println("Available Bogie IDs: ");
		System.out.print("[ ");
		for(int i = 0; i < bogieIds.length - 1; i++) {
			System.out.print(bogieIds[i] + ", ");
		}
		System.out.println(bogieIds[bogieIds.length - 1] + " ]");
		// Required Bogie ID
		String requiredBogieID = "B104";
		//String requiredBogieID = "B109";
		// Search logic
		boolean found = false;
		int start = 0;
		int end = bogieIds.length - 1;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(bogieIds[mid].equals(requiredBogieID)) {
				found = true;
				break;
			}
			else if(bogieIds[mid].compareTo(requiredBogieID) < 0) {
				start = mid + 1;
			}
			else end = mid - 1;
		}
		
		System.out.println(found ? "Bogie " + requiredBogieID + " FOUND in train consist." : "Bogie " + requiredBogieID + " NOT FOUND in train consist.");
		System.out.println("UC18 search completed...");
	}
}