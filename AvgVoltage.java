package avgvoltage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AvgVoltage {

    public static void main(String[] args) throws IOException {
        File dir = new File("/home/alice/NetBeansProjects/AvgVoltage/Resources");
        double[] array = new double[360];

        for (File file : dir.listFiles()) {
            Scanner s = new Scanner(file);

            //System.out.println(array[i]);
            for (int j = 0; j < 360; j++) {
                array[j] += s.nextDouble();
            }
            s.close();
        }

        for (double i : array) {
            i = i / 4.0;
            System.out.println(i);
        }
        
        //run PowerCalculator.java
    }

}
