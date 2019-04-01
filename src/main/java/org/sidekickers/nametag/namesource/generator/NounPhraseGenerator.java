package org.sidekickers.nametag.namesource.generator;

import java.util.Arrays;
import java.util.Random;

import org.sidekickers.nametag.namesource.NameSource;
import org.sidekickers.nametag.namesource.GenericNameSource;

public class NounPhraseGenerator implements NameSourceGenerator {

	private static final String ADJECTIVE_RESOURCE_PATH = "namesource/nounphrase/adjective.txt";

	private static final String NOUN_RESOURCE_PATH = "namesource/nounphrase/noun.txt";

	private static NounPhraseGenerator singleton;

	private TextFileBaseGenerator adjectiveGenerator;

	private TextFileBaseGenerator nounGenerator;

	private NounPhraseGenerator() {
		this(new Random());
	}

	public NounPhraseGenerator(Random random) {
		this.adjectiveGenerator = new TextFileBaseGenerator(ADJECTIVE_RESOURCE_PATH);
		this.adjectiveGenerator.setRandom(random);
		this.nounGenerator = new TextFileBaseGenerator(NOUN_RESOURCE_PATH);
		this.nounGenerator.setRandom(random);
	}

	public static NounPhraseGenerator newInstance() {

		if (singleton == null) {
			singleton = new NounPhraseGenerator();
		}
		return singleton;
	}

	public NameSource generate() {

		String adj = adjectiveGenerator.generate().toString();
		String n = nounGenerator.generate().toString();

		GenericNameSource source = new GenericNameSource(Arrays.asList(new String[] { adj, n }));
		return source;
	}

}
