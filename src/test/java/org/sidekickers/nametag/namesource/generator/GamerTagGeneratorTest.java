package org.sidekickers.nametag.namesource.generator;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.sidekickers.nametag.namesource.NameSource;

import static org.junit.Assert.*;

import java.util.Random;

public class GamerTagGeneratorTest {

	@Test
	public void testGamerTagGenerator() {
		GamerTagGenerator generator = GamerTagGenerator.newInstance();
		generator.setRandom(new Random(127));
		NameSource source = generator.generate();
		assertTrue(StringUtils.join(source.getProduct(), "").length() >= 5);

		// pseudo generation test
		GamerTagGenerator pseudoGenerator = GamerTagGenerator.newInstance();
		pseudoGenerator.setRandom(new Random(127));
		NameSource pseudoSource = pseudoGenerator.generate();

		assertEquals(source.getSource(), pseudoSource.getSource());
	}

}
