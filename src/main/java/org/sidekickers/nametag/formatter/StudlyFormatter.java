package org.sidekickers.nametag.formatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.sidekickers.nametag.namesource.NameSource;

public class StudlyFormatter implements NameTagFormatter {

	public NameSource format(NameSource source) {

		List<String> product = source.getProduct();

		StringBuilder productBuilder = new StringBuilder(StringUtils.join(product, ""));

		for (int i = 0; i < productBuilder.length(); i++) {
			if (i % 2 == 0) {
				productBuilder.setCharAt(i, Character.toUpperCase(productBuilder.charAt(i)));
			}
		}
		source.setProduct(new ArrayList<String>(Arrays.asList(productBuilder.toString())));

		return source;
	}

}
