public class Slot {

    String date;
    String time;
    double fee;
    boolean isReserved;

    public Slot(String date, String time, double fee) {
        this.date = date;
        this.time = time;
        this.fee = fee;
    }

    public void displaySlot() {
        System.out.println(date + " " + time + " - " + fee + " EGP");
    }
}
