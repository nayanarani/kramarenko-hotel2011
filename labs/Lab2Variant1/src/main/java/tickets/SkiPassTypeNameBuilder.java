package tickets;

import tickets.typewrap.HolidayPassWrap;
import tickets.typewrap.TimeConstraintWrapper;
import tickets.typewrap.WorkdayPassWrap;

public class SkiPassTypeNameBuilder {

	private static final String SKI_PASS_NAME = "Candy Mountain Ski-Pass";
	private static final String COUNT_PASS_NAME = "Per-lift";
	private static final String UNLIMITED_PASS_NAME = "Unlimited";
	private static final String HOLIDAY_PASS_ONLY = "Holiday acess only";
	private static final String WORKDAY_PASS_ONLY = "Workday acess only";
	private final SkiPass pass;

	public SkiPassTypeNameBuilder(SkiPass pass) {
		this.pass = pass;
	}

	public String build() {
		return SKI_PASS_NAME + " " + liftCountTypeName() + " "
				+ constraintTypeName() + " " + weekDayTypeName();
	}

	private String constraintTypeName() {
		String type = "";
		if (pass instanceof TimeConstraintWrapper)
			type = ((TimeConstraintWrapper) pass).getConstraintName();
		return type;
	}

	private String liftCountTypeName() {
		String type = "";
		if (pass instanceof CountPass)
			type = COUNT_PASS_NAME;
		if (pass instanceof UnlimitedPass)
			type = UNLIMITED_PASS_NAME;
		return type;
	}

	private String weekDayTypeName() {
		String type = "";
		if (pass instanceof HolidayPassWrap)
			type = HOLIDAY_PASS_ONLY;
		if (pass instanceof WorkdayPassWrap)
			type = WORKDAY_PASS_ONLY;
		return type;
	}
}
