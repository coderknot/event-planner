public class Event {

  int mNumberOfGuests;
  String mFoodChoice;
  String mBeverageChoice;
  String mEntertainmentChoice;

  String[] foodChoices = {"Light Snacks"};
  String[] beverageChoices = {"Water"};
  String[] entertainmentChoices = {"Live Band"};

  public Event(int numberOfGuests, int foodChoice, int beverageChoice, int entertainmentChoice) {
    mNumberOfGuests = numberOfGuests;
    mFoodChoice = foodChoices[foodChoice - 1];
    mBeverageChoice = beverageChoices[beverageChoice - 1];
    mEntertainmentChoice = entertainmentChoices[entertainmentChoice - 1];
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

  public String getEntertainmentChoice() {
    return mEntertainmentChoice;
  }

  public int calculateCost() {
    int guestsCost = mNumberOfGuests * 5;
    int foodCost = 0;
    int beverageCost = 0;

    for(String foodChoice : foodChoices) {
      if(mFoodChoice.equals("Light Snacks")) {
        foodCost = mNumberOfGuests * 2;
      } else {
        foodCost = 0;
      }
    }

    for(String beverageChoice : beverageChoices) {
      if(mBeverageChoice.equals("Water")) {
        beverageCost = mNumberOfGuests * 1;
      } else {
        beverageCost = 0;
      }
    }

    return guestsCost + foodCost + beverageCost;
  }

}
