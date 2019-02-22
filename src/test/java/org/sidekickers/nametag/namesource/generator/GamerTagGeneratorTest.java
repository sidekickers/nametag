package org.sidekickers.nametag.namesource.generator;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.sidekickers.nametag.namesource.NameSource;

import static org.junit.Assert.*;

public class GamerTagGeneratorTest {

	@Test
	public void testGamerTagGenerator() {
		NameSource source = GamerTagGenerator.newInstance().generate();

		assertTrue(StringUtils.join(source.getProduct(), "").length() >= 5);
	}

}
