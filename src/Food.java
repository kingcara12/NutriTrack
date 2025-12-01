public class Food {
    protected String name;
    protected int calories;
    protected int carbs;
    protected int protein;

    public Food(String name, int calories, int carbs, int protein) {
        this.name = name;
        this.calories = calories;
        this.carbs = carbs;
        this.protein = protein;
    }

    // Method that can be overridden
    public void displayInfo() {
        System.out.println("Food: " + name);
        System.out.println("Calories: " + calories);
        System.out.println("Carbs: " + carbs + "g");
        System.out.println("Protein: " + protein + "g");
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getProtein() {
        return protein;
    }
}
