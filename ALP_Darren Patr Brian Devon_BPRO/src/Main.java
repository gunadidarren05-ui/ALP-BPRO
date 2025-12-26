import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to the League!");
        System.out.println("Here, you're going to team up with other heroes to fight your way to the top.\n But first, time to choose your desired role!");
        System.out.println("Select your starting roles (1-5): ");
        System.out.println("1. Tank");
        System.out.println("2. Mage");
        System.out.println("3. Assassin");
        System.out.println("4. Healer");
        System.out.println("5. Fighter");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                //;
                break;
            case 2:
                //;
                break;
            case 3:
                //;
                break;
            case 4:
                //;
                break;
            case 5:
                //;
                break;
            default: System.out.println("Invalid choice. Please try again.");


        }
    }
}
