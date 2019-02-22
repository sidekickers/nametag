package org.sidekickers.nametag.formatter;

public class BigOFormatter extends SymmetricFormatter {

	private static final String PATTERN = "o0o";

	@Override
	public String getPostfix() {
		return PATTERN;
	}

	@Override
	public String getPrefix() {
		return PATTERN;
	}

}
