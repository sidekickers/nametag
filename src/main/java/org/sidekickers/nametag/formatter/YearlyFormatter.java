package org.sidekickers.nametag.formatter;

import java.util.Calendar;
import java.util.List;
import java.util.Random;

import org.sidekickers.nametag.namesource.NameSource;

public class YearlyFormatter extends RandomNameTagFormatter {

	private static final int MAGIC_NUMBER_MIN = 12;
	private static final int MAGIC_NUMBER_MAX = 48;

	public NameSource format(NameSource source) {
		List<String> sourceProduct = source.getProduct();

		int year = Calendar.getInstance().get(Calendar.YEAR);

		year = year - getRandom().nextInt((MAGIC_NUMBER_MAX - MAGIC_NUMBER_MIN)) - MAGIC_NUMBER_MIN;

		sourceProduct.add(year + "");

		return source;
	}

}
