package org.sidekickers.nametag.namesource.generator;

import org.junit.Test;
import org.sidekickers.nametag.namesource.NameSource;
import org.sidekickers.nametag.namesource.generator.NounPhraseGenerator;

import static org.junit.Assert.*;

import java.util.Random;

public class NounPhraseGeneratorTest {

	@Test
	public void testNounPhraseGenerator() {

		NounPhraseGenerator gen = NounPhraseGenerator.newInstance();
		NameSource source = gen.generate();
		assertNotNull(source.getSource());
		assertEquals(2, source.getSource().size());

		NounPhraseGenerator pseudoGen1 = new NounPhraseGenerator(new Random(127));
		NounPhraseGenerator pseudoGen2 = new NounPhraseGenerator(new Random(127));

		// same seed yield same result
		assertEquals(pseudoGen1.generate().getSource(), pseudoGen2.generate().getSource());
	}

}
