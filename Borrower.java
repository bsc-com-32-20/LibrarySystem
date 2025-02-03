import java.util.ArrayList;
import java.util.Scanner;

public class Borrower {
    String name;
    int age;
    String id;
    final int MIN_DAYS = 5;
    final int NORMAL_DAYS = 10;
    final int MAX_DAYS = 30;
    static ArrayList<Borrower> borrowers = new ArrayList<Borrower>(); 

    public Borrower(String name) {
        this.name = name;
        userAge();
        userId();
    }


    public void userAge() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your age: ");
            try{
                this.age = scanner.nextInt();
                if(this.age <= 0 || this.age > 80) {
                    System.out.println("Age out of range");
                    continue;
                }
                else if(this.age < 18) {
                    System.out.println("You are allowed to borrow books for" + MIN_DAYS + " days. Please return in "+ " days");
                    break;
                }
                else if(this.age >= 18 && this.age < 25) {
                    System.out.println("You are allowed to borrow books for" + NORMAL_DAYS + " days.");
                    break;
                }
                else{
                    System.out.println("You are allowed to borrow books for" + MAX_DAYS + " days.");
                    break;
                }
            }
            catch(Exception e) {
                System.out.println("Invalid input");
                continue;
            }
            
        }
        
    }

    public String userId() {
        String date = "03022025_";
        int id = (int) (Math.random() * 1000000);
        this.id = date + id;
        return this.id;
    }
    public void addBorrower(Borrower borrower) {
        borrowers.add(borrower);
    }
    public static ArrayList<Borrower> getBorrowers() {
        return borrowers;
    }
}
