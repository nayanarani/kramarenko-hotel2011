package tickets;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import util.CalendarUtil;

public abstract class SkiPass {

	private static final long DEFAULT_MOST_SIG_BITS = 1000;
	private static final long DEFAULT_LEAST_SIG_BITS = 100;

	private final UUID id;
	private final Date validUntil;
	private boolean isActivated;
	private boolean isBlocked;

	private long activationTime;

	protected SkiPass() {
		this.id = new UUID(DEFAULT_MOST_SIG_BITS, DEFAULT_LEAST_SIG_BITS);
		final Calendar validUntil = Calendar.getInstance();
		validUntil.add(Calendar.YEAR,
				CalendarUtil.DEFAULT_PASS_EXPIRATION_YEARS);
		this.validUntil = new Date(validUntil.getTimeInMillis());

		isActivated = false;
		isBlocked = false;

	}

	public void activate() {
		isActivated = true;
		activationTime = Calendar.getInstance().getTimeInMillis();
	}

	public void block() {
		isBlocked = true;
	}

	public long getActivationTime() {
		return activationTime;
	}

	public UUID getId() {
		return id;
	}

	public String getType() {
		return new SkiPassTypeNameBuilder(this).build();
	}

	public abstract String getCreditsLeft();

	public Date getValidUntil() {
		return validUntil;
	}

	public boolean isActivated() {
		return isActivated;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public abstract void pass();

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	public void setActivationTime(long activationTime) {
		this.activationTime = activationTime;
	}

	public boolean validate() {
		boolean canPass = false;
		final Calendar now = Calendar.getInstance();
		if (now.getTimeInMillis() <= getValidUntil().getTime()) {
			canPass = true;
		}
		return canPass;
	}

}
