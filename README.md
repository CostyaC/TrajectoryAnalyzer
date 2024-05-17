# Trajectory Analyser

This is an old project I started many years ago in Pascal Programming Language, but now I've adapted it using Java and Python.
   Trajectory Analyser is a Pascal-based project that simulates the motion of a projectile and plots its trajectory. The program calculates the height and distance of a projectile at various time intervals and visualizes the trajectory using a Python script with Matplotlib. As mentioned it's based on Pascal, but using the prototype from Pascal I changed into Java. You can check all the files, so you will understand that the idea of implementation is the same, it just differs the programming language. Taking into Consideration Java is an advanced programming level language I decided to make an update for my old project, which I started it many years ago.

## Features

- Calculates the projectile's trajectory based on initial velocity and launch angle.
- Outputs the distance and height of the projectile at specified intervals.
- Plots the trajectory graph using Matplotlib.

## Getting Started

### Prerequisites

- Java JDK
- Python 3.x using library called Matplotlib
- Pascal

### Running the Java Program

1. **Compile the Java program:**
   ```bash
   javac src/PascalProject/ProjectileMotion.java

2. waiting for the user input for the following Values :

```bash

Vinit - initial Velocity
Angle - the angle to which the object is going to be thrown
dx    - parameter represents the increment in the distance x for each iteration of the loop.
```
3. Once the values are read from the keyboard an output is going to be generated and shown into the console. The output data is also saved into a file called "OUT.txt"

4. Linking Java & Visual Code

After the output data is created, the file OUT.txt has now a location into my system. After having the data into a file, now it comes to plotting the graph. For plotting the graph of the trajectory I used Visual Code as IDE but the graph itself was done by using python implementation. For locating the the output data done bu Java I've used the following line of code :

```bash
output_file_path = "C:/Users/koste/Desktop/My FolderS/MyOwnFolderS/Engineering_FoldeR/Pascal/Pascal&Java/Trajectory/OUT.txt"
```
Basically, this is the main line which tells Python where to find the data output from Java. And based on this data a graph was plotted. 

4.1. To Sum up, The main data and main code implementation were done in Java, and whenever Java outputs something different based in the user input as well, the graph will look accordingly. 

5. These are the described steps for this project I started many years ago in Pascal.






