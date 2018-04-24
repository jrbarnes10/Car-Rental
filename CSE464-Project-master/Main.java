import java.util.*;


public class Main {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		
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
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Cars in list: " + carList);
		}

	}

}
