package com.javatutorialspot;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main(String args[]) {
		Collection<String> col1= new ArrayList<String>();
		col1.add("ABC");
		col1.add("XYZ");
		col1.add("DEF");
		System.out.println("Before ::"+col1);
		col1.remove(0);
		System.out.println("After ::"+col1);
		
	}
}
