package PascalProject;

import java.io.*;

public class ProjectileMotion {
	
	public static void main(String[] args) {
		double Vinit, Angle, dx, x, y1, y2, h, z;
        int i, s;
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("OUT.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Input parameters
            System.out.print("Vinit=");
            Vinit = Double.parseDouble(reader.readLine());
            System.out.print("Angle=");
            Angle = Double.parseDouble(reader.readLine());
            System.out.print("dx=");
            dx = Double.parseDouble(reader.readLine());

            h = 0;
            x = 0; // Start x from 0
            i = 0;
            System.out.println("Num...!...x...!...h...");

            // Calculate trajectory until projectile hits the ground
            do {
                i++;
                double radAngle = Math.toRadians(Angle);
                double cosAngle = Math.cos(radAngle);
                double sinAngle = Math.sin(radAngle);
                
                z = x / (Vinit * cosAngle); // Time of flight for the x distance
                y1 = Vinit * z * sinAngle; // Vertical component of the distance due to the initial velocity
                y2 = 9.8 * z * z / 2; // Vertical distance due to gravity
                h = y1 - y2; // Total height at distance x
                
                writer.println(i + "...!..." + String.format("%.2f", x) + "...!..." + String.format("%.2f", h));
                System.out.println(i + "...!..." + String.format("%.2f", x) + "...!..." + String.format("%.2f", h));
                
                x += dx;
            } while (h >= 0); // Loop until the projectile hits the ground
            
            s = i; // Total number of iterations

            // Write total number of iterations to OUT.txt
            writer.print(s);
            System.out.println("Output saved to 'OUT.txt'.");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
	
	
	
	
	

}
