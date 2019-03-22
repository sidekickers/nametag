package org.sidekickers.nametag.formatter;

import org.sidekickers.nametag.namesource.NameSource;

public class ClanFormatter extends RandomNameTagFormatter {

	private static final int ASCII_MIN = 65;
	private static final int ASCII_MAX = 90;
	public static final char UNDERSCORE = '_';

	public static final int CLAN_LENGTH = 3;

	public NameSource format(NameSource source) {
		StringBuffer buff = new StringBuffer();

		for (int i = 0; i < CLAN_LENGTH; i++) {
			char c = (char) (ASCII_MIN + getRandom().nextInt(ASCII_MAX - ASCII_MIN));
			buff.append(c);
		}
		buff.append(UNDERSCORE);

		source.getProduct().add(0, buff.toString());

		return source;
	}

}
