import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class TrainConsistManagementApp {
	/*
	 * MAIN CLASS - UseCase10TrainManagementApp
	 *
 *
 * Use Case 10: Count total seats in Train
 *
 * Description:
 * This class aggragates seating capacity of all bogies into a single total using Stream reduce().
 *
 * At this stage, the application:
 * - Creates a list of bogies
 * - Maps bogies to capacity
 * - Reduces values into total
 * - Displays total seat count
 *
 * This maps classification logic using reduce().
 *
 * @author Developer
 * @version 10.0
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
		
		// Display welcome message
		System.out.println("I====================================I");
		System.out.println("||   Count Total Seats in a Train   ||");
		System.out.println("I====================================I\n");
		
		
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

		System.out.println("Train info: \n");
		for(Bogie bogie : trainConsist) {
			System.out.println(bogie.name + " -> " + bogie.capacity);
		}
		
		int totalCapacity = trainConsist.stream()
				.mapToInt(b -> b.capacity)
					.sum();
		
		System.out.println("\nTotal Capacity: ");
		System.out.println(totalCapacity);
	}
}
