package org.sidekickers.nametag.formatter;

import org.junit.Test;
import org.sidekickers.nametag.namesource.NameSource;
import org.sidekickers.nametag.namesource.generator.NounPhraseGenerator;

import static org.junit.Assert.*;

import org.apache.commons.lang3.StringUtils;

public class ArticleFormatterTest {

	@Test
	public void testArticleFormatter() {

		NameSource source = NounPhraseGenerator.newInstance().generate();

		new ArticleFormatter().format(source);

		String productString = StringUtils.join(source.getProduct(), "");

		System.out.println(productString);

		assertEquals(0, productString.indexOf(ArticleFormatter.ARTICLE));

	}

}
