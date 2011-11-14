package tickets.typewrap;

import tickets.UnlimitedPass;

public abstract class TimeConstraintWrapper extends UnlimitedPass {

	protected UnlimitedPass pass;

	public TimeConstraintWrapper(UnlimitedPass pass) {
		super(pass.getInterval());
		this.pass = pass;
	}

	@Override
	public abstract void activate();

	public String getConstraintName() {
		return (!(pass instanceof TimeConstraintWrapper) ? " Valid for: "
				+ getName() : "");
	}

	public abstract String getName();

	@Override
	public abstract boolean isActivated();

	@Override
	public void pass() {
		pass.pass();
	}

	@Override
	public abstract boolean validate();

}
