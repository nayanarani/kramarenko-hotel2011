package tickets.typewrap;

import java.util.Calendar;

import tickets.UnlimitedPass;

public class MorningPassWrap extends TimeConstraintWrapper {

	public MorningPassWrap(UnlimitedPass pass) {
		super(pass);
	}

	private static final int BEGIN_HOUR = 8;
	private static final int END_HOUR = 12;

	@Override
	public boolean validate() {
		int nowHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		return pass.validate() && nowHour >= BEGIN_HOUR && nowHour < END_HOUR;
	}

	@Override
	public String getType() {
		return super.getType() + " morning time (from " + BEGIN_HOUR + " to "
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
