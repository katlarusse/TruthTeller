package org.formation.TruthTeller;

public class TellTruthImpl implements ITellTruth {

	public String tellTheTruth(boolean t) {
		if (t == true) {
			return "This is true";
		}
		return "This is false";

	}

}
