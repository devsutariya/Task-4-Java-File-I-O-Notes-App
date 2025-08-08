import java.io.*;
import java.util.Scanner;

public class NotesApp {
    private static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Notes App =====");
            System.out.println("1. Write Note");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        writeNote(sc);
                        break;
                    case 2:
                        readNotes();
                        break;
                    case 3:
                        System.out.println("Exiting... Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                choice = 0;
            }
        } while (choice != 3);

        sc.close();
    }

    private static void writeNote(Scanner scanner) {
        System.out.println("Enter your note (type 'END' on a new line to finish):");
        StringBuilder note = new StringBuilder();
        String line;

        while (!(line = scanner.nextLine()).equalsIgnoreCase("END")) {
            note.append(line).append(System.lineSeparator());
        }

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) { 
            writer.write(note.toString());
            writer.write("----\n");
            System.out.println("Note saved successfully!");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void readNotes() {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            System.out.println("No notes found. Create one first.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("\n--- Your Notes ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("------------------");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
