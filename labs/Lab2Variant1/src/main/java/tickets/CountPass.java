package tickets;

public class CountPass extends SkiPass {

	public static final Integer PASS_FOR_10_LIFTS = 10;
	public static final Integer PASS_FOR_20_LIFTS = 20;
	public static final Integer PASS_FOR_50_LIFTS = 50;
	public static final Integer PASS_FOR_100_LIFTS = 100;

	private final Integer lifts;
	private Integer liftsLeft;

	public CountPass(int lifts) {
		this.lifts = lifts;
	}

	public Integer getLifts() {
		return lifts;
	}

	public Integer getLiftsLeft() {
		return liftsLeft;
	}

	@Override
	public void pass() {
		liftsLeft--;
	}

	@Override
	public boolean validate() {
		return super.validate() && (getLiftsLeft() > 0);
	}

	@Override
	public String getCreditsLeft() {
		return "" + getLiftsLeft() + "lift"
				+ ((getLiftsLeft() % 10 == 1) ? "" : "s") + "left";
	}

}
