package cse12pa4student;

import java.util.List;
import java.util.ArrayList; 
import static cse12pa4mysteries.Mysteries.*;

public class Measure {


	public static List<Measurement> measure(String[] toRun, int startN, int stopN) {
		/** TODO **/
		List<Measurement> measurements = new ArrayList<>();

        for (String method : toRun) {
            for (int n = startN; n <= stopN; n++) {
                long startTime = System.nanoTime();
                
                switch(method) {
                    case "A":
                        mysteryA(n);
                        break;
                    case "B":
                        mysteryB(n);
                        break;
                    case "C":
                        mysteryC(n);
                        break;
                    case "D":
                        mysteryD(n);
                        break;
                    case "E":
                        mysteryE(n);
                        break;
                    case "F":
                        mysteryF(n);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid method: " + method);
                }

                long endTime = System.nanoTime();
                measurements.add(new Measurement(method, n, endTime - startTime));
            }
        }
        return measurements;
    }

	

	public static String measurementsToCSV(List<Measurement> toConvert) {
		/** TODO **/
		StringBuilder csvBuilder = new StringBuilder();
        csvBuilder.append("name,n,nanoseconds\n");
        for (Measurement measurement : toConvert) {
            csvBuilder.append(measurement.name).append(",")
                      .append(measurement.valueOfN).append(",")
                      .append(measurement.nanosecondsToRun).append("\n");
        }
        return csvBuilder.toString();
	}
	
	/* Add any helper methods you find useful */
		
}
