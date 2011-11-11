package tickets.typewrap;

import tickets.SkiPass;

public abstract class WeekdayWrapper extends SkiPass {

	protected SkiPass pass;
	
	protected WeekdayWrapper(SkiPass pass){
		this.pass = pass;
	}
	
	@Override
	public void pass() {
		pass.pass();
	}

	@Override
	public abstract String getType();

	@Override
	public abstract boolean validate();

	@Override
	public abstract boolean isActivated();

	@Override
	public abstract void activate();

}
