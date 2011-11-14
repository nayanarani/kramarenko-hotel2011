package tickets.typewrap;

import tickets.UnlimitedPass;
import util.CalendarUtil;

public class SeasonPassWrap extends TimeConstraintWrapper {

	public SeasonPassWrap(UnlimitedPass pass) {
		super(pass);
		final int interval = CalendarUtil.DEFAULT_SEASON_DAYS;
		pass.setTimeInterval(interval);
		setTimeInterval(interval);
	}

	@Override
	public void activate() {
		pass.activate();

	}

	@Override
	public String getName() {
		return "Whole season";
	}

	@Override
	public boolean isActivated() {
		return pass.isActivated();
	}

	@Override
	public boolean validate() {
		return pass.validate();
	}

}
