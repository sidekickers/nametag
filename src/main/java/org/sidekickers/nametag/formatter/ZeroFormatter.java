package org.sidekickers.nametag.formatter;

import java.util.List;

import org.sidekickers.nametag.namesource.NameSource;

public class ZeroFormatter implements NameTagFormatter {

	public NameSource format(NameSource source) {
		List<String> product = source.getProduct();

		for (int i = 0; i < product.size(); i++) {
			String s = product.get(i);
			s = s.replace("o", "0");
			s = s.replace("O", "0");
			product.set(i, s);
		}
		return source;
	}

}
