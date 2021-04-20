package usantatecla.movies.v22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Customer {

    private String name;

    private List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        rentals = new ArrayList<Rental>();
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

	public String statement() {
		String result = "Rental Record for " + this.getName() + "\n";
		result += this.getRentalTitleAndCharge();
		result += "Amount owed is " + this.getTotalCharge() + "\n";
		result += "You earned " + this.getTotalFrequentRenterPoints() + " frequent renter points";
		return result;
	}

    private String getRentalTitleAndCharge() {
        return this.rentals.stream()
                .map(rental -> "\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "\n")
                .collect(Collectors.joining());
    }

    private double getTotalCharge() {
        return this.rentals.stream().mapToDouble(Rental::getCharge).sum();
    }

    private int getTotalFrequentRenterPoints() {
        return this.rentals.stream().mapToInt(Rental::getFrequentRenterPoints).sum();
    }

}
