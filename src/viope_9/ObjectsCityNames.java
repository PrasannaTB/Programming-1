package viope_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ObjectsCityNames {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<String> cityList = new ArrayList<String>();

		while (true) {

			System.out.print("Enter city name: ");
			String input1 = input.nextLine();
			
			if(input1.equals("quit")) {
				break;
			}
			
			cityList.add(input1);
		}
		System.out.println("");
		
		Collections.sort(cityList);
		cityList.replaceAll(String::toUpperCase);
		
		cityList.forEach(System.out::println);
		input.close();
	}

}
