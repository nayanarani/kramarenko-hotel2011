package system;

import tickets.CountPass;
import tickets.SkiPass;
import tickets.UnlimitedPassBuilder;
import tickets.typewrap.HolidayPassWrap;
import tickets.typewrap.WorkdayPassWrap;

public class SkiPassFactory {

	public static final SkiPassFactory INSTANCE = new SkiPassFactory();

	private SkiPassFactory() {
	}

	public SkiPass letOut100LiftsPass(boolean holiday) {
		final SkiPass countPass = new CountPass(100);
		return (holiday) ? new HolidayPassWrap(countPass)
				: new WorkdayPassWrap(countPass);
	}

	public SkiPass letOut10LiftsPass(boolean holiday) {
		final SkiPass countPass = new CountPass(10);
		return (holiday) ? new HolidayPassWrap(countPass)
				: new WorkdayPassWrap(countPass);
	}

	public SkiPass letOut1DayPass(boolean holiday) {
		final SkiPass unlimitedPass = new UnlimitedPassBuilder().setDays(1)
				.build();
		return (holiday) ? new HolidayPassWrap(unlimitedPass)
				: new WorkdayPassWrap(unlimitedPass);
	}

	public SkiPass letOut20LiftsPass(boolean holiday) {
		final SkiPass countPass = new CountPass(20);
		return (holiday) ? new HolidayPassWrap(countPass)
				: new WorkdayPassWrap(countPass);
	}

	public SkiPass letOut50LiftsPass(boolean holiday) {
		final SkiPass countPass = new CountPass(50);
		return (holiday) ? new HolidayPassWrap(countPass)
				: new WorkdayPassWrap(countPass);
	}

	public SkiPass letOut5DayPass(boolean holiday) {
		final SkiPass unlimitedPass = new UnlimitedPassBuilder().setDays(5)
				.build();
		return (holiday) ? new HolidayPassWrap(unlimitedPass)
				: new WorkdayPassWrap(unlimitedPass);
	}

	public SkiPass letOutHalfDayEveningPass(boolean holiday) {
		final SkiPass unlimitedPass = new UnlimitedPassBuilder().setDays(1)
				.setEveningConstraint().build();
		return (holiday) ? new HolidayPassWrap(unlimitedPass)
				: new WorkdayPassWrap(unlimitedPass);
	}

	public SkiPass letOutHalfDayMorningPass(boolean holiday) {
		final SkiPass unlimitedPass = new UnlimitedPassBuilder().setDays(1)
				.setMorningConstraint().build();
		return (holiday) ? new HolidayPassWrap(unlimitedPass)
				: new WorkdayPassWrap(unlimitedPass);
	}

	public SkiPass letOutSeasonPass() {
		return new UnlimitedPassBuilder().setSeason().build();
	}

}
