package cleanCodePrinciples;

public class LSP_Square extends LSP_Rectangle {

	@Override
	public void setBreadth(int breadth) {
		super.setBreadth(breadth);
		super.setLength(breadth);
	}

	@Override
	public void setLength(int length) {
		super.setLength(length);
		super.setBreadth(length);
	}
}
