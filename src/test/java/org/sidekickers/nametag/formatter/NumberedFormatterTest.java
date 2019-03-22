package org.sidekickers.nametag.formatter;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.sidekickers.nametag.namesource.NameSource;
import org.sidekickers.nametag.namesource.generator.NounPhraseGenerator;

import static org.junit.Assert.*;

import java.security.SecureRandom;

public class NumberedFormatterTest {

	@Test
	public void testNumberedFormatter() {

		NameSource source = NounPhraseGenerator.newInstance().generate();
		NumberedFormatter numberedFormatter1 = new NumberedFormatter(3);
		numberedFormatter1.setRandom(new SecureRandom());
		numberedFormatter1.format(source);

		// test 1
		String sourceString = StringUtils.join(source.getSource(), "");
		String productString = StringUtils.join(source.getProduct(), "");

		assertEquals(true, productString.substring(0, sourceString.length()).equals(sourceString));
		String numberSalt = productString.substring(sourceString.length());
		assertEquals(true, StringUtils.isNumeric(numberSalt));
		assertEquals(3, numberSalt.length());

		// test 2
		source = NounPhraseGenerator.newInstance().generate();
		NumberedFormatter numberedFormatter2 = new NumberedFormatter(1);
		numberedFormatter2.setRandom(new SecureRandom());
		numberedFormatter2.format(source);
		sourceString = StringUtils.join(source.getSource(), "");
		productString = StringUtils.join(source.getProduct(), "");
		assertEquals(1, productString.length() - sourceString.length());
	}

}
