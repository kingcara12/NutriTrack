public class Vegetable extends Food {

    public Vegetable(String name, int calories, int carbs, int protein) {
        super(name, calories, carbs, protein);
    }

    @Override
    public void displayInfo() {
        System.out.println("[VEGETABLE]");
        super.displayInfo();
        System.out.println();
    }
}
