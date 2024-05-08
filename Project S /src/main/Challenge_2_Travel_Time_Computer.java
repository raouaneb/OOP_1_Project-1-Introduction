// Algorithm 2 : Simple Travel-Time Computer
// This program calculates the time it takes for a spaceship to travel a given distance.
// Then, it takes the user's input for the distance(km) between Earth and the extraterrestrial body.
// It calculates the time it would take for Project-S to reach the destination in hours, considering the speed of 28,000mi/h converted to km/h of the vehicle.
// Then, it converts the travel time to Earth-based days, rounding to the nearest day.
// Finally, it displays the estimated travel time in Earth days and a closing message.

package Challenge_2_Travel_Time_Computer;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		// Declare variables to store distance, time in hours, and time in Earth days
		double distance;
		double time_hours;
		int time_earth_days;

		// Display of a welcome message
		System.out.println("Project-S Simple Travel-Time Computer:\n++++++++++++++++++++++++++++++++++++++\n");

		// Prompt the user to enter the distance in kilometers
		System.out.println("Please enter the distance (in km) between the Earth and the extraterrestrial body:");
		Scanner scanner = new Scanner(System.in);
		distance = scanner.nextDouble();

		// Close the scanner
		scanner.close();

		// Calculate the time in hours based on the given speed (28000 mi/h) and convert to Earth days
		time_hours = distance / (28000 * 1.60934);
		time_earth_days = (int) (time_hours / 24 + 0.5);

		// Display the calculated travel time in Earth days
		System.out.print("Project-S spaceship, constantly travelling at 28000mi/h, will take approximately\n" + time_earth_days + " 'Earth-based days' to get to its foreknown extraterrestrial destination.\n");

		// Display of a complimentary-close message
		System.out.println("\nThank you for your contribution to Project-S.");
	}
}
