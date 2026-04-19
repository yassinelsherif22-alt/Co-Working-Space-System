import java.util.*;

public class Admin {

    static String adminUsername = "admin";
    static String adminPassword = "admin";
    Scanner scanner = new Scanner(System.in);
    static List<Room> rooms = new ArrayList<>();

    public boolean adminLogin() {
        System.out.print("Enter Admin Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Admin Password: ");
        String password = scanner.nextLine();

        return username.equals(adminUsername) && password.equals(adminPassword);
    }

    public void initializeRooms() {
        rooms.add(new GeneralRoom("General Room 1", 101));
        rooms.add(new GeneralRoom("General Room 2", 102));
        rooms.add(new MeetingRoom("Meeting Room 1", 201));
        rooms.add(new MeetingRoom("Meeting Room 2", 202));
        rooms.add(new MeetingRoom("Meeting Room 3", 203));
        rooms.add(new TeachingRoom("Teaching Room 1", 301, "Projector X", "Whiteboard", "Dr. Smith"));
    }

    public void addSlotToRoom() {
        Room room = selectRoom();
        if (room != null) {
            System.out.print("Enter slot date: ");
            String date = scanner.nextLine();
            System.out.print("Enter slot time: ");
            String time = scanner.nextLine();
            System.out.print("Enter fee: ");
            double fee = scanner.nextDouble();
            scanner.nextLine();

            room.addSlot(new Slot(date, time, fee));
        }
    }

    public Room selectRoom() {
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println((i + 1) + ". " + rooms.get(i).name);
        }

        int choice = scanner.nextInt();
        scanner.nextLine();

        return rooms.get(choice - 1);
    }

    public void displayAllRoomsData() {
        for (Room room : rooms) {
            room.displayRoomDetails();
            room.displaySlots();
        }
    }
}