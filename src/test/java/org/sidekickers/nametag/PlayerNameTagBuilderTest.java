package org.sidekickers.nametag;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerNameTagBuilderTest {

	@Test
	public void testPlayerNameTagBuilder() {
		PlayerNameTagBuilder builder = PlayerNameTagBuilder.create();

		assertNotNull(builder);

		for (int i = 0; i < 1000; i++) {
			System.out.println(builder.build());
		}
	}

}
