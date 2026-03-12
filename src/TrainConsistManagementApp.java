import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistManagementApp {
	/*
	 * MAIN CLASS - UseCase11TrainManagementApp
	 *
 *
 * Use Case 11: Validate TrainID and Cargo Code
 *
 * Description:
 * This class validates input formats using Regular Expressions.
 *
 * At this stage, the application:
 * - Accpets Train ID input
 * - Accepts Cargo Code input
 * - Applies regex validation
 * - Displays validation result
 *
 * This maps format validation logic using Pattern matching.
 *
 * @author Developer
 * @version 11.0
 */

	static class Bogie{
		private String name;
		private int capacity;
		
		public Bogie(String name, int capacity) {
			this.name = name;
			this.capacity = capacity;
		}
		
		public String getName() {
			return this.name;
		}
		
		public int getCapacity() {
			return this.capacity;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Display welcome message
		System.out.println("I========================================I");
		System.out.println("||   Validate Train ID and Cargo Code   ||");
		System.out.println("I========================================I\n");
		
		
		//List<Bogie> trainConsist = new ArrayList<>();
		
		//Validation Logic
		Pattern trainIDRegex = Pattern.compile("T-\\d{5}");
		Pattern cargoIDRegex = Pattern.compile("C-\\d{5}");
		
		System.out.println("Enter Train ID: ");
		String trainID = in.next();
		Matcher trainMatcher = trainIDRegex.matcher(trainID);
		
		System.out.println("Enter Cargo ID: ");
		String cargoId = in.next();
		Matcher cargoMatcher = cargoIDRegex.matcher(cargoId);

		System.out.println("Validation Results: \n");
		System.out.println("Train ID valid: " + trainMatcher.matches());
		System.out.println("Cargo ID valid: " + cargoMatcher.matches());
		
	}
}
