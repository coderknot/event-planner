import java.io.Console;

public class App {

  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Event Planner");

    System.out.println("How many guests will be attending?");
    int numberOfGuests = Integer.parseInt(console.readLine());

    System.out.println("What type of food is being served?");
    System.out.println("1. Light Snacks");
    int foodChoice = Integer.parseInt(console.readLine());

    System.out.println("What type of beverages are being served?");
    System.out.println("1. Water");
    int beverageChoice = Integer.parseInt(console.readLine());

    System.out.println("What type of entertainment is being provided?");
    System.out.println("1. Live Band");
    int entertainmentChoice = Integer.parseInt(console.readLine());

    System.out.println("Do you have a coupon code?");
    System.out.println("10-OFF-100");
    String couponCodes = console.readLine();
    String[] couponCodesArray = couponCodes.split(" ");

    Event newEvent = new Event(numberOfGuests, foodChoice, beverageChoice, entertainmentChoice, couponCodesArray);

    System.out.println("This event will cost: $" + newEvent.calculateCost());

  }

}
