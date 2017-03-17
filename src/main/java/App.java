import java.io.Console;

public class App {

  public static void main(String[] args) {
    Console console = System.console();

    int numberOfGuests = 10;
    int foodChoice = 1;
    int beverageChoice = 1;
    int entertainmentChoice = 1;
    String[] couponCodes = {"10-OFF-100"};

    System.out.println("Event Planner");

    Event newEvent = new Event(numberOfGuests, foodChoice, beverageChoice, entertainmentChoice, couponCodes);

    System.out.println("This event will cost: $" + newEvent.calculateCost());

  }

}
