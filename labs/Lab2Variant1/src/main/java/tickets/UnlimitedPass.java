package tickets;

import java.util.Calendar;

import tickets.api.HolidayPass;

public class UnlimitedPass extends SkiPass {

	private int interval;

	protected UnlimitedPass(int interval) {
		setTimeInterval(interval);
	}

	public int getInterval() {
		return interval;
	}

	@Override
	public void pass() {
	}

	public void setTimeInterval(int interval) {
		if (interval > 2) {
			if (this instanceof HolidayPass)
				throw new UnsupportedOperationException(
						"No more than 2 days for holiday pass");
			if (interval > 5) {
				throw new UnsupportedOperationException(
						"No more than 5 days for unlimited pass");
			}
		}
		this.interval = interval;
	}

	public int getDaysLeft() {
		int days = 0;
		Calendar now = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		end.setTimeInMillis(getActivationTime());
		end.add(Calendar.DAY_OF_YEAR, interval);
		end.set(Calendar.HOUR_OF_DAY,
				now.getActualMaximum(Calendar.HOUR_OF_DAY));
		end.set(Calendar.MINUTE, now.getActualMaximum(Calendar.MINUTE));
		end.set(Calendar.SECOND, now.getActualMaximum(Calendar.SECOND));
		end.set(Calendar.MILLISECOND,
				now.getActualMaximum(Calendar.MILLISECOND));
		while (end.after(now)) {
			now.add(Calendar.DAY_OF_YEAR, 1);
			days++;
		}
		return days;
	}

	@Override
	public boolean validate() {
		return super.validate() && getDaysLeft() > 0;
	}

	@Override
	public String getCreditsLeft() {
		throw new UnsupportedOperationException("Not Implemented yet");
	}

}
