import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean options = true;
        while(options){
            System.out.println("1. Get instructor information");
            System.out.println("2. Insert a new instructor");
            System.out.println("3. Insert a new department");
            System.out.println("4. Exit");
            System.out.println("5. Get department information");
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> { // method
                     }
                case 2 -> {
                    System.out.println("Enter the instructor id:");
                    System.out.println("Enter the instructor name:");
                    System.out.println("Enter the affiliated department name:");
                }
                case 3 -> {
                    System.out.println("Enter the department name:");
                    System.out.println("Enter the location:");
                    System.out.println("Enter the budget:");
                }
                case 4 -> {
                    options = false;
                    System.out.println("Program ended...");
                }
                case 5 -> System.out.println("Enter the department name:");
                default -> System.out.println("Please choose between 1-5");
            }
        }
    }
}