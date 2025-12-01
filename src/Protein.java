public class Protein extends Food {

    public Protein(String name, int calories, int carbs, int protein) {
        super(name, calories, carbs, protein);
    }

    @Override
    public void displayInfo() {
        System.out.println("[PROTEIN]");
        super.displayInfo();
        System.out.println();
    }
}
