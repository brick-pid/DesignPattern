
public class Matrix {
	private double[][] matrix;
	private int row;
	private int col;

//   public MyMatrix times(MyMatrix B);
//   public MyMatrix transpose();
	
	public Matrix(double[][] m) {
		this.row = m.length;
		this.col = m[0].length;
		this.matrix = new double[row][col];
		
		for(int r = 0; r < row; r++) {
			for(int c = 0; c < col; c++) {
				this.matrix[r][c] = m[r][c];
			}
		}
	}
	
	/*
	 * ������ӵĽ��������ֱ���޸ľ���
	 */
	public Matrix add(Matrix op) {
		double[][] b = op.getArray();
		if(b.length != this.row || b[0].length != this.col) {
			throw new IllegalArgumentException("Matrix Size Don't Match");
		}
		double[][] result = new double[row][col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				result[i][j] = this.matrix[i][j] + b[i][j];
			}
		}	
		
		return new Matrix(result);
	}
	
	/*
	 * ����ת�õĽ��
	 */
	public Matrix transpose() {
		double[][] transposed = new double[col][row];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				transposed[j][i] = this.matrix[i][j];
			}
		}
		return new Matrix(transposed);
	}
	
	/*
	 * ����˷���������˵Ľ��
	 */
	public Matrix multiple(Matrix op) {
		double[][] b = op.getArray();
		int colb = b[0].length;
		if(this.row != colb) {
			throw new IllegalArgumentException("M1.row should euquals M2.col");
		}
		double[][] result = new double[this.row][colb];
		for(int i = 0; i < this.row; i++) {
			for(int j = 0; j < colb; j++) {
				// ����result[i][j]: this.Matrix �ĵ�i�������b.Matrix �ĵ�j����ˣ����
				int sum = 0;
				for(int k = 0; k < this.col; k++) {
					sum += this.matrix[i][k] * b[k][j];
				}
				result[i][j] = sum;
			}
		}
		return new Matrix(result);
	}
	
	// ��ӡ����������������������һ��������ʾÿһ�еĿ�ȣ��ڶ���������ʾ������С����λ������ӡ����
    public void print(int w, int d) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.printf("%-" + w + "." + d + "f", matrix[i][j]); //"%-w.df"��ʽ���ַ������
            }
        }
        System.out.println();
    }
    
    public double[][] getArray() {
    	return this.matrix;
    }
}
