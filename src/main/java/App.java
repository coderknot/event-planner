import java.io.Console;

public class App {

  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Event Planner");

    System.out.println("How many guests will be attending?");
    int numberOfGuests = Integer.parseInt(console.readLine());

    System.out.println("What type of food is being served?");
    System.out.println("1. Light Snacks ($2 per guest)");
    System.out.println("2. Meal ($3 per guest)");
    System.out.println("3. Meal + Desert ($4 per guest)");

    int foodChoice = Integer.parseInt(console.readLine());

    System.out.println("What type of beverages are being served?");
    System.out.println("1. Water, Juice, and Soda ($1 per guest)");
    System.out.println("2. Option 1 + Light Bar ($2 per guest)");
    System.out.println("3. Option 1 + Full Bar ($3 per guest)");

    int beverageChoice = Integer.parseInt(console.readLine());

    System.out.println("What type of entertainment is being provided?");
    System.out.println("1. Live Band ($5 per guest)");
    System.out.println("2. DJ ($3 per guest)");
    int entertainmentChoice = Integer.parseInt(console.readLine());

    System.out.println("Do you have a coupon code?");
    System.out.println("10-OFF-100");
    String couponCodes = console.readLine();
    String[] couponCodesArray = couponCodes.split(" ");

    Event newEvent = new Event(numberOfGuests, foodChoice, beverageChoice, entertainmentChoice, couponCodesArray);

    System.out.println("This event will cost: $" + newEvent.calculateCost());

  }

}
