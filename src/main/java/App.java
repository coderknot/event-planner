import java.io.Console;

public class App {

  public static void main(String[] args) {
    Console console = System.console();

    int foodChoice = 1;
    int beverageChoice = 1;
    int entertainmentChoice = 1;
    String[] couponCodes = {"10-OFF-100"};

    System.out.println("Event Planner");

    System.out.println("How many guests will be attending?");
    int numberOfGuests = Integer.parseInt(console.readLine());

    Event newEvent = new Event(numberOfGuests, foodChoice, beverageChoice, entertainmentChoice, couponCodes);

    System.out.println("This event will cost: $" + newEvent.calculateCost());

  }

}
