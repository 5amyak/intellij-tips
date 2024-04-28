package victor.training.intellij.refactoring;

import victor.training.intellij.support.dirty.Movie;
import victor.training.intellij.support.dirty.Rental;

import java.util.List;

public class LocalVariables {

  public int getFrequentRenterPoints(List<Rental> rentals) {
    int frequentRenterPoints = 0;
    for (Rental rental : rentals) {
      // add frequent renter points
      frequentRenterPoints++;
        // add bonus for a two day new release rental
        boolean isNewRelease = rental.getMovie().getCategory() == Movie.CATEGORY_NEW_RELEASE;
        if (isNewRelease && rental.getDaysRented() > 1) {
          frequentRenterPoints++;
       }
    }
    return frequentRenterPoints;
  }

  public static int discount(int price, int quantity) {
     if (price > 50) {
        price = price - 2;
     }
     if (quantity > 100) {
        price = price - 1;
     }
    return price;
  }
}