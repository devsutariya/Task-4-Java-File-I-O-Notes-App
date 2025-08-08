📒 Java Notes App – Task 4
📌 Overview
This project is a text-based Notes Manager developed as part of Task 4 for the Java Developer Internship.
It demonstrates Java File I/O, exception handling, and basic console-based user interaction.

Users can:

✍ Write and save new notes

📖 View previously saved notes

🚪 Exit the application

🛠 Technologies Used
Java (JDK 8 or later)

FileWriter – writing notes to a file

FileReader & BufferedReader – reading notes from a file

Exception Handling – to manage runtime errors safely

📂 Features
Write Notes

Type multiple lines of text into the console

Save notes in append mode (keeps old notes intact)

Type END to stop writing

View Notes

Read all stored notes from the file

Notes separated with a ---- divider

Error Handling

Handles invalid menu input (NumberFormatException)

Displays user-friendly error messages for IOException

Warns if no notes exist yet

📜 How It Works
Notes are stored in a file named notes.txt in the same directory

Uses try-with-resources for automatic resource management

Append mode prevents overwriting existing data
