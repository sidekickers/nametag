package org.sidekickers.nametag.formatter;

import java.util.Calendar;
import java.util.List;

import org.sidekickers.nametag.namesource.NameSource;

public class YearlyFormatter implements NameTagFormatter {

	private static final int MAGIC_NUMBER_MIN = 12;
	private static final int MAGIC_NUMBER_MAX = 48;

	public NameSource format(NameSource source) {
		List<String> sourceProduct = source.getProduct();

		int year = Calendar.getInstance().get(Calendar.YEAR);

		year = year - (int) (Math.random() * (MAGIC_NUMBER_MAX - MAGIC_NUMBER_MIN)) - MAGIC_NUMBER_MIN;

		sourceProduct.add(year + "");

		return source;
	}

}
