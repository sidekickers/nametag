package org.sidekickers.nametag.formatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.sidekickers.nametag.namesource.NameSource;

public class SnakeFormatter implements NameTagFormatter {

	public static final String UNDERSCORE = "_";

	public NameSource format(NameSource source) {

		List<String> product = source.getProduct();

		String snake = StringUtils.join(product, UNDERSCORE);

		source.setProduct(new ArrayList<String>(Arrays.asList(snake)));

		return source;
	}

}
