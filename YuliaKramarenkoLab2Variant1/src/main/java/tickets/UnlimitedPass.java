package tickets;

import java.util.Calendar;

public class UnlimitedPass extends SkiPass {

	
	private UnlimitedPassInterval timeInterval;


	protected UnlimitedPass() {
		this(UnlimitedPassInterval.DAILY);
	}

	protected UnlimitedPass(UnlimitedPassInterval timeInterval) {
		super();
		this.timeInterval = timeInterval;
	}



	public UnlimitedPassInterval getTimeInterval() {
		return timeInterval;
	}


	@Override
	public String getType() {
		return "Unlimited pass for " + timeInterval.getName();
	}



	@Override
	public void pass() {
	}



	public void setTimeInterval(UnlimitedPassInterval timeInterval) {
		this.timeInterval = timeInterval;
	}

	@Override
	public boolean validate() {
		//TODO
		return super.validate() && (getActivationTime() + timeInterval.getTime()
				- Calendar.getInstance().getTimeInMillis() > 0);
	}

}
