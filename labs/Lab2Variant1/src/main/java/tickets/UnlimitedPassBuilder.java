package tickets;

import tickets.typewrap.EveningPassWrap;
import tickets.typewrap.MorningPassWrap;
import tickets.typewrap.SeasonPassWrap;
import tickets.typewrap.TimeConstraintWrapper;

public class UnlimitedPassBuilder {

	private UnlimitedPass pass;

	public UnlimitedPassBuilder() {
		this.pass = new UnlimitedPass(0);
	}

	public UnlimitedPass build() {
		if (pass.getInterval() != 0)
			return pass;
		return null;
	}

	public int getTimeInterval() {
		return pass.getInterval();
	}

	public UnlimitedPassBuilder setDays(int days) {
		if (!(pass instanceof SeasonPassWrap)) {
			pass.setTimeInterval(days);
		}
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

}
