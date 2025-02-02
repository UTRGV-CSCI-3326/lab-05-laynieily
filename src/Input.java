import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Float num;
        // num = scanner.nextFloat();

        // Get User's name 
        String name;
        System.out.print("Input User's name: ");
        name = scanner.nextLine();

        //Get user's age
        int age;
        System.out.print("Input User's age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        // Get user's weight
        Float weight;
        System.out.print("Insert User's weight: ");
        weight = scanner.nextFloat();
        scanner.nextLine();

        // Get is smoker
        Boolean smoker;
        System.out.print("Does the User smoke? (true/false): ");
        smoker = scanner.nextBoolean();

        //close scanner
        scanner.close();

        //output everything back to user
        System.out.println("    User Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + "lbs");
        System.out.println("Smoker: " + smoker);
    }
}
