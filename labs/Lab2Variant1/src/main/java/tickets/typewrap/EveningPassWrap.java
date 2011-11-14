package tickets.typewrap;

import java.util.Calendar;

import tickets.UnlimitedPass;

public class EveningPassWrap extends TimeConstraintWrapper {

	private static final int BEGIN_HOUR = 18;

	private static final int END_HOUR = 22;

	public EveningPassWrap(UnlimitedPass pass) {
		super(pass);
	}

	@Override
	public void activate() {
		pass.activate();

	}

	@Override
	public String getName() {
		return "evening time (from " + BEGIN_HOUR + " to " + END_HOUR + ")";
	}

	@Override
	public boolean isActivated() {
		return pass.isActivated();
	}

	@Override
	public boolean validate() {
		final int nowHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		return pass.validate() && nowHour >= BEGIN_HOUR && nowHour < END_HOUR;
	}

}
