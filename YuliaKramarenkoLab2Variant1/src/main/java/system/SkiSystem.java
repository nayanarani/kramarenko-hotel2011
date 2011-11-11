package system;

import tickets.SkiPass;
import tickets.UnlimitedPassBuilder;

public class SkiSystem {

	public SkiPass letOutMorningPass(boolean holiday) {
		return new UnlimitedPassBuilder().setMorningConstraint().build();
	}

	public SkiPass letOutEveningPass(boolean holiday) {
		return new UnlimitedPassBuilder().setEveningConstraint().build();
	}

	public SkiPass letOutSeasonPass() {
		return new UnlimitedPassBuilder().setSeason().build();
	}

	public SkiPass letOut1DayPass(boonmlean holiday) {
		return new UnlimitedPassBuilder().setDaily().setDays(1).build();
	}

	public SkiPass letOut5DayPass(boolean holiday) {
		return new UnlimitedPassBuilder().setDaily().setDays(5).build();
	}

	public SkiPass letOut10DayPass(boolean holiday) {
		return new UnlimitedPassBuilder().setDaily().setDays(10).build();
	}

	public SkiPass letOut20DayPass(boolean holiday) {
		return new UnlimitedPassBuilder().setDaily().setDays(20).build();
	}

}
