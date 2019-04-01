package org.sidekickers.nametag;

import java.util.List;
import java.util.Random;

import org.sidekickers.nametag.formatter.NameTagFormatter;
import org.sidekickers.nametag.namesource.NameSource;
import org.sidekickers.nametag.namesource.generator.NameSourceGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PseudoPlayerNameTagBuilder extends PlayerNameTagBuilder {

	private static final String APPLICATION_CONTEXT_XML = "applicationContext.xml";

	private Random random;

	public PseudoPlayerNameTagBuilder(long seed) {
		this.random = new Random(seed);
	}

	@Override
	public NameSource build() {

		List<NameSourceGenerator> generators = this.getNameSourceGenerators();
		NameSource nameSource = generators.get(random.nextInt(generators.size())).generate();

		List<List<NameTagFormatter>> nameTagFormatterGroups = this.getNameTagFormatterGroups();
		List<NameTagFormatter> formatterGroup = nameTagFormatterGroups
				.get(random.nextInt(nameTagFormatterGroups.size()));

		for (NameTagFormatter formatter : formatterGroup) {
			formatter.format(nameSource);
		}

		return nameSource;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public static PseudoPlayerNameTagBuilder create(long seed) {
		ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_XML);

		PseudoPlayerNameTagBuilder builder = (PseudoPlayerNameTagBuilder) context.getBean("pseudoPlayerNameTagBuilder",
				seed);

		List<NameSourceGenerator> nameSourceGenerator = (List<NameSourceGenerator>) context
				.getBean("pseudoNameSourceGenerators");
		builder.setNameSourceGenerators(nameSourceGenerator);

		List<List<NameTagFormatter>> formatterGroups = (List<List<NameTagFormatter>>) context
				.getBean("pseudoNameTagFormatterGroups");
		builder.setNameTagFormatterGroups(formatterGroups);

		return builder;

	}

}
