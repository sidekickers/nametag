package org.sidekickers.nametag.formatter;

import java.util.Random;

public abstract class RandomNameTagFormatter implements NameTagFormatter {

	private Random random;

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

}
