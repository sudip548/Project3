package com.Singelton;
import java.util.Scanner;
class Theatre
{
    int seats = 50;
    private static Theatre t = null;
    private Theatre()
    {
    }
    public static  Theatre getInstance()
    {
        if(t==null) t=new Theatre();
        return t;
    }
    public void reserveSeats(int seatsNum) {
        if (seatsNum > seats) {
            System.out.println(seatsNum + "Seats are not available");
            System.out.println(seats + "Seats are available");
            return;
        }
        System.out.println(seatsNum+"seats are available");
        seats=seats-seatsNum;
        System.out.println(seatsNum+"Seats are booked");
        System.out.println(seats +"Seats are available");
        System.out.println("Thank you For Booking .........!");
    }
}
      class BookingApp
    {
        public void bookTickets()
        {
            Scanner scan =new Scanner(System.in);
            System.out.println("How many Tickets : ");
            int ticketsNum = scan.nextInt();
            Theatre theatre=Theatre.getInstance();
            theatre.reserveSeats(ticketsNum);
        }
    }
   public class Book_My_Show {
    public static void main(String[] args) {
        BookingApp Customer1 = new BookingApp();
        Customer1.bookTickets();
        BookingApp Customer2 = new BookingApp();
        Customer2.bookTickets();
        BookingApp Customer3 = new BookingApp();
        Customer3.bookTickets();

    }
}
