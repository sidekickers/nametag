package org.sidekickers.nametag.formatter;

import org.junit.Test;
import org.sidekickers.nametag.namesource.GenericNameSource;
import org.sidekickers.nametag.namesource.NameSource;

import static org.junit.Assert.*;

public class AllCapFormatterTest {

	@Test
	public void testAllCapFormatter() {

		NameSource source = GenericNameSource.create("all", "cap");
		new AllCapFormatter().format(source);
		assertEquals("ALLCAP", source.toString());
	}
}
