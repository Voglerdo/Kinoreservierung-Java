public class Cinema {
    private String name;
    private int hallNumber;
    private boolean[] seats;

    public Cinema(String name, int hallNumber, int numberOfSeats) {
        this.name = name;
        this.hallNumber = hallNumber;
        this.seats = new boolean[numberOfSeats];
    }

    public boolean reserveSeat(int seatNumber) {
        if (seatNumber < 0 || seatNumber >= seats.length) {
            throw new IllegalArgumentException("Seat number out of bounds");
        }

        if (seats[seatNumber]) {
            return false;
        }

        seats[seatNumber] = true;
        return true;
    }

    public boolean isSeatAvailable(int seatNumber) {
        if (seatNumber < 0 || seatNumber >= seats.length) {
            throw new IllegalArgumentException("Seat number out of bounds");
        }

        return !seats[seatNumber];
    }

    public void printAvailableSeats() {
        for (int i = 0; i < seats.length; i++) {
            if (!seats[i]) {
                System.out.println(i);
            }
        }
    }
}