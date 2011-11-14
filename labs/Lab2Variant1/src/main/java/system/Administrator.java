package system;

import java.util.List;

import tickets.SkiPass;

public class Administrator {

	public static final Administrator INSTANCE = new Administrator();

	private final SkiPassFactory skiPassFactory = SkiPassFactory.INSTANCE;

	public SkiPassFactory getFactory() {
		return skiPassFactory;
	}

	private List<SkiPass> letOutCards;

	public boolean verifyCard(SkiPass pass) {
		return letOutCards.contains(pass);
	}

	public void block(SkiPass pass) {
		pass.block();
	}

	private Administrator() {
	}
}
