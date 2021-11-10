package javaConcepts;

public class UpCastingDownCasting {
	public static void main(String[] args) {
		Parent obj1 = new Child(); // UpCasting
		Child obj2 = (Child) obj1; // DownCasting
		obj2.money();
		if (obj1 instanceof Child) {
			Child obj21 = (Child) obj1; // DownCasting
			obj21.money();
		}
	}
}
