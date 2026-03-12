import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


public class TrainConsistManagementApp {
	/*
	 * MAIN CLASS - UseCase7TrainManagementApp
	 *
 *
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 *
 * Description:
 * This class sorts passenger bogies based on seating capacity using a custom comparator
 *
 * At this stage, the application:
 * - Creates bogie objects
 * - Stores them in a list
 * - Displays unsorted data
 * - Sorts using comparator logic
 * - Displays sorted result
 *
 * This maps custom ordering using Comparator
 *
 * @author Developer
 * @version 7.0
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
		System.out.println("I=================================================I");
		System.out.println("||   UC7 - Sort Bogies by Capacity(Comparator)   ||");
		System.out.println("I=================================================I\n");
		
		
		List<Bogie> trainConsist = new ArrayList<>();
		
		// Add Bogies and Capacities into the HashMap
		trainConsist.add(new Bogie("Sleeper",300));
		trainConsist.add(new Bogie("AC", 120));
		trainConsist.add(new Bogie("First class", 60));
		trainConsist.add(new Bogie("General", 150));

		System.out.println("Before sorting: \n");
		for(Bogie bogie : trainConsist) {
			System.out.println(bogie.name + " -> " + bogie.capacity);
		}
		
		Comparator<Bogie> capacityComparator = new Comparator<Bogie>() {
			@Override
			public int compare(Bogie b1, Bogie b2) {
				return b1.capacity - b2.capacity;
			}
		};
		
		Collections.sort(trainConsist,capacityComparator);
		
		System.out.println("\nAfter sorting: \n");
		for(Bogie bogie : trainConsist) {
			System.out.println(bogie.name + " -> " + bogie.capacity);
		}

	}
}
