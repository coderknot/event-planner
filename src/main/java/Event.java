public class Event {

  int mNumberOfGuests;
  int mFoodChoice;

  public Event(int numberOfGuests, int foodChoice, int beverageChoice, int entertainmentChoice) {
    mNumberOfGuests = numberOfGuests;
    mFoodChoice = foodChoice;
  }

  public int getNumberOfGuests() {
    return mNumberOfGuests;
  }

  public int getFoodChoice() {
    return mFoodChoice;
  }
}
