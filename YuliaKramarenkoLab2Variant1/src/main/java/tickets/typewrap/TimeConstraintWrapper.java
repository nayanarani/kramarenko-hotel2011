package tickets.typewrap;

import tickets.UnlimitedPass;

public abstract class TimeConstraintWrapper extends UnlimitedPass {

	protected UnlimitedPass pass;

	public TimeConstraintWrapper(UnlimitedPass pass) {
		super(pass.getTimeInterval());
		this.pass = pass;
	}

	@Override
	public void pass() {
		pass.pass();
	}

	@Override
	public String getType() {
		return pass.getType()
				+ (!(pass instanceof TimeConstraintWrapper) ? " Valid: " : "");
	}

	@Override
	public abstract boolean validate();

	@Override
	public abstract boolean isActivated();

	@Override
	public abstract void activate();

}
