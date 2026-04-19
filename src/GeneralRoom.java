public class GeneralRoom extends Room {

    public GeneralRoom(String name, int id) {
        super(name, id, 20);
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("General Room: " + name + " ID: " + id);
    }
}
