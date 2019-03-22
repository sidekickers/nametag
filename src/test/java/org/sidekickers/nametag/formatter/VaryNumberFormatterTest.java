package org.sidekickers.nametag.formatter;

import java.security.SecureRandom;

import org.junit.Test;
import org.sidekickers.nametag.namesource.GenericNameSource;

public class VaryNumberFormatterTest {

	@Test
	public void testVaryNumberFormatter() {

		GenericNameSource s = GenericNameSource.create("an");
		VaryNumberFormatter varyNumberFormatter = new VaryNumberFormatter();
		varyNumberFormatter.setRandom(new SecureRandom());
		varyNumberFormatter.format(s);

		System.out.println(s.toString());
	}

}
