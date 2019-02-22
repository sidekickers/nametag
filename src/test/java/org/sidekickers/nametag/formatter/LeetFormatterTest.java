package org.sidekickers.nametag.formatter;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.sidekickers.nametag.namesource.GenericNameSource;

import static org.junit.Assert.*;

public class LeetFormatterTest {

	@Test
	public void testLeetFormatter() {

		GenericNameSource source = new GenericNameSource(Arrays.asList(new String[] { "BaSIC", "LEET" }));
		LeetFormatter.newInstance().format(source);

		assertEquals("B@51CL337", StringUtils.join(source.getProduct(), ""));

	}
}
