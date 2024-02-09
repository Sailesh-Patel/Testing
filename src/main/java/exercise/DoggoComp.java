package exercise;

import java.util.ArrayList;
import java.util.List;

public class DoggoComp {

	public List<String> compete(int place) {
		List<String> placements = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			if (i == place) {
				continue;
			}
			String suffix = "";

			if (i == 11 || i == 12 || i == 13) {
				suffix = "th";
			} else if (i % 10 == 1) {
				suffix = "st";
			} else if (i % 10 == 2) {
				suffix = "nd";
			} else if (i % 10 == 3) {
				suffix = "rd";
			} else {
				suffix = "th";
			}

			placements.add(i + suffix);
		}

		return placements;
	}

}