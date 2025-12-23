import java.util.ArrayList;

public class Main {
    private static final ArrayList <Team> characterList = new ArrayList<>();
    public static void main(String[] args) {
        printMenu();
        
    }
    private static void printMenu() {
        System.out.println("=================================");
        System.out.println("WELCOME TO THE LEAGUE!");
        System.out.println("=================================");
        System.out.println("Here, you are going to enter a tournament and fight your way to the top with other characters.\n But first, let's choose a role that suits you!");
        System.out.println("Select your role:");
        System.out.println("1. Tank");
        System.out.println("2. Fighter");
        System.out.println("3. Mage");
        System.out.println("4. Assassin");
        System.out.println("5. Healer");
        System.out.println("Pick your option (1-5): ");
    }
}
