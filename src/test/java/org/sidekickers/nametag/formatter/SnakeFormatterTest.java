package org.sidekickers.nametag.formatter;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.sidekickers.nametag.namesource.GenericNameSource;

import static org.junit.Assert.assertEquals;

public class SnakeFormatterTest {

	@Test
	public void testSnakeFormatter() {

		GenericNameSource source = new GenericNameSource(Arrays.asList(new String[] { "snake", "case" }));
		new SnakeFormatter().format(source);

		assertEquals("snake_case", StringUtils.join(source.getProduct(), ""));
	}
}
