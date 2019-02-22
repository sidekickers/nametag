package org.sidekickers.nametag.formatter;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.sidekickers.nametag.namesource.GenericNameSource;

import static org.junit.Assert.*;

public class StudlyFormatterTest {

	@Test
	public void testStudlyFormatter() {

		GenericNameSource source = new GenericNameSource(Arrays.asList(new String[] { "studly", "caps" }));

		new StudlyFormatter().format(source);

		assertEquals("StUdLyCaPs", StringUtils.join(source.getProduct(), ""));

	}
}
