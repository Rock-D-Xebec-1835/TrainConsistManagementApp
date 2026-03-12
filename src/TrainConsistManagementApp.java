import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistManagementApp {
	/*
	 * MAIN CLASS - UseCase12TrainManagementApp
	 *
 *
 * Use Case 12: Safety Compliance check for Goods Bogies
 *
 * Description:
 * This class enforces domain safety rules on goods bogies.
 *
 * At this stage, the application:
 * - Creates goods bogie list
 * - Converts list into stream
 * - Applies safety validation rule
 * - Checks compliance using allMatch()
 * - Displays safety status
 *
 * This maps real-world cargo safety rules using Streams.
 * 
 * @author Developer
 * @version 12.0
 */

	static class GoodsBogie{
		private String type;
		private String cargo;
		
		public GoodsBogie(String type, String cargo) {
			this.type = type;
			this.cargo = cargo;
		}
		
		public String getType() {
			return this.type;
		}
		
		public String getCargo() {
			return this.cargo;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Display welcome message
		System.out.println("I=========================================================I");
		System.out.println("||   UC - 12 Safety Compliance check for Goods Boogies   ||");
		System.out.println("I=========================================================I\n");
		
		
		List<GoodsBogie> trainConsist = new ArrayList<>();
		
		trainConsist.add(new GoodsBogie("Cylindrical", "Petrol"));
		trainConsist.add(new GoodsBogie("Open", "Coal"));
		trainConsist.add(new GoodsBogie("Box", "Grain"));
		//trainConsist.add(new GoodsBogie("Cylindrical", "Coal"));
		
		for(GoodsBogie bogie : trainConsist) {
			System.out.println(bogie.getType() + " -> " + bogie.getCargo());
		}

		boolean isSafe = trainConsist.stream()
				.allMatch(b -> (b.getType().equals("Cylindrical") && b.getCargo().equals("Petrol"))
						|| (b.getType().equals("Open") && b.getCargo().equals("Coal"))
						|| (b.getType().equals("Box") && b.getCargo().equals("Grain"))
						);
		
		System.out.println(isSafe ? "\nSafety Compliance Status: " + isSafe + "\nTrain formation is SAFE" : "Safety Compliance Status: " + isSafe + "\nTrain formation is NOT SAFE");
		
	}
}
