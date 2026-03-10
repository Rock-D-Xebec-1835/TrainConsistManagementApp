import java.util.List;
import java.util.ArrayList;

public class TrainConsistManagementApp {
	/*
	 * MAIN CLASS - UseCase2TrainManagementApp
	*/
	
	/*
	 * Use Case 2: Add Passenger Bogies to Train
	 * 
	 * Description:
	 * This class demonstrates how passenger bogies can be managed dynamically using ArrayList operations
	 * 
	 * At this stage, the application:
	 * - Adds new bogies to the train
	 * - Removes existing bogies
	 * - Checks for bogie availability
	 * - Displays the final consist
	 * 
	 * 
	 * This maps CRUD operations with ArrayList
	 * 
	 * @author - Developer
	 * @version - 2.0
	*/
	 
	
	public static void main(String[] args) {
		
		// Display welcome message
		System.out.println("I==============================================I");
		System.out.println("||   UC2 - Add Passenger Bogies To the Train  ||");
		System.out.println("I==============================================I");
		
		
		List<String> trainConsist = new ArrayList<String>();
		
		System.out.println("Train Initialized Successfully");
		System.out.println("Initial bogie count: " + trainConsist.size());
		
		trainConsist.add("Sleeper");
		trainConsist.add("AC Chair");
		trainConsist.add("First Class");
		
		System.out.println("After adding bogies:");
		System.out.println("Passenger Bogies: " + trainConsist.toString());
		
		trainConsist.remove("AC Chair");
		
		System.out.println("After removing 'AC Chair':");
		System.out.println("Passenger Bogies: " + trainConsist.toString());
		
		System.out.println("Checking if 'Sleeper' exists:");
		System.out.println("Contains Sleeper? : " + trainConsist.contains("Sleeper"));
		
		System.out.println("Final Train Passenger Consist:");
		System.out.println(trainConsist.toString());
	}
}
