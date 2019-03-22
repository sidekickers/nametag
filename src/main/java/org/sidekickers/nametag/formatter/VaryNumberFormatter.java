package org.sidekickers.nametag.formatter;

import java.util.List;

import org.sidekickers.nametag.namesource.NameSource;

public class VaryNumberFormatter extends NumberedFormatter {

	private static final int COMMON_LENGTH = 13;

	private static final int SALT_LENGTH_MIN = 2;
	private static final int SALT_LENGTH_MAX = 8;

	@Override
	public NameSource format(NameSource source) {
		List<String> product = source.getProduct();

		// the longer the product, the shorter the salt
		double baseLength = COMMON_LENGTH - source.toString().length();

		// range in -1, 0, 1
		int varyLength = this.getRandom().nextInt(3) - 1;

		int saltLength = (int) Math.max(Math.min(baseLength + varyLength, SALT_LENGTH_MAX), SALT_LENGTH_MIN);

		product.add(this.numberSalt(saltLength));
		return source;
	}

}
