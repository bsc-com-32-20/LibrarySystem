import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        boolean isInSystem = true;
        System.out.println("""
                Welcome to the Codecamp Library System

                """);
        while (isInSystem) {
            if (isInSystem) {
                System.out.println("""
                        1. Add a book
                        2. Remove a book
                        3. Display all books
                        4. Add a borrower
                        5. Remove a borrower
                        6. Display all borrowers
                        7. Exit
                        """);
                Scanner sc = new Scanner(System.in);
                try {
                    int choice = sc.nextInt();
                    if (choice == 1) {

                    } else if (choice == 2) {

                    } else if (choice == 3) {

                    } else if (choice == 4) {

                    } else if (choice == 5) {

                    } else if (choice == 6) {

                    } else if (choice == 7) {
                        isInSystem = false;
                        System.out.println("Goodbye!");
                        continue;
                    } else {
                        System.out.println("Invalid choice. Please choose a valid option.");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number.\n");
                    continue;
                }

            }
        }

    }
}
