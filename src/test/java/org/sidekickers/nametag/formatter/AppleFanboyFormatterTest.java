package org.sidekickers.nametag.formatter;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.sidekickers.nametag.namesource.GenericNameSource;
import static org.junit.Assert.*;

public class AppleFanboyFormatterTest {

	@Test
	public void testAppleFanboyFormatter() {

		GenericNameSource source = new GenericNameSource(Arrays.asList(new String[] { "Fan", "boy" }));

		new AppleFanboyFormatter().format(source);

		assertEquals("iFanboy", StringUtils.join(source.getProduct(), ""));

	}

}
