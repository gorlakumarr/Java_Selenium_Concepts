package javaProgrames;

public class Array_Exception_Examples {

	public static void main(String[] args) {

		// 1:ArrayStoreException
		Object[] stringArray = new String[5];
		stringArray[0] = "String";
//		stringArray[2] = 100;// Exception in thread "main" java.lang.ArrayStoreException: java.lang.Integer

		// 2:NegativeArraySizeException
//		int[] array = new int[-5];// Exception in thread "main" java.lang.NegativeArraySizeException: -5

		// 3:Anonymous Array : which doesnt have reference
		System.out.println(new int[] { 1, 2, 3 });

		// 4 Type

		// 2D Arrays
		int[][] twoDArray1;
		int twoDArray2[][];
		int[] twoDArray3[];

		// 3D Arrays

		int[][][] threeDArray1;
		int threeDArray2[][][];
		int[] threeDArray3[][];
		int[][] threeDArray4[];

		// 4D Arrays

		int[][][][] fourDArray1;
		int fourDArray2[][][][];
		int[] fourDArray3[][][];
		int[][] fourDArray4[][];
		int[][][] fourDArray5[];
	}
}
