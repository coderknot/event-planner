import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() {
      Event testEvent = new Event(10, 1, 1, 1);
      assertTrue(testEvent instanceof Event);
    }

    @Test
    public void getNumberOfGuests_getsNumberOfGuests_10() {
      Event testEvent = new Event(10, 1, 1, 1);
      assertEquals(10, testEvent.getNumberOfGuests());
    }

    @Test
    public void getFoodChoice_getsFoodChoice_1() {
      Event testEvent = new Event(10, 1, 1, 1);
      assertEquals("Light Snacks", testEvent.getFoodChoice());
    }

    @Test
    public void getBeverageChoice_getsBeverageChoice_1() {
      Event testEvent = new Event(10, 1, 1, 1);
      assertEquals("Water", testEvent.getBeverageChoice());
    }

    @Test
    public void getEntertainmentChoice_getsEntertainmentChoice_1() {
      Event testEvent = new Event(10, 1, 1, 1);
      assertEquals("Live Band", testEvent.getEntertainmentChoice());
    }
}
