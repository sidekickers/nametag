package org.sidekickers.nametag.formatter;

import java.util.List;

import org.sidekickers.nametag.namesource.NameSource;

public class NumberedFormatter implements NameTagFormatter {

	private int digits;

	public NumberedFormatter() {

	}

	public NumberedFormatter(int digits) {
		this.digits = digits;
	}

	protected String numberSalt(int digit) {
		int base = (int) Math.pow(10, digit - 1);
		if (digit == 0) {
			base = 0;
		}
		int rand = (int) ((Math.random() * (Math.pow(10, digit) - base)));

		return (base + rand) + "";
	}

	public NameSource format(NameSource source) {
		List<String> product = source.getProduct();
		product.add(this.numberSalt(digits));
		return source;
	}

	public int getDigits() {
		return digits;
	}

	public void setDigits(int digits) {
		this.digits = digits;
	}

}
