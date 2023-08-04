package com.order;

import java.util.Comparator;
import java.util.stream.Collectors;

public class CollectorsMaxBy {

	public static void main (String [] args) {
		
		System.out.println("Max GPA:"+StudentDatabase.getAllStudents().stream().max(Comparator.comparing(Student::getGpa)).get());
		System.out.println("Max GPA:"+StudentDatabase.getAllStudents().stream().collect(Collectors.maxBy(Comparator.comparing(Student::getGpa))).get());
	}
}
