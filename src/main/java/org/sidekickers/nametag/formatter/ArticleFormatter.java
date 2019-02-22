package org.sidekickers.nametag.formatter;

import java.util.List;

import org.sidekickers.nametag.namesource.NameSource;

public class ArticleFormatter implements NameTagFormatter {

	public static final String ARTICLE = "the";

	public NameSource format(NameSource source) {
		List<String> production = source.getProduct();

		production.add(0, ARTICLE);

		return source;
	}

}
