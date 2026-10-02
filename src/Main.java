public class Main {
    public static void main(String[] args) {
        //Declarations
        String affiliation;

        //User Prompt
        System.out.println("Enter your party affiliation (D, R, or I).");

        //User Input Simulation
        System.out.println("G");
        affiliation = "G";

        //Calculations and Output to User
        if (affiliation == "D") {
            System.out.println("You get a Democratic Donkey!");
        } else if (affiliation == "R") {
            System.out.println("You get a Republican Elephant!");
        } else if (affiliation == "I") {
            System.out.println("You get an Independent Person!");
        } else {
            System.out.println("You get Other!");
        }
    }
}