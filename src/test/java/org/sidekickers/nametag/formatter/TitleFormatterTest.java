package org.sidekickers.nametag.formatter;

import org.junit.Test;
import org.sidekickers.nametag.namesource.GenericNameSource;

import static org.junit.Assert.*;

public class TitleFormatterTest {

	@Test
	public void testTitleFormatter() {

		GenericNameSource s = GenericNameSource.create("the", "quick", "brown");
		new TitleFormatter().format(s);

		assertEquals("TheQuickBrown", s.toString());

	}

}
