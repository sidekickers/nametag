package org.sidekickers.nametag.formatter;

import java.util.List;

import org.sidekickers.nametag.namesource.NameSource;

public class AllCapFormatter implements NameTagFormatter {

	public NameSource format(NameSource source) {

		List<String> p = source.getProduct();

		for (int i = 0; i < p.size(); i++) {
			p.set(i, p.get(i).toUpperCase());
		}

		return source;
	}

}
