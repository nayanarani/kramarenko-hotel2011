package util;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class CalendarUtil {

	public static final int DEFAULT_SEASON_BEGIN_MONTH = 12;
	public static final int DEFAULT_SEASON_BEGIN_DAY_OF_MONTH = 1;
	public static final int DEFAULT_SEASON_DAYS = 120;
	public static final int DEFAULT_PASS_EXPIRATION_YEARS = 3;
	
	public static final long MS_IN_MINUTE = 60000;
	public static final long MS_IN_HOUR = 3600000;
	public static final long MS_IN_DAY = 86400000;
	public static final long MS_IN_MONTH = 3600000;

	private static final Locale DEFAULT_LOCALE = Locale.getDefault();

	private Locale locale;

	public CalendarUtil() {
		this(DEFAULT_LOCALE);
	}

	public CalendarUtil(Locale locale) {
		setLocale(locale);
	}

	private List<Date> getHolidayList() {
		// here we acess the resourse file or DB with current locale holidays
		return null;
	}

	public boolean isHoliday(Date date) {
		Calendar calendarDate = Calendar.getInstance(DEFAULT_LOCALE);
		calendarDate.setTime(date);
		return getHolidayList().contains(calendarDate)
				&& (calendarDate.get(Calendar.DAY_OF_WEEK) == 1 || calendarDate
						.get(Calendar.DAY_OF_WEEK) == 6);
	}

	public boolean isWorkday(Date day) {
		return !isHoliday(day);
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

}
