package org.formation.TruthTeller;

import junit.framework.TestCase;

public class TellTruthImplTest extends TestCase {

	public void testTellTheTruth() {
		
		ITellTruth fortuneTeller = new TellTruthImpl();
		boolean t = true;
		
		assertSame("This is true", fortuneTeller.tellTheTruth(t));
	}

}
