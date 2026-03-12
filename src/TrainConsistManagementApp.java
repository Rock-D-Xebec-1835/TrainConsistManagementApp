
import java.util.*;
import java.util.stream.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Use Case 15: Safe Cargo Assignment using try-catch-finally
 *
 * Description:
 * This class safely assigns cargo to goods bogies
 * while handling unsafe combinations using structured exception
 * handling blocks.
 *
 * At this stage, the application:
 * - Defines a custom RuntimeException
 * - Validates cargo assignment rules
 * - Throws exception for unsafe cargo
 * - Catches and handles the exception
 * - Executes finally block for logging
 *
 * This maps runtime safety handling using try-catch-finally
 *
 * @author Developer
 * @version 15.0
 */

public class TrainConsistManagementApp {
	// Custom Exception
	static class CargoSafetyException extends RuntimeException{
		public CargoSafetyException(String message) {
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
		static Map<String, String> cargoMap = new HashMap<>();

		GoodsBogie(String type, String cargo) {
			this.type = type;
			this.cargo = cargo;
		}

		@Override
		public String toString() {
			return type + " -> " + cargo;
		}
		
		
	}
	
	public static void populate(Map<String, String> cargoMap) {
		cargoMap.put("Rectangle", "Grain");
		cargoMap.put("Cylinder", "Petrol");
		cargoMap.put("Open", "Coal");
	}
	
	
	static GoodsBogie addBogie(String type, String cargo) {

	    String rule = GoodsBogie.cargoMap.get(type);

	    if(rule == null || !rule.equals(cargo)) {
	        throw new CargoSafetyException(
	                "Unsafe cargo assignment: " + type + " cannot carry " + cargo
	        );
	    }

	    return new GoodsBogie(type, cargo);
	}

	public static void main(String[] args) {
		// Display welcome banner
		System.out.println("==========================================");
		System.out.println(" === Train Consist Management App === ");
		System.out.println("==========================================\n");

		System.out.println("==========================================");
		System.out.println("   UC14 - Handle Invalid Bogie Capacity   ");
		System.out.println("==========================================\n");

		
		List<GoodsBogie> bogies = new ArrayList<>();
		populate(GoodsBogie.cargoMap);
		
		try {

		    bogies.add(addBogie("Cylinder", "Petrol"));
		    bogies.add(addBogie("Box", "Grain"));   // invalid
		    bogies.add(addBogie("Open", "Coal"));

		} catch (CargoSafetyException e) {

		    System.out.println("ERROR: " + e.getMessage());

		} finally {

		    System.out.println("Cargo assignment attempt completed.");
		}
		
		System.out.println("UC14 invalid bogie creation handling completed...");
	}
}