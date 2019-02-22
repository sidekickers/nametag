package org.sidekickers.nametag.formatter;

import org.junit.Test;
import org.sidekickers.nametag.namesource.NameSource;
import org.sidekickers.nametag.namesource.generator.NounPhraseGenerator;

import static org.junit.Assert.*;

import org.apache.commons.lang3.StringUtils;

public class ClanFormatterTest {

	@Test
	public void testClanFormatter() {
		NameSource source = NounPhraseGenerator.newInstance().generate();

		String sourceName = StringUtils.join(source.getSource(), "");

		new ClanFormatter().format(source);

		String productName = StringUtils.join(source.getProduct(), "");

		System.out.println(productName);

		assertEquals(ClanFormatter.CLAN_LENGTH, productName.indexOf(ClanFormatter.UNDERSCORE));

	}

}
