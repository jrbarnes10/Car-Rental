import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MainV2 {

	public static int inputInt(Scanner keyboard){
	        try{
	            return keyboard.nextInt();
	        } catch (InputMismatchException e){
				System.out.println("Please enter a number");
	            keyboard.next();
	            return inputInt(keyboard);
	        }
	}

	public static void main(String[] args) {

		// Instantiate carList
		ArrayList<Car> carList = new ArrayList<Car>();

		// Create car objects.
		Car car1 = new Car("Chevy", "Malibu", Car.Category.HYBRID, 49);
		Car car2 = new Car("Chevy", "Volt", Car.Category.HYBRID, 43);
		Car car3 = new Car("Volkswagen", "Eos", Car.Category.COUPE, 22);
		Car car4 = new Car("Nissan", "GTR", Car.Category.COUPE, 16);
		Car car5 = new Car("Ford", "Mustang", Car.Category.COUPE, 18);
		Car car6 = new Car("Nissan", "Sentra", Car.Category.SEDAN, 32);
		Car car7 = new Car("Ford", "Fusion", Car.Category.SEDAN, 22);
		Car car8 = new Car("Nissan", "Maxima", Car.Category.SEDAN, 21);
		Car car9 = new Car("Dodge", "Durango", Car.Category.SUV, 21);
		Car car10 = new Car("Nissan", "Xterra", Car.Category.SUV, 16);
		Car car11 = new Car("Honda", "Odyssey", Car.Category.VAN, 22);
		Car car12 = new Car("Ford", "Escape", Car.Category.CROSSOVER, 21);
		Car car13 = new Car("Nissan", "Juke", Car.Category.CROSSOVER, 28);
		Car car14 = new Car("Honda", "HR-V", Car.Category.CROSSOVER, 25);
		Car car15 = new Car("Ford", "Raptor", Car.Category.TRUCK, 19);

		// Add car objects.
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(car4);
		carList.add(car5);
		carList.add(car6);
		carList.add(car7);
		carList.add(car8);
		carList.add(car9);
		carList.add(car10);
		carList.add(car11);
		carList.add(car12);
		carList.add(car13);
		carList.add(car14);
		carList.add(car15);

		/* --Prints information out--
		for (Iterator<Car> iterator = carList.iterator(); iterator.hasNext();) {
	        System.out.println(iterator.next());
	        }
		*/

		// Variables for user input.
		int passengers, days, approxMiles;
		Scanner sc = new Scanner(System.in);

		// Get passenger information from user.
		System.out.println("How many passengers are going (including the driver)?");
		passengers = inputInt(sc);

		// Handle erroneous input.
		while (passengers < 1 || passengers > 7) {
			System.out.println("Please enter a valid # of passengers, between 1 and 7.");
			passengers = inputInt(sc);
		}

		// Get # of days user is renting car.
		System.out.println("How many days will you rent the car for?");
		days = inputInt(sc);;

		// Handle erroneous input.
		while (days <= 0) {
			System.out.println("Please enter a valid # of days, greater than 0.");
			passengers = inputInt(sc);
		}

		// Get approximate mileage from user.
		System.out.println("How many miles, approximately, will you drive the car?");
		approxMiles = inputInt(sc);

		// Handle erroneous input.
		while (approxMiles <= 0) {
			System.out.println("Please enter a valid # of miles, greater than 0.");
			approxMiles = inputInt(sc);
		}

		// Print out cars that match user input.
		System.out.println("Great! Here are the cars that fit these requirements ... ");
		System.out.println("Passengers: " + passengers + "\nDays: " + days + "\nMiles: " + approxMiles);
		System.out.println("---------------------------------");

		ArrayList<Car> potentialCars = new ArrayList<Car>();

		for (int i = 0; i < carList.size(); i++)
		{
			if(carList.get(i).seats >= passengers)
			        potentialCars.add(carList.get(i));
		}


		System.out.println("Here are the cars we have available");
		System.out.println("---------------------------------");

		for (int i = 0; i <  potentialCars.size(); i++)
		{
			System.out.print(potentialCars.get(i));
			System.out.println("The comfort level is: " + potentialCars.get(i).comfortLevel);
			System.out.println("The cost is: " + ((potentialCars.get(i).costPerDay * days) + (2.25 * approxMiles)) + "\n");
		}



	}

}
