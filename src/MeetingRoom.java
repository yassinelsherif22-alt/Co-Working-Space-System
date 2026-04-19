public class MeetingRoom extends Room {

    public MeetingRoom(String name, int id) {
        super(name, id, 10);
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Meeting Room: " + name + " ID: " + id);
    }
}
