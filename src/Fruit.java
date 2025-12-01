public class Fruit extends Food {

    public Fruit(String name, int calories, int carbs, int protein) {
        super(name, calories, carbs, protein);
    }

    @Override
    public void displayInfo() {
        System.out.println("[FRUIT]");
        super.displayInfo();
        System.out.println();
    }
}
