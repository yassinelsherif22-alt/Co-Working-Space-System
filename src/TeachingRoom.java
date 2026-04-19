public class TeachingRoom extends Room {

    String projectorType;
    String boardType;
    String instructorName;

    public TeachingRoom(String name, int id, String projectorType, String boardType, String instructorName) {
        super(name, id, 10);
        this.projectorType = projectorType;
        this.boardType = boardType;
        this.instructorName = instructorName;
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Teaching Room: " + name);
        System.out.println("Instructor: " + instructorName);
    }
}