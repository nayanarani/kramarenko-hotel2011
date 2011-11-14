package tickets.typewrap;

import java.util.Calendar;
import java.util.Date;

import tickets.SkiPass;
import tickets.api.WorkdayPass;
import util.CalendarUtil;

public class WorkdayPassWrap extends WeekdayWrapper implements WorkdayPass{

	public WorkdayPassWrap(SkiPass pass) {
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
		return pass.validate() && calendarUtil.isWorkday(now);
	}

}
