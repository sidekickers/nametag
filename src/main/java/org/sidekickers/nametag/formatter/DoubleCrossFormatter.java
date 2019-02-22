package org.sidekickers.nametag.formatter;

public class DoubleCrossFormatter extends SymmetricFormatter {

	private static final String PREFIX = "xX";

	private static final String POSTFIX = "Xx";

	@Override
	public String getPostfix() {
		return PREFIX;
	}

	@Override
	public String getPrefix() {
		return POSTFIX;
	}

}
