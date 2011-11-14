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

	public Locale getLocale() {
		return locale;
	}

	public boolean isHoliday(Date date) {
		final Calendar calendarDate = Calendar.getInstance(DEFAULT_LOCALE);
		calendarDate.setTime(date);
		return getHolidayList().contains(calendarDate)
				&& (calendarDate.get(Calendar.DAY_OF_WEEK) == 1 || calendarDate
						.get(Calendar.DAY_OF_WEEK) == 6);
	}

	public boolean isWorkday(Date day) {
		return !isHoliday(day);
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

}
