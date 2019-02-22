package org.sidekickers.nametag.formatter;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.sidekickers.nametag.namesource.GenericNameSource;

public class ZeroFormatterTest {

	@Test
	public void testZeroFormatter() {

		GenericNameSource source = new GenericNameSource(Arrays.asList(new String[] { "Hot", "Orange" }));

		new ZeroFormatter().format(source);

		assertEquals("H0t0range", StringUtils.join(source.getProduct(), ""));

	}

}
