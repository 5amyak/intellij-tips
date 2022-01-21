package victor.training.dirty;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
	private final List<Rental> rentals = new ArrayList<>();

	public List<Rental> getRentals() {
		return rentals;
	}

	public String generateStatement(String customerName, List<Rental> rentals) {
		double totalPrice = 0;
		Iterator<Rental> rentalsIt = rentals.iterator();
		String result = "Rental Record for " + customerName + "\n";
		while (rentalsIt.hasNext()) {
			Rental rental = rentalsIt.next();
			double price = 0;// TODO get from Rental
			// TODO result += formatStatementLine(..)
			totalPrice += price;
		}
		result += "Amount owed is " + String.valueOf(totalPrice) + "\n";
		return result;
	}

	public String formatStatementLine(Movie movie, double price) {
		return "\t" + movie.getTitle() + "\t" + price + "\n";
	}
}