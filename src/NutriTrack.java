import java.util.*;
import java.io.*;

public class NutriTrack {

    static ArrayList<Food> catalog = new ArrayList<>();
    static ArrayList<Food> meal = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        loadSampleFoods();
        int choice = 0;

        while (choice != 5) {
            System.out.println("\nNUTRITRACK");
            System.out.println("[1] View All Foods");
            System.out.println("[2] Search Food");
            System.out.println("[3] Add Food to Meal");
            System.out.println("[4] View Meal Summary");
            System.out.println("[5] Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: showAllFoods(); break;
                case 2: searchFood(); break;
                case 3: addFoodToMeal(); break;
                case 4: viewMeal(); break;
                case 5: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice."); 
            }
        }
    }

    //Adds food items to catalog
    public static void loadSampleFoods() {
        catalog.add(new Fruit("Apple", 52, 14, 0));
        catalog.add(new Fruit("Banana", 89, 23, 1));

        catalog.add(new Vegetable("Carrot", 41, 10, 1));
        catalog.add(new Vegetable("Broccoli", 55, 11, 4));
        

        catalog.add(new Protein("Chicken Breast", 165, 0, 31));
        catalog.add(new Protein("Egg", 78, 1, 6));
    }

    public static void showAllFoods() {
        System.out.println("\n--- FOOD CATALOG ---");
        for (Food f : catalog) {
            f.displayInfo();
        }
    }

    public static void searchFood() {
        System.out.print("\nEnter food name to search: ");
        String query = sc.nextLine().toLowerCase();

        boolean found = false;
        for (Food f : catalog) {
            if (f.getName().toLowerCase().contains(query)) {
                f.displayInfo();
                found = true;
            }
        }

        if (!found) System.out.println("No food found.");
    }

    public static void addFoodToMeal() {
        System.out.print("\nEnter food name to add: ");
        String name = sc.nextLine().toLowerCase();

        for (Food f : catalog) {
            if (f.getName().toLowerCase().equals(name)) {
                meal.add(f);
                System.out.println(f.getName() + " added to meal.");
                return;
            }
        }

        System.out.println("Food not found.");
    }

    public static void viewMeal() {
        if (meal.isEmpty()) {
            System.out.println("\nMeal is empty.");
            return;
        }

        int totalCal = 0, totalCarbs = 0, totalProtein = 0;

        System.out.println("\n--- MEAL SUMMARY ---");
        for (Food f : meal) {
            System.out.println("- " + f.getName());
            totalCal += f.getCalories();
            totalCarbs += f.getCarbs();
            totalProtein += f.getProtein();
        }

        System.out.println("\nTOTAL NUTRITION:");
        System.out.println("Calories: " + totalCal);
        System.out.println("Carbs: " + totalCarbs + "g");
        System.out.println("Protein: " + totalProtein + "g");

        saveMealToFile(totalCal, totalCarbs, totalProtein);
    }

    public static void saveMealToFile(int cal, int carbs, int protein) {
        try {
            FileWriter fw = new FileWriter("meal_summary.txt", true);
            fw.write("Meal Summary\n");
            fw.write("Calories: " + cal + "\n");
            fw.write("Carbs: " + carbs + "\n");
            fw.write("Protein: " + protein + "\n");
            fw.write("------------------------\n");
            fw.close();

            System.out.println("\nMeal saved to meal_summary.txt");
        } catch (Exception e) {
            System.out.println("Error saving file.");
        }
    }
}
