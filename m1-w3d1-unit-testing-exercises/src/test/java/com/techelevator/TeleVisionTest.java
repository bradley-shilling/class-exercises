package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*
 * Things to look/test for
* are there boundaries on the volume limits? - done
* does the volume correctly reset when turning the tv on?
* are there unexpected side effects when changing the channel, turning it on/off, raising/lowering volume? - done
 */

public class TeleVisionTest {
	/*
	 * Instance varible subject unit to test
	 */
	private Television tv;

	
	
	@Before
	public void setUp() throws Exception {
		/*
		 * set up test
		 */
		tv = new Television();
	}

	@Test
	public void testIsOn() {
		tv.TurnOn();
		assertEquals(true, tv.IsOn()); 
	}

	@Test
	public void testGetSelectedChannel() {
		assertEquals(3, tv.getSelectedChannel()); 
	}

	@Test
	public void testGetCurrentVolume() {
		assertEquals(0, tv.getCurrentVolume());
		tv.RaiseVolume();
		assertEquals(1, tv.getCurrentVolume());
	}

	@Test
	public void testTurnOn() {
		tv.TurnOff();
		tv.TurnOn();
		tv.TurnOn();
		assertEquals(true, tv.IsOn()); 
	}

	@Test
	public void testTurnOff() {
		tv.TurnOn();
		tv.TurnOff();
		tv.TurnOff();
		assertEquals(false, tv.IsOn());
	}

	@Test
	public void testChangeChannel() {
		int x = tv.getSelectedChannel();
		tv.ChangeChannel(6);
		if (x != tv.getSelectedChannel()) {
			assertEquals(6, tv.getSelectedChannel());
		}
	}
	@Test
	public void testChangeChannelOutOfBounds() {
		tv.ChangeChannel(6);
		int x = tv.getSelectedChannel();
		tv.ChangeChannel(21);
		tv.ChangeChannel(0);
		assertEquals(6, tv.getSelectedChannel());
		tv.TurnOff();
		tv.ChangeChannel(7);
		tv.TurnOn();
		assertEquals(6, tv.getSelectedChannel());
	}
	@Test
	public void testChangeChannelWhileOff() {
		tv.TurnOff();
		tv.ChangeChannel(6);
		assertEquals(3, tv.getSelectedChannel());
	}

	@Test
	public void testRaiseVolume() {
		assertEquals(0, tv.getCurrentVolume());
		tv.RaiseVolume();
		assertEquals(1, tv.getCurrentVolume());
		for (int i = 0; i < 12; i++) {
		tv.RaiseVolume();
		}
		assertEquals(10, tv.getCurrentVolume());
	}

	@Test
	public void testLowerVolume() {
		assertEquals(0, tv.getCurrentVolume());
		tv.RaiseVolume();
		assertEquals(1, tv.getCurrentVolume());
		tv.LowerVolume();
		assertEquals(0, tv.getCurrentVolume());
		for (int i = 0; i < 12; i++) {
		tv.LowerVolume();
		}
		assertEquals(0, tv.getCurrentVolume());
	}
	/*
	 * check volume reset on start up
	 */
	@Test
	public void volumeResetOnPowerUp() {
		tv.TurnOff();
		tv.TurnOn();
		assertEquals(2, tv.getCurrentVolume());
	}

}
