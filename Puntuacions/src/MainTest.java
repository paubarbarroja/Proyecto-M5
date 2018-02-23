import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		assertTrue(Main.puntu(1)==25);
		assertTrue(Main.puntu(2)==20);
		assertTrue(Main.puntu(3)==16);
		assertTrue(Main.puntu(4)==13);
		assertTrue(Main.puntu(5)==11);
		assertTrue(Main.puntu(6)==10);
		assertTrue(Main.puntu(7)==9);
		assertTrue(Main.puntu(8)==8);
		assertTrue(Main.puntu(9)==7);
		assertTrue(Main.puntu(10)==6);
		assertTrue(Main.puntu(11)==5);
		assertTrue(Main.puntu(12)==4);
		assertTrue(Main.puntu(13)==3);
		assertTrue(Main.puntu(14)==2);
		assertTrue(Main.puntu(15)==1);
	}

}
