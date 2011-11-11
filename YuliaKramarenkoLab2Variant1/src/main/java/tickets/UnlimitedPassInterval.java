package tickets;

import util.CalendarUtil;

public class UnlimitedPassInterval {

	public static final UnlimitedPassInterval DAILY = new UnlimitedPassInterval(
			CalendarUtil.MS_IN_DAY, 1, "day");
	public static final UnlimitedPassInterval HOURLY = new UnlimitedPassInterval(
			CalendarUtil.MS_IN_HOUR, 1, "hour");

	public UnlimitedPassInterval(UnlimitedPassInterval timeInterval,
			int quantity) {
		this(timeInterval.getInterval(), quantity, timeInterval.getName());
	}

	private final long interval;

	private final int quantity;

	private final String name;

	private UnlimitedPassInterval(long interval, int quantity, String name) {
		this.interval = interval;
		this.quantity = quantity;
		StringBuilder nameBuilder = new StringBuilder(this.name);
		nameBuilder.insert(0, "" + quantity + " ");
		if (quantity % 10 != 1) {
			nameBuilder.insert(name.length() - 1, "s");
		}
		this.name = nameBuilder.toString();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (interval ^ (interval >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnlimitedPassInterval other = (UnlimitedPassInterval) obj;
		if (interval != other.interval)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	public long getInterval() {
		return interval;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getName() {
		return name;
	}

	public long getTime() {
		return interval * quantity;
	}

}
