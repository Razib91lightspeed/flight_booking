import java.util.Random;
import javax.swing.*;

public class FlightBooking {
    public static void main(String[] args) {
        String[] cities = {"New York", "London", "Paris", "Tokyo", "Sydney", "Dubai", "Los Angeles", "Mexico City", "Rio de Janeiro", "Cape Town", "Istanbul", "Bangkok", "Hong Kong", "Shanghai", "Mumbai", "Moscow", "Beijing", "Seoul", "Toronto", "Vancouver", "Montreal", "Calgary", "Ottawa", "Edmonton", "Halifax", "St. John's", "Winnipeg", "Regina", "Victoria"};
        String[] tripTypes = {"One-way", "Return"};
        String destination = (String) JOptionPane.showInputDialog(null, "Select destination city:", "Destination", JOptionPane.QUESTION_MESSAGE, null, cities, cities[0]);
        String departure = (String) JOptionPane.showInputDialog(null, "Select departure city:", "Departure", JOptionPane.QUESTION_MESSAGE, null, cities, cities[0]);
        String tripType = (String) JOptionPane.showInputDialog(null, "Select trip type:", "Trip Type", JOptionPane.QUESTION_MESSAGE, null, tripTypes, tripTypes[0]);
        String date = JOptionPane.showInputDialog("Enter departure date (MM/DD/YYYY):");
        String time = JOptionPane.showInputDialog("Enter departure time (HH:MM):");
        String returnDate = "";
        String returnTime = "";
        if (tripType.equals("Return")) {
            returnDate = JOptionPane.showInputDialog("Enter return date (MM/DD/YYYY):");
            returnTime = JOptionPane.showInputDialog("Enter return time (HH:MM):");
        }
        Random rand = new Random();
        int price = rand.nextInt((1000 - 250) + 1) + 250;
        String message = "Booking details:\n\nDestination: " + destination + "\nDeparture: " + departure + "\nTrip Type: " + tripType + "\nDeparture Date: " + date + "\nDeparture Time: " + time;
        if (tripType.equals("Return")) {
            message += "\nReturn Date: " + returnDate + "\nReturn Time: " + returnTime;
        }
        message += "\nPrice: $" + price;
        JOptionPane.showMessageDialog(null, message);
    }
}
