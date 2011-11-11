package tickets;

import tickets.typewrap.EveningPassWrap;
import tickets.typewrap.MorningPassWrap;
import tickets.typewrap.SeasonPassWrap;
import tickets.typewrap.TimeConstraintWrapper;

public class UnlimitedPassBuilder {

	private UnlimitedPass pass;

	public UnlimitedPassBuilder() {
		this.pass = new UnlimitedPass();
	}

	public UnlimitedPassInterval getTimeInterval() {
		return pass.getTimeInterval();
	}

	public UnlimitedPassBuilder setDaily() {
		if (!(pass instanceof TimeConstraintWrapper))
			pass.setTimeInterval(new UnlimitedPassInterval(
					UnlimitedPassInterval.DAILY, 1));
		return this;
	}

	public UnlimitedPassBuilder setDays(int days) {
		if (pass.getTimeInterval().equals(UnlimitedPassInterval.DAILY)
				&& !(pass instanceof TimeConstraintWrapper))
			pass.setTimeInterval(new UnlimitedPassInterval(pass
					.getTimeInterval(), days));
		return this;
	}

	public UnlimitedPassBuilder setEveningConstraint() {
		if (!(pass instanceof TimeConstraintWrapper))
			this.pass = new EveningPassWrap(pass);
		return this;

	}

	public UnlimitedPassBuilder setMorningConstraint() {
		if (!(pass instanceof TimeConstraintWrapper))
			this.pass = new MorningPassWrap(pass);
		return this;
	}

	public UnlimitedPassBuilder setSeason() {
		if (!(pass instanceof TimeConstraintWrapper))
			this.pass = new SeasonPassWrap(pass);
		return this;
	}

	public UnlimitedPass build() {
		if (pass.getTimeInterval().getQuantity() != 0)
			return pass;
		return null;
	}

}
