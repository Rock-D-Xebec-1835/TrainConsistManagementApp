
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Use Case 16: Sort passenger bogies by Capacity
 *
 * Description:
 * This class demonstrates manual sorting of passenger
 * bogie capacities using the Bubble Sort algorithm
 * instead of built-in sorting utilities
 *
 * At this stage, the application:
 * - Creates an array of capacities
 * - Compares adjacent values
 * - Swaps values when required
 * - Repeats passes until sorted
 * - Displays sorted result
 *
 * This maps algorithmic sorting logic using Bubble Sort
 *
 * @author Developer
 * @version 16.0
 */

public class TrainConsistManagementApp {
	
	public static void main(String[] args) {
		// Display welcome banner
		System.out.println("==========================================");
		System.out.println(" === Train Consist Management App === ");
		System.out.println("==========================================\n");

		System.out.println("=============================================");
		System.out.println("   UC16 - Manual Sorting using Bubble Sort   ");
		System.out.println("=============================================\n");

		// Initialize an array of passenger bogie capacities
		int[] capacities = {72, 34, 56, 66, 25, 67};
		// Before sorting
		System.out.println("Before Sorting: ");
		for(int i = 0; i < capacities.length; i++) {
			System.out.print(capacities[i] + " ");
		}
		
		// Bubble Sort Logic
		boolean swapped;
		for(int i = 0; i < capacities.length - 1; i++) {
			swapped = false;
			for(int j = 0; j < capacities.length - i -1; j++) {
				if(capacities[j] > capacities[j+1]) {
					int temp = capacities[j];
					capacities[j] = capacities[j+1];
					capacities[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) break;
		}
		
		// After Sorting
		System.out.println("\nAfter Sorting: ");
		for(int i = 0; i < capacities.length; i++) {
			System.out.print(capacities[i] + " ");
		}
		System.out.println("\nUC16 bogie capacity sorting done using bubble sort...");
	}
}