import java.util.*;

public class Visitor {

    String name;
    String password;
    String type;
    int totalHours;
    List<Slot> reservedSlots = new ArrayList<>();
    double totalAmount;

    public Visitor(String name, String password, String type) {
        this.name = name;
        this.password = password;
        this.type = type;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Total Amount: " + totalAmount);
    }

    public void addReservation(Slot slot) {
        reservedSlots.add(slot);
        totalAmount += slot.fee;
    }

    public void cancelReservation(Slot slot) {
        reservedSlots.remove(slot);
        totalAmount -= slot.fee;
    }
}