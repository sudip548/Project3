package com.Recursion;

public class Theatre {
    int seats = 50;
    private static Theatre t = null;

    private Theatre() {
    }

    public static Theatre getInstance() {
        if (t == null) t = new Theatre();
        return t;
    }

    public void reserveSeats(int seatsNum) {
        if (seatsNum > seats) {
            System.out.println(seatsNum + "Seats are not available");
            System.out.println(seats + "Seats are available");
            return;
        }
        System.out.println(seatsNum + "seats are available");
        seats = seats - seatsNum;
        System.out.println(seatsNum + "Seats are booked");
        System.out.println(seats + "Seats are available");
        System.out.println("Thank you For Booking .........!");
    }
}
