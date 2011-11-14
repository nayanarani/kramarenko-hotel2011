package tickets.typewrap;

import tickets.SkiPass;

public abstract class WeekdayWrapper extends SkiPass {

	protected SkiPass pass;

	protected WeekdayWrapper(SkiPass pass) {
		this.pass = pass;
	}

	@Override
	public abstract void activate();

	@Override
	public abstract boolean isActivated();

	@Override
	public void pass() {
		pass.pass();
	}

	@Override
	public String getCreditsLeft() {
		return pass.getCreditsLeft();
	}

	@Override
	public abstract boolean validate();

}
