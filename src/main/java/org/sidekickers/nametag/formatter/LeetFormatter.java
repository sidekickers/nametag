package org.sidekickers.nametag.formatter;

import java.util.List;

import org.apache.commons.configuration2.ConfigurationMap;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.sidekickers.nametag.namesource.NameSource;

public class LeetFormatter implements NameTagFormatter {

	private ConfigurationMap leetMap;

	private static final String LEET_MAP_PATH = "formatter/leet/leet.properties";

	private static LeetFormatter singleton;

	private LeetFormatter() {
		Configurations configs = new Configurations();

		try {
			PropertiesConfiguration prop = configs
					.properties(LeetFormatter.class.getClassLoader().getResource(LEET_MAP_PATH));
			leetMap = new ConfigurationMap(prop);
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static LeetFormatter newInstance() {
		if (singleton == null) {
			singleton = new LeetFormatter();
		}
		return singleton;
	}

	public NameSource format(NameSource source) {
		List<String> product = source.getProduct();

		for (int p = 0; p < product.size(); p++) {
			String s = product.get(p);

			for (int q = 0; q < s.length(); q++) {
				char c = s.charAt(q);
				String leetString = (String) this.leetMap.get(c);
				if (leetString != null) {
					s = s.replace(c + "", leetString);
				}
			}

			product.set(p, s);

		}
		return source;
	}

}
