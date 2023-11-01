package cse12pa4student;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
	        String[] toRun = {"A", "B", "C", "D", "E", "F"};

	        int startN = 0;
	        int stopN = 15; 

	        List<Measurement> measurementsList = Measure.measure(toRun, startN, stopN);

	        String csvResults = Measure.measurementsToCSV(measurementsList);

	        System.out.println(csvResults);
	}
}
