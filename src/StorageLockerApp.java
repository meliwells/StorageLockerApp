//import java utilities - random (for locker PINS)

import java.util.Scanner;

public class StorageLockerApp {
    public static String[] lockerId = {"1A", "2B", "3C", "4D", "5E", "6F", "7G", "8H", "9I", "10J"};
    public static String[] lockerPin = {"1111", "2222", "3333", "4444", "5555", "6666", "7777", "8888", "9999", "0000"};
    public static boolean[] lockerAvailable = {true, true, true, true, true, true, true, true, true, true};
    //Establish variable for 10 lockers
    public static int totalAvailableLockers = 10;
    java.util.Scanner console = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMainMenu();
            int menuChoice = getChoice();
            if (menuChoice == 1) {
                rentLocker();
            }
            if (menuChoice == 2) {
                accessLocker();
            }
            if (menuChoice == 3) {
                releaseLocker();
            }
             if (menuChoice !=1 && menuChoice !=2 && menuChoice !=3) {
                 exitProgram();
             }
        }
    }
/*
   5. User exits
    -Exit application
*/

    //Methods -
    public static void displayMainMenu() {
        System.out.println("What would you like to do next?\n");
        if (getAvailableLocker() != -1) {
            System.out.println("1. Rent A Locker");
        }
        System.out.println("2. Access a Locker\n3. Release a Locker\n ---\nAny other Key to Exit");
    }

    public static int getChoice() {
        Scanner console = new Scanner(System.in);
        return Integer.parseInt(console.nextLine());
    }

    public static String getUserInput() {
        Scanner console = new Scanner(System.in);
        return console.nextLine();
    }

    public static void exitProgram() {
        Scanner console = new Scanner(System.in);
    }

    //rentLocker()
    public static void rentLocker() {
        int firstAvailableLocker = getAvailableLocker();
        System.out.println("Locker: " + lockerId[firstAvailableLocker] + "\nPIN Number: " + lockerPin[firstAvailableLocker]
                + "\nThank you for renting!");
        lockerAvailable[firstAvailableLocker] = false;
    }

    //accessLocker()
    public static void accessLocker() {
        System.out.println("Enter locker number");
        String lockerNumber = getUserInput();
        int locker = isLockerNumberValid(lockerNumber);
        if (locker != -1) {
            if (checkPin(locker)) {
                System.out.println("Your locker is open");
            } else {
                System.out.println("Incorrect PIN");
            }

        } else {
            System.out.println("Locker not found");
        }
    }

    public static boolean checkPin(int locker) {
        boolean validPin = false;
        System.out.println("Enter PIN ");
        String userInput = getUserInput();
        if(userInput.equals(lockerPin[locker])) {
            validPin = true;
        }
        return validPin;
    }

        //releaseLocker()
        public static void releaseLocker() {
            System.out.println("Enter locker number");
            String lockerNumber = getUserInput();
            int locker = isLockerNumberValid(lockerNumber);
            if (locker != -1 && !lockerAvailable[locker]) {
                if (checkPin(locker)) {
                    System.out.println("Are you sure you want to release your locker? y/n");
                    String confirmation = getUserInput();
                    if (confirmation("y")) {
                        lockerAvailable[locker] = "y";
                        System.out.println("Locker released");
                    } else {
                        System.out.println("Release canceled");
                    }
                } else {
                    System.out.println("Incorrect PIN");
                }
            } else {
                System.out.println("Locker not found");
            }
        }

        private static String confirmation () {;
        }

    //getAvailableLocker()
        public static int getAvailableLocker () {
            int firstAvailableLocker = -1;
            for (int i = 0; i < lockerAvailable.length; i++) {
                if (lockerAvailable[i]) {
                    return i;
                }
            }

            return firstAvailableLocker;
        }

    //isLockerNumberValid()
    public static int isLockerNumberValid(String checkId) {
        int foundLocker = -1;
        for (int i = 0; i < lockerId.length; i++) {
            if (checkId.equals(lockerId[i])) {
                return i;
            }
        }
        return foundLocker;
    }
    //generatePin()
    //getLockerNumber()
}


