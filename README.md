# 📒 Java Notes App – Task 4

## 📌 Overview
This is a simple **text-based Notes Manager** created as part of **Task 4** for the Java Developer Internship.  
It demonstrates **Java File I/O**, **exception handling**, and **basic console interaction**.  

Users can:
- ✍ **Write new notes** (saved to a text file)
- 📖 **View existing notes**
- 🚪 **Exit** the application

---

## 🛠 Technologies Used
- **Java** (JDK 8+)
- **FileWriter** – for writing notes to a file
- **FileReader** & **BufferedReader** – for reading notes from a file
- **Exception Handling** (`IOException`, `NumberFormatException`)

---

## 📂 Features
1. **Write Notes**
   - Type notes into the console
   - Saves notes in append mode (existing notes are preserved)
   - Type `END` to finish writing

2. **View Notes**
   - Reads and displays all saved notes
   - Separates notes with a delimiter line (`----`)

3. **Error Handling**
   - Handles invalid menu choices
   - Catches and handles file read/write errors
   - Notifies user if no notes are found

---

## 📜 How It Works
- Notes are stored in a file called **`notes.txt`** in the project folder
- Uses **try-with-resources** for automatic resource management
- Prevents overwriting of existing notes by using append mode

---

## 📌 Example Output
===== Notes App =====
1. Write Note
2. View Notes
3. Exit
Enter your choice: 1
Enter your note (type 'END' on a new line to finish):
This is my first note.
END
Note saved successfully!

---

## 📚 Concepts Learned
File I/O operations in Java
Difference between FileReader and BufferedReader
Append vs overwrite mode in file writing
Exception handling in Java
Using try-with-resources for safe file handling

