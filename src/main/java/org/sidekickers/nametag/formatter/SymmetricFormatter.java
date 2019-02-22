package org.sidekickers.nametag.formatter;

import java.util.List;

import org.sidekickers.nametag.namesource.NameSource;

public abstract class SymmetricFormatter implements NameTagFormatter {

	public NameSource format(NameSource source) {
		List<String> product = source.getProduct();
		product.add(0, getPrefix());
		product.add(getPostfix());

		return source;
	}

	public abstract String getPostfix();

	public abstract String getPrefix();

}
