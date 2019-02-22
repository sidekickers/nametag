package org.sidekickers.nametag.formatter;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.sidekickers.nametag.namesource.NameSource;

public class TitleFormatter implements NameTagFormatter {

	public NameSource format(NameSource source) {
		List<String> product = source.getProduct();
		for (int i = 0; i < product.size(); i++) {
			String title = StringUtils.capitalize(product.get(i));
			product.set(i, title);
		}
		return source;
	}

}
