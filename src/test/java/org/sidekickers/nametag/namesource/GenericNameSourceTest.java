package org.sidekickers.nametag.namesource;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GenericNameSourceTest {

	@Test
	public void testGenericNameSource() {

		GenericNameSource s = GenericNameSource.create("generic", "name", "source");
		assertEquals("genericnamesource", s.toString());

	}
}
