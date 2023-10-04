package viope_9;

import java.util.ArrayList;

public class Crew {
	private ArrayList<Sailor> sailorList;

	public Crew() {
		this.sailorList = new ArrayList<Sailor>();
	}

	public void addCrewMember(Sailor sailor) {
		this.sailorList.add(sailor);
	}

	public String toString() {
		/*
		 * StringBuilder s = new StringBuilder(); for(Sailor sailor : this.sailorList) {
		 * s.append(sailor.getName()); s.append(" ("); s.append(sailor.getEmail());
		 * s.append(")\n");
		 * 
		 * }
		 */
		String output = "";
		for (Sailor sailorObject : this.sailorList) {
			output += sailorObject.getName() + " (" + sailorObject.getEmail() + ")\n";

		}

		return output;

	}

}
