public class Event {

  private int mNumberOfGuests;
  private String mFoodChoice;
  private String mBeverageChoice;
  private String mEntertainmentChoice;
  private String[] mUserCouponCodes;

  private String[] mFoodChoices = {"Light Snacks", "Meal", "Meal + Dessert"};
  private String[] mBeverageChoices = {"Water"};
  private String[] mEntertainmentChoices = {"Live Band"};

  public Event(int numberOfGuests, int foodChoice, int beverageChoice, int entertainmentChoice, String[] couponCodes) {
    mNumberOfGuests = numberOfGuests;
    mFoodChoice = mFoodChoices[foodChoice - 1];
    mBeverageChoice = mBeverageChoices[beverageChoice - 1];
    mEntertainmentChoice = mEntertainmentChoices[entertainmentChoice - 1];
    mUserCouponCodes = couponCodes;
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

  public String[] getUserCouponCodes() {
    return mUserCouponCodes;
  }

  public int calculateCost() {
    int guestsCost = mNumberOfGuests * 5;
    int foodCost = 0;
    int beverageCost = 0;
    int entertainmentCost = 0;
    int discount = 0;

    for(String foodChoice : mFoodChoices) {
      if(mFoodChoice.equals("Light Snacks")) {
        foodCost = mNumberOfGuests * 2;
      } else if(mFoodChoice.equals("Meal")) {
        foodCost = mNumberOfGuests * 3;
      } else if(mFoodChoice.equals("Meal + Dessert")) {
        foodCost = mNumberOfGuests * 4;
      } else {
        foodCost = 0;
      }
    }

    for(String beverageChoice : mBeverageChoices) {
      if(mBeverageChoice.equals("Water")) {
        beverageCost = mNumberOfGuests * 1;
      } else {
        beverageCost = 0;
      }
    }

    for(String entertainmentChoice : mEntertainmentChoices) {
      if(mEntertainmentChoice.equals("Live Band")) {
        entertainmentCost = mNumberOfGuests * 5;
      } else {
        entertainmentCost = 0;
      }
    }

    discount = applyCoupons();

    return (guestsCost + foodCost + beverageCost + entertainmentCost) - discount;
  }

  public int applyCoupons() {
    int totalDiscount = 0;

    for(String userCouponCode : mUserCouponCodes) {
      if (userCouponCode.equals("10-OFF-100")) {
        totalDiscount += 10;
      } else {
        totalDiscount += 0;
      }
    }

    return totalDiscount;
  }
}
