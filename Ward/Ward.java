package org.anngudin.laba4.Ward;

//посчитать общее колво мест и колво палат со свободными койками
import java.io.*;
import java.util.Arrays;

public class Ward {
    public int seatsNumber;
    public static int wardsWithAvaiableSeats = 0;
    public String doctorsName;
    public boolean seatsAvaiability;

    public Ward() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nThe number of seats in this ward: ");
        this.seatsNumber = Integer.parseInt(input.readLine());
        System.out.println("\nDoctor's name: ");
        this.doctorsName = input.readLine();
        System.out.println("\nThere are some avaiable seats in this ward. Enter true or false ");
        this.seatsAvaiability = Boolean.valueOf(input.readLine());
    }

    public void inputInFile() throws IOException {
        File file = new File("laba4.txt");

        FileWriter writer;
        writer = new FileWriter(file, true);
        writer.append("\nThe number of seats in this ward: " + this.seatsNumber);
        writer.append("\nDoctors name: " + this.doctorsName);
        if (this.seatsAvaiability) {
            writer.append("\nThere are some avaiable seats in this ward.\n");
            wardsWithAvaiableSeats++;
        } else
            writer.append("\nThere are no avaiable seats in this ward.\n");
        writer.flush();
        writer.close();

    }

    public static void outputOfFile() {
        try (FileReader reader = new FileReader("laba4.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // public static void inputIF() throws IOException {
    // File file = new File("laba4.txt");

    // FileWriter writer;
    // writer = new FileWriter(file, true);
    // writer.append("\nAll seats number:" + allSeatsNumber);
    // }
}
