

import org.junit.jupiter.api.Test;

class TestMatrix {

	@Test
	void testPrint() {
		System.out.print("Test Print");
		double[][] m = {{1,2,3}, {1,2,3}};
		Matrix matrix = new Matrix(m);
		matrix.print(10, 2);
	}
	
	@Test
	void testAdd() {
		System.out.print("Test Add");
		double[][] m = {{1,1, 1}, {1,1, 1}};
		Matrix m1 = new Matrix(m);
		Matrix m2 = new Matrix(m);
		m1 = m1.add(m2);
		m1.print(10, 2);
	}
	
	@Test
	void testTransposed() {
		System.out.print("Test Transposed");
		double[][] m = {{1,2,3}, {4,5,6}};
		Matrix matrix = new Matrix(m);
		matrix.transpose().print(10, 2);
	}
	
	@Test
	void testMultiply() {
		System.out.print("Test Multiply");
		double[][] m1 = {{3, 5}, {4, 6}};
		double[][] m2 = {{1, 3}, {2, 4}};
		Matrix matrix1 = new Matrix(m1);
		Matrix matrix2 = new Matrix(m2);
		matrix1.multiple(matrix2).print(10, 2);
	}
	
}
