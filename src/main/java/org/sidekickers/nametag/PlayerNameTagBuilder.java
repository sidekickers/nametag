package org.sidekickers.nametag;

import java.util.List;

import org.sidekickers.nametag.formatter.NameTagFormatter;
import org.sidekickers.nametag.namesource.NameSource;
import org.sidekickers.nametag.namesource.generator.NameSourceGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerNameTagBuilder extends NameTagBuilder {

	private List<List<NameTagFormatter>> nameTagFormatterGroups;

	private List<NameSourceGenerator> nameSourceGenerators;

	private static PlayerNameTagBuilder singleton;

	private static final String APPLICATION_CONTEXT_XML = "applicationContext.xml";

	@Override
	public NameSource build() {
		NameSource nameSource = nameSourceGenerators.get((int) (nameSourceGenerators.size() * Math.random()))
				.generate();

		List<NameTagFormatter> formatterGroup = nameTagFormatterGroups
				.get((int) (Math.random() * nameTagFormatterGroups.size()));

		for (NameTagFormatter formatter : formatterGroup) {
			formatter.format(nameSource);
		}

		return nameSource;
	}

	@Override
	public String buildLiteral() {
		return build().toString();
	}

	public List<NameSourceGenerator> getNameSourceGenerators() {
		return nameSourceGenerators;
	}

	public void setNameSourceGenerators(List<NameSourceGenerator> nameSourceGenerators) {
		this.nameSourceGenerators = nameSourceGenerators;
	}

	public List<List<NameTagFormatter>> getNameTagFormatterGroups() {
		return nameTagFormatterGroups;
	}

	public void setNameTagFormatterGroups(List<List<NameTagFormatter>> nameTagFormatterGroups) {
		this.nameTagFormatterGroups = nameTagFormatterGroups;
	}

	public static PlayerNameTagBuilder create() {
		if (singleton == null) {
			ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_XML);
			singleton = (PlayerNameTagBuilder) context.getBean("playerNameTagBuilder");
		}

		return singleton;
	}

}
