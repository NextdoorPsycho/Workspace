package com.psycho.dumblefloor.trash;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;

public class garbage {
	//
	// NEEDED BIT \/\/\/
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// YOU ALWAYS NEED THIS ^^^
		//
		//
		SecondClass second = new SecondClass();
		second.test();
		// A r a y s
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		System.out.println(numbers[5]);
		// Calling an array
		// ------------
		// ArrayList!
		// {String for a reason}
		//
		//
		//
		// ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		list.add("Car0"); // 0
		list.add("Car1"); // 1
		list.add("Car2"); // 2
//ADD / Remove shit
		list.remove("Car");
		if (list.contains("Car")) {
			list.remove("Car");
		} else {
			// else garbage
		}
		// H A S H M A P S
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Test");
		map.put(21, "Te2st");
		map.put(31, "Tes4t");
		map.put(14, "Test1");

		// See Array to remove garbage
		if (map.containsValue("Test")) {
			map.remove("Test");
			
			System.out.println(map.values());	
			if(map.values().contains("test")) {
				System.out.println("True");
			} else { 
				System.out.println("False");
			}
			
			
			// C A L E N D A R
			Calendar cal = Calendar.getInstance();
			cal.set(0, 0);
			System.out.println();
			
			// N U M B E R S
			@SuppressWarnings("unused")
			Random random = new Random();
		}
	}
}