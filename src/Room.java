import java.util.*;

public abstract class Room {

    String name;
    int id;
    int maxVisitors;
    List<Slot> slots = new ArrayList<>();
    List<Visitor> visitors = new ArrayList<>();

    public Room(String name, int id, int maxVisitors) {
        this.name = name;
        this.id = id;
        this.maxVisitors = maxVisitors;
    }

    public void addSlot(Slot slot) {
        slots.add(slot);
    }

    public void displaySlots() {
        for (Slot s : slots) {
            s.displaySlot();
        }
    }

    public abstract void displayRoomDetails();
}
