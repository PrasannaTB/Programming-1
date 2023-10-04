package viope_8;

import java.util.Scanner;

public class ObjectsClockTimeProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ClockTime clockTime = new ClockTime();

		System.out.print("Enter hours to add: ");
		int hours = Integer.parseInt(input.nextLine());

		while (hours >= 0) {
			System.out.print("Enter minutes to add: ");
			int minutes = Integer.parseInt(input.nextLine());

			clockTime.add(hours, minutes);
			System.out.println(clockTime + "\n");

			System.out.print("Enter hours to add: ");
			hours = Integer.parseInt(input.nextLine());
		}
		input.close();
	}
}

class ClockTime {
	private int hours;
	private int minutes;

	public ClockTime() {
		this.hours = 0;
		this.minutes = 0;
	}

	public void add(int hours, int minutes) {
		if (hours < 0 || minutes < 0) {
			return;
		} 
			this.hours += hours;
			this.minutes += minutes;
		
		/*
		  this.hours += hours; this.minutes += minutes;
		  
		  this.hours += this.minutes / 60; this.minutes %= 60; this.hours %= 24;
		 */

		if (this.minutes >= 60) {
			this.hours += this.minutes / 60;
			this.minutes = this.minutes % 60;
		}

		if (this.hours >= 24) {
			this.hours = this.hours % 24;

		}

	}

	public String toString() {

		String finalHours = Integer.toString(hours);
		String finalMinutes = Integer.toString(minutes);

		if (hours < 10) {
			finalHours = "0" + hours;
		}
		if (minutes < 10) {
			finalMinutes = "0" + minutes;

		}
		String output = finalHours + ":" + finalMinutes;

		return output;
	}
	/*
	 * public String toString() { String hourString = (hours < 10) ? "0" + hours :
	 * "" + hours; String minuteString = (minutes < 10) ? "0" + minutes : "" +
	 * minutes; return hourString + ":" + minuteString; }
	 */
}