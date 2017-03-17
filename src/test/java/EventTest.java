import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() {
      String[] testCodes = {"100OFF"};
      Event testEvent = new Event(10, 1, 1, 1, testCodes);
      assertTrue(testEvent instanceof Event);
    }

    @Test
    public void getNumberOfGuests_getsNumberOfGuests_10() {
      String[] testCodes = {"100OFF"};
      Event testEvent = new Event(10, 1, 1, 1, testCodes);
      assertEquals(10, testEvent.getNumberOfGuests());
    }

    @Test
    public void getFoodChoice_getsFoodChoice_1() {
      String[] testCodes = {"100OFF"};
      Event testEvent = new Event(10, 1, 1, 1, testCodes);
      assertEquals("Light Snacks", testEvent.getFoodChoice());
    }

    @Test
    public void getBeverageChoice_getsBeverageChoice_1() {
      String[] testCodes = {"100OFF"};
      Event testEvent = new Event(10, 1, 1, 1, testCodes);
      assertEquals("Water", testEvent.getBeverageChoice());
    }

    @Test
    public void getEntertainmentChoice_getsEntertainmentChoice_1() {
      String[] testCodes = {"100OFF"};
      Event testEvent = new Event(10, 1, 1, 1, testCodes);
      assertEquals("Live Band", testEvent.getEntertainmentChoice());
    }

    @Test
    public void getUserCouponCodes_getsUserCouponCodes_100OFF() {
      String[] testCodes = {"100OFF"};
      Event testEvent = new Event(10, 1, 1, 1, testCodes);
      String[] expectedOutput = {"100OFF"};
      assertEquals(expectedOutput, testEvent.getUserCouponCodes());
    }

    @Test
    public void calculateCost_calculateEventCost_50() {
      String[] testCodes = {"100OFF"};
      Event testEvent = new Event(10, 1, 1, 1, testCodes);
      assertEquals(130, testEvent.calculateCost());
    }
}
