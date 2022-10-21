import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testHandleURL() {
    Handler tester = new Handler();
    URI url = new URI("https://127.0.0.1:8000/technical");
    assertEquals("Don't know how to handle that path!", tester.handleRequest(url));
	}
}
