public class Event {

  int mNumberOfGuests;

  public Event(int numberOfGuests, int foodChoice, int beverageChoice, int entertainmentChoice) {
    mNumberOfGuests = numberOfGuests;
  }

  public int getNumberOfGuests() {
    return mNumberOfGuests;
  }

  public int getFoodChoice() {
    return 0;
  }
}
