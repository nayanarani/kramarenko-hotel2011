package tickets.typewrap;

import java.util.Calendar;
import java.util.Date;

import tickets.SkiPass;
import util.CalendarUtil;

public class HolidayPassWrap extends WeekdayWrapper {

	protected HolidayPassWrap(SkiPass pass) {
		super(pass);
	}

	@Override
	public String getType() {
		return pass.getType() + " Holiday access";
	}

	@Override
	public boolean validate() {
		Date now = new Date(Calendar.getInstance().getTimeInMillis());
		CalendarUtil calendarUtil = new CalendarUtil();
		return pass.validate() && calendarUtil.isHoliday(now);
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
