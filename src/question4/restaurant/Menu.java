package question4.restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Menu {
	
	private static List<MenuItem> menuList;
	
	public static void main(String[] args) {
		menuList = new ArrayList<>();
		
		menuList.add(new MenuItem("Rice", "Main", 10.99));
		menuList.add(new MenuItem("Soup", "Sides", 20.99));
		menuList.add(new MenuItem("Chicken Curry", "Main", 55.99));
		menuList.add(new MenuItem("Lime Juice", "Drinks", 21.00));
		menuList.add(new MenuItem("Salad", "Sides", 15.50));
		
        Collections.sort(menuList);
        System.out.println("Menu sorted by Category.");
        menuList.forEach(System.out::println);

        Collections.sort(menuList, Comparator.comparing(MenuItem::getName));
        System.out.println("Menu sorted by Name.");
        menuList.forEach(System.out::println);

        Collections.sort(menuList, Comparator.comparingDouble(MenuItem::getPrice));
        System.out.println("Menu sorted by Price.");
        menuList.forEach(System.out::println);
	}

}
