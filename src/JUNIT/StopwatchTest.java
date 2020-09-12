package JUNIT;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class StopwatchTest {
	
	Stopwatch watch;
	
	@Before
	public void setup() {
		watch = new Stopwatch();
	}

	@Test
	public void testSecondIncrement() {
		watch.tick();
		assertEquals(1, watch.getSeconds());
	}
	
	@Test
	public void testMinuteIncrement() {
		for(int i = 0; i < 60; i++) {
			watch.tick();
		}
		assertEquals(1, watch.getMinutes());
		assertEquals(0, watch.getSeconds());
	}
	
	@Test
	public void testHourIncrement() {
		for(int i = 0; i < 3600; i++) {
			watch.tick();
		}
		assertEquals(1, watch.getHours());
		assertEquals(0, watch.getMinutes());
		assertEquals(0, watch.getSeconds());
	}
	
	@Test
	public void testAllIncrements() {
		for(int i = 0; i < 3661; i++) {
			watch.tick();
		}
		assertEquals(1, watch.getHours());
		assertEquals(1, watch.getMinutes());
		assertEquals(1, watch.getSeconds());
	}


}

