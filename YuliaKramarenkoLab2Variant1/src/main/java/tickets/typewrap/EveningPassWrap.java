package tickets.typewrap;

import java.util.Calendar;

import tickets.UnlimitedPass;

public class EveningPassWrap extends TimeConstraintWrapper {

	public EveningPassWrap(UnlimitedPass pass) {
		super(pass);
	}

	private static final int BEGIN_HOUR = 18;
	private static final int END_HOUR = 22;

	@Override
	public boolean validate() {
		int nowHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		return pass.validate() && nowHour >= BEGIN_HOUR && nowHour < END_HOUR;
	}

	@Override
	public String getType() {
		return super.getType() + " evening time (from " + BEGIN_HOUR + " to "
				+ END_HOUR + ")";
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
