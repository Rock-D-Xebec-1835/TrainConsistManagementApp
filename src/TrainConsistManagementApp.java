import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;


public class TrainConsistManagementApp {
	/*
	 * MAIN CLASS - UseCase8TrainManagementApp
	 *
 *
 * Use Case 8: Filter Passenger Bogies Using Streams
 *
 * Description:
 * This class filters passenger bogies based on seating
 * capacities using Stram API
 *
 * At this stage, the application:
 * - Creates a list of bogies
 * - Converts list into stream
 * - Apllies a filter logic
 * - Collects filtered result
 * - Displays qualifying size
 *
 * This maps functional filtering using Strams
 *
 * @author Developer
 * @version 8.0
 */

	static class Bogie{
		String name;
		int capacity;
		
		public Bogie(String name, int capacity) {
			this.name = name;
			this.capacity = capacity;
		}
	}
	
	public static void main(String[] args) {
		
		// Display welcome message
		System.out.println("I===================================================I");
		System.out.println("||   UC8 - Filter Passenger Bogies using Streams   ||");
		System.out.println("I===================================================I\n");
		
		
		List<Bogie> trainConsist = new ArrayList<>();
		
		// Add Bogies and Capacities into the HashMap
		trainConsist.add(new Bogie("Sleeper",300));
		trainConsist.add(new Bogie("AC", 80));
		trainConsist.add(new Bogie("First class", 60));
		trainConsist.add(new Bogie("General", 150));

		System.out.println("Before sorting: \n");
		for(Bogie bogie : trainConsist) {
			System.out.println(bogie.name + " -> " + bogie.capacity);
		}
		
		List<Bogie> filteredBogies = trainConsist.stream()
					.filter(b -> b.capacity > 100)
					.collect(Collectors.toList());
		
		System.out.println("\nFiltered Bogies: (Capacity > 100) \n");
		for(Bogie bogie : filteredBogies) {
			System.out.println(bogie.name + " -> " + bogie.capacity);
		}

	}
}
