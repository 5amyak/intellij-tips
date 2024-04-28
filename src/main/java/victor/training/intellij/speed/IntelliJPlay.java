package victor.training.intellij.speed;


import victor.training.intellij.speed.Person.MaritalStatus;
import victor.training.intellij.support.dirty.Customer;
import victor.training.intellij.support.dirty.Rental;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static org.assertj.core.api.Assertions.assertThat;


public class IntelliJPlay {
  public static void main(String[] args) {
    Optional<Person> person = Optional.ofNullable(new Person());
    person.get().setFirstName("PFN");
    String firstName = person.get().getFirstName();

    introduce(person.get().getFirstName(), MaritalStatus.SINGLE);
    introduce(person.get().getFirstName(), MaritalStatus.MARRIED);
    introduce(person.get().getBio().name, MaritalStatus.SINGLE);
    Customer customer = new Customer();
    List<Integer> list = new ArrayList<>();
    for (Rental rental : customer.getRentals()) {
      list.add(rental.getDaysRented());
    }
    System.out.println(list);
    method(customer.getRentals());

    System.out.println(person.get().getFirstName());

  }

  public static void introduce(String firstName, MaritalStatus maritalStatus) {
     System.out.println("This is " + firstName + (maritalStatus == MaritalStatus.SINGLE ? "😉" : ""));
  }


  public static void method(List<Rental> rentals) {
    rentals.clear();
  }


  @Override
  public String toString() {
    return super.toString();
  }
}

