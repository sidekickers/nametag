package org.sidekickers.nametag;

import org.junit.Test;
import static org.junit.Assert.*;

public class PseudoPlayerNameTagBuilderTest {

	@Test
	public void testPseudoPlayerNameTagBuilder() throws InterruptedException {
		PlayerNameTagBuilder builder1 = PseudoPlayerNameTagBuilder.create(7);
		Thread.sleep(100);
		PlayerNameTagBuilder builder2 = PseudoPlayerNameTagBuilder.create(7);

		for (int i = 0; i < 32; i++) {
			assertEquals(builder1.build().getSource(), builder2.build().getSource());
		}

	}

}
