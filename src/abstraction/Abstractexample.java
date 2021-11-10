package abstraction;

public class Abstractexample {
	public static void main(String[] args) {
		HDFCBank hb = new HDFCBank();
		hb.debit();
		hb.credit();
		hb.loan();
		hb.funds();

		Bank b = new HDFCBank();
		b.debit();
		b.credit();
		b.loan();

	}
}
