package tickets.typewrap;

import tickets.UnlimitedPass;
import tickets.UnlimitedPassInterval;
import util.CalendarUtil;

public class SeasonPassWrap extends TimeConstraintWrapper {

	public SeasonPassWrap(UnlimitedPass pass) {
		super(pass);
		UnlimitedPassInterval timeInterval = new UnlimitedPassInterval(
				UnlimitedPassInterval.DAILY, CalendarUtil.DEFAULT_SEASON_DAYS);
		pass.setTimeInterval(timeInterval);
		setTimeInterval(timeInterval);
	}

	@Override
	public boolean validate() {
		return pass.validate();
	}

	@Override
	public String getType() {
		return "Unlimited season pass";
	}

	@Override
	public boolean isActivated() {
		return pass.isActivated();
	}

	@Override
	public void activate() {
		pass.activate();

	}


}
