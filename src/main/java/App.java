import java.io.Console;

public class App {

  public static void main(String[] args) {
    boolean programRunning = true;

    System.out.println("Welcome to the Event Planner!");
    while(programRunning) {
      Event event = createEvent();
      displayEvent(event);
      programRunning = false;
    }
  }

  public static Event createEvent() {
    Console console = System.console();

    System.out.println("\nNew Event:");

    System.out.println("\nHow many guests will be attending?");
    int numberOfGuests = Integer.parseInt(console.readLine());

    System.out.println("\nWhat type of food is being served?");
    System.out.println("\n1. Light Snacks ($2 per guest)");
    System.out.println("2. Meal ($3 per guest)");
    System.out.println("3. Meal + Desert ($4 per guest)");

    int foodChoice = Integer.parseInt(console.readLine());

    System.out.println("\nWhat type of beverages are being served?");
    System.out.println("\n1. Water, Juice, and Soda ($1 per guest)");
    System.out.println("2. Option 1 + Light Bar ($2 per guest)");
    System.out.println("3. Option 1 + Full Bar ($3 per guest)");

    int beverageChoice = Integer.parseInt(console.readLine());

    System.out.println("\nWhat type of entertainment is being provided?");
    System.out.println("\n1. Live Band ($5 per guest)");
    System.out.println("2. DJ ($3 per guest)");
    int entertainmentChoice = Integer.parseInt(console.readLine());

    System.out.println("\nWould you like to apply a coupon? Separate coupon codes with a space.");
    System.out.println("\n* 10-OFF-100");
    System.out.println("* 5-OFF-150");
    String couponCodes = console.readLine();
    String[] couponCodesArray = couponCodes.split(" ");

    Event newEvent = new Event(numberOfGuests, foodChoice, beverageChoice, entertainmentChoice, couponCodesArray);

    return newEvent;
  }

  public static void displayEvent(Event event) {
    System.out.println("\nHere are the details of your event: ");
    System.out.println("\nNumber of guests: " + event.getNumberOfGuests());
    System.out.println("Food served: " + event.getFoodChoice());
    System.out.println("Beverages served: " + event.getBeverageChoice());
    System.out.println("Entertainment option: " + event.getEntertainmentChoice());

    String couponCodes = "";
    for(String couponCode: event.getUserCouponCodes()) {
      couponCodes += couponCode + ", ";
    }

    System.out.println("Coupon codes: " + couponCodes);
    System.out.println("\nTotal cost: $" + event.calculateCost());
  }
}
