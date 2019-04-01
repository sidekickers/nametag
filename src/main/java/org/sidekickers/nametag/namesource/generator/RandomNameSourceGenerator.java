package org.sidekickers.nametag.namesource.generator;

import java.util.Random;

public abstract class RandomNameSourceGenerator implements NameSourceGenerator {

	private Random random;

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

}
