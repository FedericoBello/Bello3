import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class AreaRettangoloTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testArea() {
		AreaRettangolo a=new AreaRettangolo(3,4);
		float risAtteso=12;
		float risOttenuto= a.area();
		assertEquals(risAtteso,risOttenuto);
		fail("Not yet implemented");
	}

}
