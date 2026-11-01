# COS 201 — Computer Programming I

Practical exercises for COS 201 Computer Programming I.

## Student Information

- Name: David Otokhina
- Matriculation Number: 25/16254
- Programme: Computer Science
- Course: COS 201 — Computer Programming I

## Week 1: Introduction to Programming and Problem-Solving

### Practical Exercise

Created and executed my first Java programme. I then modified it to display the course code and title, my programme of study, three reasons programming is important to Computer Science, and my personal learning goal for COS 201.

### File

- `week01/FirstProgram.java`

### How to Run

Open a terminal in the `week01` directory.

- `javac FirstProgram.java`
- `java FirstProgram`

### Skills Practised

- Java class and main method
- Output statements
- Compilation and execution
- GitHub version control

Activities A, B and C (IPO components, algorithms, pseudocode and flowcharts) are written on paper, as instructed, so they are not in this repository.

## Week 3: Variables, Data Types, Expressions and Input/Output

### Objectives

- Declare and initialize Java variables.
- Use appropriate primitive and reference data types.
- Perform arithmetic calculations.
- Read keyboard input using Scanner.
- Display formatted output.
- Compile, test and submit Java programs using GitHub.

### Programs

1. `week03/SimpleCalculator.java`
   - Performs arithmetic calculations on two numbers (sum, difference, product and quotient). It checks for a zero divisor before dividing.
2. `week03/AverageCalculator.java`
   - Reads a student's name and three scores, then calculates the total and average of the three scores. It also includes the extension exercise: each score must be between 0 and 100.
3. `week03/ItemCost.java`
   - Calculates the total cost using quantity and unit price.

### How to Run

Open a terminal in the `week03` directory.

Compile and run the calculator:

- `javac SimpleCalculator.java`
- `java SimpleCalculator`

Compile and run the average calculator:

- `javac AverageCalculator.java`
- `java AverageCalculator`

Compile and run the item-cost program:

- `javac ItemCost.java`
- `java ItemCost`

### Testing

I tested each program with different valid inputs, a boundary value and an invalid input, and checked that the results match the expected calculations.

| Program | Input | Expected result |
| --- | --- | --- |
| SimpleCalculator | 45 and 9 | Sum 54.00, Difference 36.00, Product 405.00, Quotient 5.00 |
| SimpleCalculator | 7.5 and -2.5 | Sum 5.00, Difference 10.00, Product -18.75, Quotient -3.00 |
| SimpleCalculator | 12 and 0 | Quotient not calculated: "Division is undefined for a zero divisor." |
| AverageCalculator | 65, 72, 88 | Total 225.00, Average 75.00 |
| AverageCalculator | 0, 100, 50 (boundary values) | Total 150.00, Average 50.00 |
| AverageCalculator | 105, 60, 70 | "Invalid input: each score must be between 0 and 100." |
| ItemCost | Exercise book, quantity 5, unit price 450 | Total cost 2250.00 |

### Tools Used

- Java Development Kit (JDK)
- Visual Studio Code
- Git
- GitHub Desktop
- GitHub

### Learning Outcome

I practised storing values in variables of suitable data types, reading keyboard input with `Scanner`, writing arithmetic expressions, displaying formatted output with `printf()`, and testing and submitting Java programs through GitHub.
