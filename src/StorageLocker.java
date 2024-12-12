import java.util.Scanner;

public class StorageLocker {
    public static void main(String[] args) {
        System.out.println("Welcome to the locker rental.\n ");
        Scanner console = new Scanner(System.in);

//        String[] lockerNumber = new String[];
//        String[] lockerPins = new String[];


        String mainMenu = "Choose the option you would like to do. " +
                "1.Rent a new locker.\n" +
                "2. Open a rented locker.\n" +
                "3. Release (un-rent) a locker.\n" +
                "Selection Choice: ";

//          lockerNumber [] =
//          lockerPins[] =

                //????how many lockers???
                //????opening text/ prompt????

       //Requirements
        // ● You must include a project journal with your submission.
        // ● The user is presented with the main menu.
        // ● The user has three options: rent a locker, open a renter locker, or release
        // (un-rent) a locker.
        // ● When renting, the user is automatically assigned the next available locker
        // number and assigned a PIN.
        // ● When there are no lockers available, the application should remove the option to
        // rent a locker.
        // ● The user can open a locker when they enter the associated locker number and
        // PIN.
        // ● The user can release the locker by entering the associated locker number and
        // PIN.
        // ● Releasing a locker requires an "Are you sure?" confirmation.
        // ● Apply the DRY principle (as much as possible).
        // ● Each feature should be isolated into a separate method.
        // ● PINs should be 4 digits long.
        // ● PINs should include leading 0's.
        // ● The PIN should be a 'string' (not an 'int').
        // ● Use an array for the lockers and their associated PINs (or null value when
        // available).

        //pseudocode
        //create main menu

        //user is guest services rep, not attendee

        //user chooses option 1 (rent a locker), option 2 (open a renter locker),...
        //...or option 3 (release (un-rent) a locker) from the main menu
        //option 1 (renting) - user automatically assigned next available locker number and assigned a PIN...
        // ...(must be 4 digits long and include leading 0's and be a string not an 'int')...
        // ...If no lockers are available, the application should remove option to rent a locker

        //option 2 (open rented locker) The user can open the locker by entering in correct PIN associated to their...
        //...locker number.

        //option 3 (release locker) The user can release the locker by entering the associated locker number and PIN...
        //...make sure to ask user if they are sure they want to release locker.

        //create methods for each feature.
        //create an array for the lockers and their associated PINs (or null value when available).
    }
}
