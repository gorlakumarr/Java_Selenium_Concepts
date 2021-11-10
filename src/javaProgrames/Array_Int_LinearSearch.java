package javaProgrames;

public class Array_Int_LinearSearch {

	public static void main(String[] args) {
		int a[] = { 10, 20, 40, 50, 30 };
		int searchEle = 4;
		boolean check = false;
		for (int i = 0; i < a.length; i++) {
			if (searchEle == a[i]) {
				System.out.println("Search Element Found at " + i);
				check = true;
				break;
			}
		}
		if (check == false) {
			System.out.println("Element Not Found");
		}
	}

}
