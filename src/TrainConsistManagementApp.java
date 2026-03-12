import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class TrainConsistManagementApp {
	/*
	 * MAIN CLASS - UseCase9TrainManagementApp
	 *
 *
 * Use Case 9: Group bogies by Type
 *
 * Description:
 * This class groups similar bogies together using
 * Java Stream Collectors.groupingBy()
 *
 * At this stage, the application:
 * - Creates a list of bogies
 * - Streams the list
 * - Groups bogie by name
 * - Stores grouped data in a Map
 * - Displays grouping structure
 *
 * This maps classification logic using groupingBy.
 *
 * @author Developer
 * @version 9.0
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
		System.out.println("I==================================I");
		System.out.println("||   UC9 - Group Bogies by Type   ||");
		System.out.println("I==================================I\n");
		
		
		List<Bogie> trainConsist = new ArrayList<>();
		
		// Add Bogies and Capacities into the HashMap
		trainConsist.add(new Bogie("Sleeper",72));
		trainConsist.add(new Bogie("AC", 64));
		trainConsist.add(new Bogie("First class", 48));
		trainConsist.add(new Bogie("AC", 64));
		trainConsist.add(new Bogie("Sleeper",70));
		trainConsist.add(new Bogie("General", 150));
		trainConsist.add(new Bogie("AC", 60));
		trainConsist.add(new Bogie("Sleeper",74));
		trainConsist.add(new Bogie("First class", 50));

		System.out.println("Before grouping: \n");
		for(Bogie bogie : trainConsist) {
			System.out.println(bogie.name + " -> " + bogie.capacity);
		}
		
		Map<String,List<Bogie>> groupedBogies = trainConsist.stream()
					.collect(Collectors.groupingBy(bogie -> bogie.name));
		
		System.out.println("\nGrouped Bogies: \n");
		for(Map.Entry<String, List<Bogie>> bogieMap : groupedBogies.entrySet()) {
			System.out.println(bogieMap.getKey());
			for(Bogie b :bogieMap.getValue()) {
				System.out.println("Capacity - " + b.capacity);
			}
			System.out.println();
		}
	}
}
