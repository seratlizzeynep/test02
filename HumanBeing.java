package lab041;

public class HumanBeing implements Behavior{

	private String name;
    private int birthYear;
    private int dailyStep;
    private static int worldPopulation = 0; 


    public HumanBeing(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.dailyStep = 0; 
        worldPopulation++; 
        }

   
    @Override
    public String tellName() {
        return name;
    }

    
    @Override
    public int tellAge() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - birthYear;
    }

  
    @Override
    public int step(int actualDailyStep) {
        dailyStep = dailyStep+ actualDailyStep;
        return dailyStep;
    }

    public static int getWorldPopulation() {
        return worldPopulation;
    }

    @Override
    public String toString() {
        return "Name : " + tellName() + ", Age : " + tellAge() + ", Step : " + dailyStep;
    }
}
	

