import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Admin admin = new Admin();
    static Map<String, Visitor> visitors = new HashMap<>();

    public static void main(String[] args) {

        admin.initializeRooms(); // تهيئة الغرف

        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== Co-Working Space System =====");
            System.out.println("1. Admin Login");
            System.out.println("2. Visitor Login (Simple Test)");
            System.out.println("3. Exit");

            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    if (admin.adminLogin()) {
                        adminMenu();
                    } else {
                        System.out.println("Wrong admin credentials!");
                    }
                    break;

                case 2:
                    System.out.println("No full visitor system here yet (keep your original logic if needed).");
                    break;

                case 3:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Admin Menu
    public static void adminMenu() {
        boolean back = false;

        while (!back) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Display Rooms");
            System.out.println("2. Add Slot");
            System.out.println("3. Back");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    admin.displayAllRoomsData();
                    break;

                case 2:
                    admin.addSlotToRoom();
                    break;

                case 3:
                    back = true;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
