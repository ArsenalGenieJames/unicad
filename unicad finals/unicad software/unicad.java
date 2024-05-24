import java.util.Scanner;

public class unicad {
    public static void main(String[] args) {
        Scanner guesthouse = new Scanner(System.in);
        
        String[][] secondFloor = new String[3][2]; 
        String[][] thirdFloor = new String[3][2]; 
        String[][] poolside = new String[3][2]; 
        
        System.out.println("ALMING GUEST HOUSE ILIGAN");
        System.out.println("Bry. San Miguel, Iligan City");
        System.out.println("24Hours Open!");
        System.out.println("Double Bed with Balcony, 2nd Flr  | For 2 Persons 500 PHP");
        System.out.println("Double Bed with Balcony - 3rd Flr | For 2 Persons 500 PHP");
        System.out.println("Double Bed - Pool Side            | For 2 Persons 700 PHP");
    
        System.out.print("Customer name: ");
        String name = guesthouse.nextLine();
        System.out.print("Customer age: ");
        int age = guesthouse.nextInt();
        
        if (age < 18) {
            System.out.println("Sorry, customers below 18 years old are not allowed to enter the Alming Guest House Iligan.");
            System.out.println("For more info, please contact the head manager. Thank you!");
            guesthouse.close();
            return;
        } else {
 
            System.out.println("Choose room type: ");
            System.out.println("1. Second Floor (500 PHP)");
            System.out.println("2. Third Floor (500 PHP)");
            System.out.println("3. Poolside (700 PHP)");
            System.out.print("Enter a number: ");
            int roomChoice = guesthouse.nextInt();
            
            int totalCost = 0;
            if (roomChoice == 1 || roomChoice == 2) {
                totalCost = 500;
            } else if (roomChoice == 3) {
                totalCost = 700;
            }
            

            System.out.print("Enter day of the week (1 for weekday, 2 for weekend): ");
            int dayChoice = guesthouse.nextInt();
            
            if (dayChoice == 2 && roomChoice == 1) {
                totalCost = 600;
            } else if (dayChoice == 2 && roomChoice == 3) {
                totalCost = 800;
            }
            
            System.out.println("We Accept Only  Atm  and Online Payment");
            System.out.println("List of Payment methods");
            System.out.println("1. Gcash");
            System.out.println("2. Paymaya");
            System.out.println("3. ATM Card");
            System.out.print("Enter a number: ");
            int paymentMethod = guesthouse.nextInt();
            
            if (paymentMethod == 1) {
                System.out.println("Payment method selected: Gcash");
            } else if (paymentMethod == 2) {
                System.out.println("Payment method selected: Paymaya");
            } else if (paymentMethod == 3) {
                System.out.println("Payment method selected: ATM Card");
            }else {
                System.out.println("Invalid payment method selected");
                guesthouse.close();
                return;
            }
            
            System.out.print("Enter Account number: ");
            int accountNumber = guesthouse.nextInt();
            
            System.out.print("Enter payment amount: ");
            int payment = guesthouse.nextInt();
        
  
            int changeDue = payment - totalCost;
        
 
            System.out.println("Reservation Details:");
            System.out.println("Guest Name: " + name);
            System.out.println("Room Type: " + (roomChoice == 1 ? "Second Floor" : (roomChoice == 2 ? "Third Floor" : "Poolside")));
            System.out.println("Total Cost: " + totalCost + " PHP");
            System.out.println("Change Due: " + changeDue + " PHP");
        
            guesthouse.close();
        }
    }
}



 