import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() {
      Event testEvent = new Event(10, 1, 1, 1);
      assertTrue(testEvent instanceof Event);
    }
}
