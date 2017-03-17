public class Event {

  int mNumberOfGuests;
  int mFoodChoice;
  int mBeverageChoice;
  int mEntertainmentChoice;

  String[] foodChoices = {"Light Snacks"};

  public Event(int numberOfGuests, int foodChoice, int beverageChoice, int entertainmentChoice) {
    mNumberOfGuests = numberOfGuests;
    mFoodChoice = foodChoice;
    mBeverageChoice = beverageChoice;
    mEntertainmentChoice = entertainmentChoice;
  }

  public int getNumberOfGuests() {
    return mNumberOfGuests;
  }

  public String getFoodChoice() {
    return "";
  }

  public int getBeverageChoice() {
    return mBeverageChoice;
  }

  public int getEntertainmentChoice() {
    return mEntertainmentChoice;
  }

}
