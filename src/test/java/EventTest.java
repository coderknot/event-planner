import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() {
      String[] testCouponCodes = {"10-OFF-100"};
      Event testEvent = new Event(10, 1, 1, 1, testCouponCodes);
      assertTrue(testEvent instanceof Event);
    }

    @Test
    public void getNumberOfGuests_getsNumberOfGuests_10() {
      String[] testCouponCodes = {"10-OFF-100"};
      Event testEvent = new Event(10, 1, 1, 1, testCouponCodes);
      assertEquals(10, testEvent.getNumberOfGuests());
    }

    @Test
    public void getFoodChoice_getsFoodChoice_1() {
      String[] testCouponCodes = {"10-OFF-100"};
      Event testEvent = new Event(10, 1, 1, 1, testCouponCodes);
      assertEquals("Light Snacks", testEvent.getFoodChoice());
    }

    @Test
    public void getBeverageChoice_getsBeverageChoice_1() {
      String[] testCouponCodes = {"10-OFF-100"};
      Event testEvent = new Event(10, 1, 1, 1, testCouponCodes);
      assertEquals("Water, Juice, and Soda", testEvent.getBeverageChoice());
    }

    @Test
    public void getEntertainmentChoice_getsEntertainmentChoice_1() {
      String[] testCouponCodes = {"10-OFF-100"};
      Event testEvent = new Event(10, 1, 1, 1, testCouponCodes);
      assertEquals("Live Band", testEvent.getEntertainmentChoice());
    }

    @Test
    public void getUserCouponCodes_getsUserCouponCodes_100OFF() {
      String[] testCouponCodes = {"10-OFF-100"};
      Event testEvent = new Event(10, 1, 1, 1, testCouponCodes);
      String[] expectedOutput = {"10-OFF-100"};
      assertEquals(expectedOutput, testEvent.getUserCouponCodes());
    }

    @Test
    public void calculateCost_calculateEventCost_130() {
      // String[] testCouponCodes = {"10-OFF-100"};
      String[] testCouponCodes = new String[0];

      Event testEvent = new Event(10, 1, 1, 1, testCouponCodes);
      assertEquals(130, testEvent.calculateCost());
    }

    @Test
    public void applyCoupons_applyCouponsToEventCost_10() {
      String[] testCouponCodes = {"10-OFF-100"};
      Event testEvent = new Event(10, 1, 1, 1, testCouponCodes);
      assertEquals(10, testEvent.applyCoupons());
    }

    @Test
    public void applyCoupons_applyMultipleCouponsToEventCost_15() {
      String[] testCouponCodes = {"10-OFF-100", "5-OFF-150"};
      Event testEvent = new Event(10, 1, 1, 1, testCouponCodes);
      assertEquals(15, testEvent.applyCoupons());
    }

    @Test
    public void calculateCost_applyDiscountFromCouponsToEventCost_115() {
      String[] testCouponCodes = {"10-OFF-100", "5-OFF-150"};
      Event testEvent = new Event(10, 1, 1, 1, testCouponCodes);
      assertEquals(115, testEvent.calculateCost());
    }
}
