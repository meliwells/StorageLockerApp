//import java utilities - scanner, random (for locker PINS)

import java.util.Scanner;

public class StorageLockerApp {
    public static String[] lockerId = {"1A", "2B", "3C", "4D", "5E", "6F", "7G", "8H", "9I", "10J"};
    public static String[] lockerPin = {"1111", "2222", "3333", "4444", "5555", "6666", "7777", "8888", "9999", "0000"};
    public static boolean[] lockerAvailable = {true, true, true, true, true, true, true, true, true, true};
    //Establish variable for 10 lockers
    public static int totalAvailableLockers = 10;
    java.util.Scanner console = new java.util.Scanner(System.in);

    public static void main(String[] args) {
      while(true) {
          displayMainMenu();
          getAvailableLocker();
          int menuChoice = getChoice();
          if (menuChoice == 1) {
              rentLocker();
          }
      }
/*
-create variable
-call method

1. Display the main menu.
    a. Rent
    b. Access
    c. Release
    d. Any other key to exit

   2. User rents a locker
    -Check for 1st available locker

    -Provide PIN number (make random once code works)
    -Print a thank you with the locker number and PIN
    -Display the main menu

   3. User accesses a locker
    -Enter the locker number
    -If the locker is rented, ask for pin. If the locker is not rented, ask for locker number again.
    -Enter the locker PIN
    -If the PIN is correct, open locker and print success message. If PIN is not correct, ask for PIN again
    -Display the main menu

   4. User releases a locker
    -Access the locker (Step 3)
    -Confirm user is sure to release locker
    -If sure, release locker. If not sure, display locker has not been released and go back to main menu.

   5. User exits
    -Exit application
*/

    }

    //Methods -
    public static void displayMainMenu(){
        System.out.println("What would you like to do next?\n");
        if (getAvailableLocker() != -1) {
            System.out.println("1. Rent A Locker");
        }

        System.out.println("2. Access a Locker\n3. Release a Locker\n ---\nAny other Key to Exit");

    }
        /*
        - "What would you like to do next?"
        - If locker available print: 1. Rent a locker
        - 2. Access locker
        - 3. Release locker
        ---
        Any other key to exit
        */
    //getChoice() (for main menu)
    public static int getChoice() {
        Scanner console = new Scanner(System.in);
        return Integer.parseInt(console.nextLine());
    }

    //rentLocker()
    public static void rentLocker() {
        int firstAvailableLocker = getAvailableLocker();
        System.out.println(" Locker: " + lockerId[firstAvailableLocker] + "\nPIN Number: "  + lockerPin[firstAvailableLocker]
                + "\nThank you for renting!");
        lockerAvailable[firstAvailableLocker] = false;
    }
    //accessLocker()
    //releaseLocker()
    //getAvailableLocker()
    public static int getAvailableLocker() {
        int firstAvailableLocker = -1;
        for (int i = 0; i < lockerAvailable.length; i++) {
            if (lockerAvailable [i]) {
                return i;
                }
            }

        return firstAvailableLocker;
    }
    //generatePin()
    //printReceipt()
    //isLockerNumberValid()
    //getLockerNumber()
    //openLocker()
    //releaseLocker()
}