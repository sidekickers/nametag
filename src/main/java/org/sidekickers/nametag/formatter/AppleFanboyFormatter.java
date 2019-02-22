package org.sidekickers.nametag.formatter;

import java.util.List;

import org.sidekickers.nametag.namesource.NameSource;

public class AppleFanboyFormatter implements NameTagFormatter {

	public NameSource format(NameSource source) {
		List<String> sourceProduct = source.getProduct();
		sourceProduct.add(0, "i");

		return source;
	}

}
