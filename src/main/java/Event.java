public class Event {

  int mNumberOfGuests;
  String mFoodChoice;
  String mBeverageChoice;
  int mEntertainmentChoice;

  String[] foodChoices = {"Light Snacks"};
  String[] beverageChoices = {"Water"};

  public Event(int numberOfGuests, int foodChoice, int beverageChoice, int entertainmentChoice) {
    mNumberOfGuests = numberOfGuests;
    mFoodChoice = foodChoices[foodChoice - 1];
    mBeverageChoice = beverageChoices[beverageChoice - 1];
    mEntertainmentChoice = entertainmentChoice;
  }

  public int getNumberOfGuests() {
    return mNumberOfGuests;
  }

  public String getFoodChoice() {
    return mFoodChoice;
  }

  public String getBeverageChoice() {
    return mBeverageChoice;
  }

  public int getEntertainmentChoice() {
    return mEntertainmentChoice;
  }

}
