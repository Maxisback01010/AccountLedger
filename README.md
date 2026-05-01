# Welcome to Your Bank!

A simple Java console-based banking ledger application that allows users to view and filter transactions stored in a CSV file.

---

## Project Overview

This application reads transaction data from a file and allows the user to interact with it through a menu system. The goal was to practice core Java concepts like file reading, object-oriented design, and working with user input.

---

## Features

- View all transactions  
- View deposits (amount > 0)  
- View payments (amount < 0)  
- Filter transactions by date  
- Read transaction data from a CSV file  

---

## Project Structure

Main.java  
Handles:
- Reading the CSV file  
- Storing transactions in a list  
- Displaying the menu  
- Handling user input  
- Filtering transactions  

Transaction.java  
Represents a single transaction and stores:
- Date  
- Time  
- Description  
- Vendor  
- Amount  

Methods used:
- getAmount()  
- getDate()  
- toString()  

---

## Design Decisions

I chose to keep this project simple and focused by using only two classes.

- Transaction handles the data  
- Main handles the logic  

Some projects use multiple classes, but for this size of application, that would have added complexity without much benefit. Keeping everything in Main made it easier to build, debug, and understand what was happening step by step.

If this project were expanded, I would separate logic into additional classes.

---

## File Format

The application reads from transactions.csv using this format:

YYYY-MM-DD|HH:MM:SS|Description|Vendor|Amount  

Example:

2026-04-27|14:30:00|TestDeposit|Test|100.00  
2026-04-30|15:45:00|Software|Gamestop|-82.75  

---

## How to Run

1. Make sure transactions.csv is in the project root directory  
2. Open the project in IntelliJ  
3. Run Main.java  
4. Use the menu to select options  

---

## Logo

A custom logo is included in the project files.

Since this is a console application, images cannot be displayed directly in the terminal, so the logo is stored as an external instead.

---

## Challenges

This project definitely had a few frustrating moments, but they helped me understand what was actually going on.

- File path issues  
  The CSV file was not being read correctly at first because it was in the wrong location. Once it was moved to the correct directory, the program worked as expected.

- Scanner input issues  
  Using nextInt() caused input problems when switching to nextLine(). This was fixed by clearing the buffer before reading the date.

- Data confusion  
  I created a test transaction in the code and expected it to show up in the results, but it wasn’t being saved to the CSV. I realized the program only reads from the file and does not write to it.

- Debugging logic  
  Some filters were using the wrong conditions, which caused incorrect results. Fixing those helped reinforce how the logic actually works.

---

## What I Learned

- How to read and parse data from a file  
- How to use classes to represent real-world data  
- How to build a menu-driven program  
- How small syntax issues can break everything  
- How to debug step by step instead of guessing  

---

## Future Improvements

- Add the ability to create and save new transactions  
- Improve input validation  
- Separate logic into additional classes  
- Add a graphical interface instead of console output  

---

## Final Thoughts

This project helped me understand how different parts of a program connect. It also made me a lot more comfortable debugging and working through issues instead of getting stuck.
