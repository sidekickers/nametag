package org.sidekickers.nametag.formatter;

import org.junit.Test;
import org.sidekickers.nametag.namesource.GenericNameSource;

public class VaryNumberFormatterTest {

	@Test
	public void testVaryNumberFormatter() {

		GenericNameSource s = GenericNameSource.create("an");
		new VaryNumberFormatter().format(s);

		System.out.println(s.toString());
	}

}
