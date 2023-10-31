import java.util.Scanner;

public class HotelExpenseCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of nights stayed: ");
        int nightsStayed = scanner.nextInt();
        double roomChargePerNight = 300.0;
        double roomCharges = nightsStayed * roomChargePerNight;

        System.out.print("Enter dining expenses: $");
        double diningExpenses = scanner.nextDouble();

        System.out.print("Enter entertainment expenses: $");
        double entertainmentExpenses = scanner.nextDouble();

        System.out.print("Include spa services? (true/false): ");
        boolean includeSpa = scanner.nextBoolean();
        double spaCost = includeSpa ? 100.0 : 0.0;

        System.out.print("Include valet services? (true/false): ");
        boolean includeValet = scanner.nextBoolean();
        double valetCost = includeValet ? 50.0 : 0.0;

        System.out.print("Book a conference room? (true/false): ");
        boolean bookConferenceRoom = scanner.nextBoolean();
        double conferenceRoomCost = bookConferenceRoom ? 200.0 : 0.0;

        System.out.print("Rent a luxury car? (true/false): ");
        boolean rentCar = scanner.nextBoolean();
        double carRentalFeePerDay = 150.0;
        int carRentalDays = 0;
        double carRentalCost = 0.0;
        if (rentCar) {
            System.out.print("Enter the number of days to rent the car: ");
            carRentalDays = scanner.nextInt();
            carRentalCost = carRentalDays * carRentalFeePerDay;
        }

        System.out.print("Include personal concierge service? (true/false): ");
        boolean includeConcierge = scanner.nextBoolean();
        double conciergeFee = includeConcierge ? 75.0 : 0.0;

        // Loyalty discount for guests staying more than 5 nights
        double loyaltyDiscount = (nightsStayed > 5) ? 50.0 : 0.0;

        double totalExpenses = roomCharges + diningExpenses + entertainmentExpenses 
                             + spaCost + valetCost + conferenceRoomCost 
                             + carRentalCost + conciergeFee - loyaltyDiscount;

        System.out.println("\nExpense Summary for Clark Shiraz Luxury Hotel:");
        System.out.println("1. Room Charges: $" + roomCharges);
        System.out.println("2. Dining Expenses: $" + diningExpenses);
        System.out.println("3. Entertainment Expenses: $" + entertainmentExpenses);
        System.out.println("4. Spa Services: $" + spaCost);
        System.out.println("5. Valet Services: $" + valetCost);
        System.out.println("6. Conference Room Booking: $" + conferenceRoomCost);
        System.out.println("7. Luxury Car Rental (" + carRentalDays + " days): $" + carRentalCost);
        System.out.println("8. Personal Concierge Service: $" + conciergeFee);
        System.out.println("9. Loyalty Discount: $" + loyaltyDiscount);
        System.out.println("------------------------------");
        System.out.println("Total Expenses: $" + totalExpenses);

        scanner.close();
    }
}
