package org.sidekickers.nametag;

import org.sidekickers.nametag.namesource.NameSource;

public abstract class NameTagBuilder {

	public abstract NameSource build();

	public abstract String buildLiteral();

}
