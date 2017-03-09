package powercalculator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PowerCalculator {
    public static void main(String[] args) throws IOException {
        String file = "input.txt";
        BufferedReader br = new BufferedReader(new FileReader(file));
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        
        ArrayList <Double> avgs = new ArrayList <Double> ();
        int count = 0;
        double sum = 0;
        
        String token = br.readLine();
        while (token != null) {
            count++;
            sum += Double.parseDouble(token);
            if (count == 5) {
                avgs.add(sum);
                count = 0;
                sum = 0;
            }
            token = br.readLine();
        }
        
        for (double i: avgs) {
            System.out.println(i);
        }
        
        br.close();
        pw.close();
    }
    
    
}
