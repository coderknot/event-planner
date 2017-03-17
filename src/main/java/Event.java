public class Event {

  int mNumberOfGuests;
  int mFoodChoice;
  int mBeverageChoice;

  public Event(int numberOfGuests, int foodChoice, int beverageChoice, int entertainmentChoice) {
    mNumberOfGuests = numberOfGuests;
    mFoodChoice = foodChoice;
    mBeverageChoice = beverageChoice;
  }

  public int getNumberOfGuests() {
    return mNumberOfGuests;
  }

  public int getFoodChoice() {
    return mFoodChoice;
  }

  public int getBeverageChoice() {
    return mBeverageChoice;
  }

  public int getEntertainmentChoice() {
    return 0;
  }

}
