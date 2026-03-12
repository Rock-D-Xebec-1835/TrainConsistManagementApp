
import java.util.*;
import java.util.stream.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Use Case 14: Handle Invalid Boogie Capacity(Custom Exception)
 *
 * Description:
 * This class prevents creation of passenger bogies
 * with invalid seating capacity using a custom exception
 *
 * At this stage, the application:
 * - Defines a custom exception
 * - Validates capacity inside constructor
 * - Throws exception if capacity <= 0
 * - Prevents invalid bogie creation
 * - Continues execution safely
 *
 * This maps fail-fast validation using checked exceptions.
 *
 * @author Developer
 * @version 14.0
 */

public class TrainConsistManagementApp {
	// Custom Exception
	static class InvalidCapacityException extends RuntimeException{
		public InvalidCapacityException(String message) {
			super(message);
		}
	}
	
	// Inner Bogie class to model passenger bogies
	static class Bogie { 
		String name;
		int capacity;

		Bogie(String name, int capacity) {
			this.name = name;
			this.capacity = capacity;
		}

		@Override
		public String toString() {
			return name + " -> " + capacity;
		}
	}

	//Goods Bogie model
	static class GoodsBogie {
		String type;
		String cargo;

		GoodsBogie(String type, String cargo) {
			this.type = type;
			this.cargo = cargo;
		}

		@Override
		public String toString() {
			return type + " -> " + cargo;
		}
	}
	
	static Bogie addBogie(String type, int capacity) throws InvalidCapacityException{
		if(capacity <= 0) throw new InvalidCapacityException("Capacity cannot be negative  or zero");
		System.out.println("Added Bogie");
		return new Bogie(type, capacity);
	}

	public static void main(String[] args) {
		// Display welcome banner
		System.out.println("==========================================");
		System.out.println(" === Train Consist Management App === ");
		System.out.println("==========================================\n");

		System.out.println("==========================================");
		System.out.println("   UC14 - Handle Invalid Bogie Capacity   ");
		System.out.println("==========================================\n");

		
		List<Bogie> bogies = new ArrayList<>();
		
		bogies.add(addBogie("First Class", 20));
		bogies.add(addBogie("Sleeper Class", 100));
		bogies.add(addBogie("First Class", 30));
		bogies.add(addBogie("First Class", 40));
		bogies.add(addBogie("First Class", -20));
		
		
		System.out.println("UC14 invalid bogie creation handling completed...");
	}
}