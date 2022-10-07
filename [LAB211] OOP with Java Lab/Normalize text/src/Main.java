/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author duong
 */

public class Main {

    public static void main(String[] args) {
//        BufferedReader br = null;
        try {
            int countLine = Manager.countLine();
            int count = 1;
           BufferedReader br = new BufferedReader(new FileReader(new File("input.txt")));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt",true)));
            FileWriter file = new FileWriter("output.txt",true);
//            BufferedWriter pw = new BufferedWriter(file);
            String line;
            //write until end file
            while ((line = br.readLine()) != null) {
                //check line empty
                if (Manager.isLineEmpty(line)) {
                    continue;
                }
                line = Manager.formatOneSpace(line);
                line = Manager.formatSpecialCharacters(line);
                line = Manager.afterDotUpperCase(line);
                line = Manager.noSpaceQuotes(line);
                line = Manager.firstUpercase(line);
                line = Manager.lastAddDot(line);
                pw.write(line);
                if (count < countLine) {
                    pw.println();
                }
                count++;
            }
            br.close();
            pw.close();
            System.out.println("Normalize successful.");
        } catch (FileNotFoundException ex) {
            System.err.println("Can't not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
