package org.sidekickers.nametag.namesource.generator;

import java.util.ArrayList;
import java.util.Collections;
import org.sidekickers.nametag.namesource.GenericNameSource;
import org.sidekickers.nametag.namesource.NameSource;

public class GamerTagGenerator extends TextFileBaseGenerator {

	private static final String GAMER_TAG_RESOURCE = "namesource/gamertag/gamertag.txt";

	private static GamerTagGenerator singleton;

	private static final int COMMON_LENGTH = 5;

	private GamerTagGenerator() {
		super(GAMER_TAG_RESOURCE);
	}

	public static GamerTagGenerator newInstance() {

		if (singleton == null) {
			singleton = new GamerTagGenerator();
		}
		return singleton;
	}

	@Override
	public NameSource generate() {

		if (getResources() == null) {
			this.fetch();
		}

		ArrayList<String> gamertagPool = new ArrayList<String>(this.getResources());
		Collections.copy(gamertagPool, this.getResources());

		StringBuilder gamertagBuilder = new StringBuilder();
		ArrayList<String> gamertagSource = new ArrayList<String>();
		while (gamertagBuilder.length() < COMMON_LENGTH) {
			String tag = gamertagPool.remove(this.getRandom().nextInt(gamertagPool.size()));
			gamertagBuilder.append(tag);
			gamertagSource.add(tag);
		}
		return new GenericNameSource(gamertagSource);
	}

}
