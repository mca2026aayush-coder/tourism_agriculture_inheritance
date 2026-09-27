/**
 * Main class for Tourism and Agriculture inheritance case study.
 * @author Aayush
 */
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== TOURISM AND AGRICULTURE =====");
            System.out.println("1. Single Inheritance");
            System.out.println("2. Multiple Inheritance");
            System.out.println("3. Multilevel Inheritance");
            System.out.println("4. Hierarchical Inheritance");
            System.out.println("5. Hybrid Inheritance");
            System.out.println("6. Agriculture Tourism");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Single Inheritance ---");

                    TouristGuide guide = new TouristGuide();

                    guide.travel();
                    guide.guide();

                    break;

                case 2:
                    System.out.println("\n--- Multiple Inheritance ---");

                    FarmTour farmTour = new FarmTour();

                    farmTour.farming();
                    farmTour.tourism();

                    break;

                case 3:
                    System.out.println("\n--- Multilevel Inheritance ---");

                    Fort fort = new Fort();

                    fort.place();
                    fort.heritage();
                    fort.fort();

                    break;

                case 4:
                    System.out.println("\n--- Hierarchical Inheritance ---");

                    Wheat wheat = new Wheat();
                    Rice rice = new Rice();

                    wheat.grow();
                    wheat.wheat();

                    rice.grow();
                    rice.rice();

                    break;

                case 5:
                    System.out.println("\n--- Hybrid Inheritance ---");

                    AgroTour agroTour = new AgroTour();

                    agroTour.travel();
                    agroTour.farming();
                    agroTour.tourism();
                    agroTour.agroTour();

                    break;

                case 6:
                    System.out.println("\n--- Agriculture Tourism ---");

                    AgricultureTourism agricultureTourism =
                            new AgricultureTourism();

                    agricultureTourism.information();

                    break;

                case 7:
                    System.out.println("\nProgram ended.");

                    break;

                default:
                    System.out.println("\nInvalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}