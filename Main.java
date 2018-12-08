package org.anngudin.laba4;

import java.io.*;
import java.util.Arrays;
import org.anngudin.laba4.Ward.Ward;

public class Main {
    public static void main(String[] args) throws IOException {
        Ward[] wards = new Ward[2];
        for (int i = 0; i < 2; i++) {
            wards[i] = new Ward();
            wards[i].inputInFile();
            }
            
            Ward.outputOfFile();
            System.out.println("\nWards with avaiable seats: " + Ward.wardsWithAvaiableSeats);
    }
}
