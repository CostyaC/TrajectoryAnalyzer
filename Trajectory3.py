import matplotlib.pyplot as plt

# Read trajectory data from the output file
output_file_path = "C:/Users/koste/Desktop/My FolderS/MyOwnFolderS/Engineering_FoldeR/Pascal/Pascal&Java/Trajectory/OUT.txt"
x_values = []
h_values = []

with open(output_file_path, 'r') as file:
    lines = file.readlines()

for line in lines:
    parts = line.split("...!...")
    if len(parts) >= 3:
        try:
            distance = float(parts[1])  # Distance
            height = float(parts[2])  # Height
            x_values.append(distance)
            h_values.append(height)
        except ValueError:
            print("Error parsing line: ", line)
    else:
        print("Invalid line format: ", line)

# Plot trajectory
plt.plot(x_values, h_values, marker='o', linestyle='-')
plt.xlabel('Distance (m)')
plt.ylabel('Height (m)')
plt.title('Trajectory Graph')
plt.xticks(range(0, int(max(x_values)) + 1, 1))  # Adjust x-axis tick marks
plt.yticks(range(int(min(h_values)) - 1, int(max(h_values)) + 2, 1))  # Adjust y-axis tick marks
plt.axhline(0, color='black', linewidth=0.5)  # Add x-axis line at y=0
plt.axvline(0, color='black', linewidth=0.5)  # Add y-axis line at x=0
plt.grid(True)
plt.show()
