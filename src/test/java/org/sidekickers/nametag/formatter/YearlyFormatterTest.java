package org.sidekickers.nametag.formatter;

import org.sidekickers.nametag.namesource.NameSource;
import org.sidekickers.nametag.namesource.generator.NounPhraseGenerator;

import static org.junit.Assert.*;

import java.security.SecureRandom;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class YearlyFormatterTest {

	@Test
	public void testYearlyFormatter() {

		YearlyFormatter fmt = new YearlyFormatter();
		fmt.setRandom(new SecureRandom());

		NameSource source = NounPhraseGenerator.newInstance().generate();

		String sourceString = StringUtils.join(source.getSource(), "");

		fmt.format(source);
		String productString = StringUtils.join(source.getProduct(), "");

		assertEquals(4, productString.length() - sourceString.length());

		String diff = productString.substring(sourceString.length());

		System.out.println(productString);
		assertEquals(true, StringUtils.isNumeric(diff));

	}

}
