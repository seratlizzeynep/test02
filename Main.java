package lab041;

public class Main {
    public static void main(String[] args) {
        // Create first HumanBeing object
        HumanBeing kamil = new HumanBeing("kamil", 1990);
        kamil.step(5000); // Add steps
        System.out.println(kamil); // Display information

        // Create second HumanBeing object
        HumanBeing hayri = new HumanBeing("hayri", 1980);
        System.out.println(hayri); // Display information without steps

        // Display world population
        System.out.println("World Population : " + HumanBeing.getWorldPopulation());
    }
}
 