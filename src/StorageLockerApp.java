//import java utilities - scanner, random (for locker PINS)

public class StorageLockerApp {
    String[] lockerId = {"1A", "2B", "3C", "4D", "5E", "6F", "7G", "8H", "9I", "10J"};
    String[] lockerPin = {"1111", "2222", "3333", "4444", "5555", "6666", "7777", "8888", "9999", "0000"};
    boolean[] lockerAvailable = {true, true, true, true, true, true, true, true, true, true};


    //Establish variable for 10 lockers
    public static int totalAvailableLockers = 10;
    //Set up scanner

    public static void main(String[] args) {

//main menu

     displayMainMenu();
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
        if (totalAvailableLockers > 0) {
            System.out.println("1. Rent A Locker");
        }

        System.out.println("2. Access a Locker\n3.Release a Locker\n ---\nAny other Key to Exit");

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
    //rentLocker()
    //accessLocker()
    //releaseLocker()
    //getAvailableLocker()
    //generatePin()
    //printReceipt()
    //isLockerNumberValid()
    //getLockerNumber()
    //openLocker()
    //releaseLocker()
}