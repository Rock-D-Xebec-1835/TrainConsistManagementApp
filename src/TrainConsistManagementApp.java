import java.util.List;
import java.util.ArrayList;

public class TrainConsistManagementApp {
	/*
	 * MAIN CLASS - UseCase1TrainManagementApp
	*/
	
	/*
	 * Use Case 1: Initialize train and Display Consist Summary
	 * 
	 * Description:
	 * This class represents the entry point of the Train Consist Management Application
	 * 
	 * At this stage, the application:
	 * - Creates an empty train consist
	 * - Uses a dynamic List to store the bogies
	 * - Displays initial bogie count
	 * - Prints the current state of the train
	 * 
	 * 
	 * This use case introduces collection initialization and basic program startup flow
	 * 
	 * @author - Developer
	 * @version - 1.0
	*/
	
	public static void main(String[] args) {
		
		// Display welcome message
		System.out.println("I===================================I");
		System.out.println("||   Train Consist Management App  ||");
		System.out.println("I===================================I");
		
		
		List<String> trainConsist = new ArrayList<String>();
		
		System.out.println("Train Initialized Successfully");
		System.out.println("Initial bogie count: " + trainConsist.size());
	}
}
