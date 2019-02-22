package org.sidekickers.nametag.namesource.generator;

import org.junit.Test;
import org.sidekickers.nametag.namesource.NameSource;
import org.sidekickers.nametag.namesource.generator.NounPhraseGenerator;

import static org.junit.Assert.*;

public class NounPhraseGeneratorTest {

	@Test
	public void testNounPhraseGenerator() {

		NounPhraseGenerator gen = NounPhraseGenerator.newInstance();
		NameSource source = gen.generate();
		System.out.println(source.getSource());
		assertEquals(2, source.getSource().size());

	}

}
