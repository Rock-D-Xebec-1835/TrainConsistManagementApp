
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Use Case 17: Sort Bogie using Arrays.sort()
 *
 * Description:
 * This class demonstrates sorting of bogie type names alphabetically using Java's built-in
 * Arrays.sort() methodx`
 *
 * At this stage, the application:
 * - Creates an array of bogie names
 * - Uses Arrays.sort() for sorting
 * - Displays sorted results
 *
 * This maps optimized sorting using Java Library Utilities
 *
 * @author Developer
 * @version 17.0
 */

public class TrainConsistManagementApp {
	
	public static void main(String[] args) {
		// Display welcome banner
		System.out.println("==========================================");
		System.out.println(" === Train Consist Management App === ");
		System.out.println("==========================================\n");

		System.out.println("================================================");
		System.out.println("   UC17 - Sort Bogie Name using Arrays.sort()   ");
		System.out.println("================================================\n");

		// Initialize an array of passenger bogie capacities
		String[] bogieType = {"Sleeper", "AC Chair", "First Class", "General", "Pantry"};
		// Before sorting
		System.out.println("Before Sorting: ");
		System.out.print("[ ");
		for(int i = 0; i < bogieType.length - 1; i++) {
			System.out.print(bogieType[i] + ", ");
		}
		System.out.println(bogieType[bogieType.length - 1] + " ]");
		
		// In-Built Sort Method
		Arrays.sort(bogieType);
		
		// After Sorting
		System.out.println("\nAfter Sorting: ");
		System.out.print("[ ");
		for(int i = 0; i < bogieType.length - 1; i++) {
			System.out.print(bogieType[i] + ", ");
		}
		System.out.println(bogieType[bogieType.length - 1] + " ]");
		System.out.println("\nUC17 bogie type sorting using Arrays.sort()...");
	}
}