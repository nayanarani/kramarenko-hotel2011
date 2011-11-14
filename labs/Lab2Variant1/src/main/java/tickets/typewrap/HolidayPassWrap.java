package tickets.typewrap;

import java.util.Calendar;
import java.util.Date;

import tickets.SkiPass;
import tickets.api.HolidayPass;
import util.CalendarUtil;

public class HolidayPassWrap extends WeekdayWrapper implements HolidayPass{

	public HolidayPassWrap(SkiPass pass) {
		super(pass);
	}

	@Override
	public void activate() {
		pass.activate();
	}

	@Override
	public boolean isActivated() {
		return pass.isActivated();
	}

	@Override
	public boolean validate() {
		final Date now = new Date(Calendar.getInstance().getTimeInMillis());
		final CalendarUtil calendarUtil = new CalendarUtil();
		return pass.validate() && calendarUtil.isHoliday(now);
	}

}
